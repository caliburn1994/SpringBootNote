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
     * @param modelMap modelMap包含了  commonModelAttribute()和exampleModel()的数据，
     *                 但是由于form提交了一个ExampleModel，所以覆盖了和exampleModel()的ExampleModel
     *                 '@Valid' 用于启动校验器
     * @param result 用于处理校验器结果以及错误 todo
     */
    @PostMapping("/submit")
    public String submit(ModelMap modelMap, @Valid @ModelAttribute("example") ExampleModel example, BindingResult result) {
        log.info("提交后，将返回信息到index,并打印出来");

        log.info("ModelMap拥有以下内容:");
        modelMap.forEach((k, v) -> {
            log.info("[key]:{} [value]:{}", k, v);
        });

        result.getAllErrors().forEach(err->log.warn(err.getDefaultMessage()));

        return "redirect:/example/index"; //todo
    }

    //todo 会话


}
