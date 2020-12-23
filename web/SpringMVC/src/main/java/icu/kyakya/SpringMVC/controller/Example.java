package icu.kyakya.SpringMVC.controller;

import icu.kyakya.SpringMVC.model.ExampleModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/example")
@Slf4j
public class Example {

    /**
     * Model和ModelMap的用法基本一样，没必要去纠结用哪个
     */
    @GetMapping("/index")
    public String index(ModelMap modelMap) { // <-- ModelMap将自动传入 exampleModel() 和 commonModelAttribute(ModelMap modelMap) 数值
        modelMap.addAttribute("message", "初始化数据");
        return "example/index";
    }

    @ModelAttribute("example")
    public ExampleModel exampleModel() {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setField1("页面初始化时，我传入了一个数据");
        return exampleModel;
    }

    @ModelAttribute
    public void commonModelAttribute(ModelMap modelMap) {
        modelMap.addAttribute("message2", "每个controller都将传入该变量");
    }


    /**
     * @param modelMap           modelMap包含了  commonModelAttribute()和exampleModel()的数据，
     *                           但是由于form提交了一个ExampleModel，所以覆盖了和exampleModel()的ExampleModel
     *                           '@Valid' 用于启动校验器
     * @param bindingResult      用于处理校验器结果以及错误 todo
     * @param redirectAttributes 用于转发数据。
     *                           addFlashAttribute()将可存储对象，数据将会被存在session中，数据仅存活一个request。
     *                           addAttribute()将以为 request parameters形式存储数据，如果使用的是get，则将在url中添加 ?key=value&&key=value
     *                           ref: https://stackoverflow.com/questions/14470111/spring-redirectattributes-addattribute-vs-addflashattribute
     */
    @PostMapping("/submit")
    public String submit(ModelMap modelMap, @Valid @ModelAttribute("example") ExampleModel example
            , BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("提交后，将返回信息到index,并打印出来");

        printModelMap(modelMap);

        bindingResult.getAllErrors().forEach(err -> log.warn(err.getDefaultMessage()));

        redirectAttributes.addFlashAttribute(example);
        return "redirect:/example/index2";
    }


    @GetMapping("/index2")
    public String index2(ModelMap modelMap, @ModelAttribute("example") ExampleModel example) {
        log.info("已转发至 /example/index2");
        printModelMap(modelMap);
        return "example/index";
    }


    //todo 会话
    // todo escape html?

    private void printModelMap(ModelMap modelMap) {
        log.info("ModelMap拥有以下内容:");
        modelMap.forEach((k, v) -> log.info("[key]:{} [value]:{}", k, v));
    }

}
