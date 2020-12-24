package icu.kyakya.mvc.controller;

import icu.kyakya.mvc.model.ExampleModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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
     * @param bindingResult      用于处理校验器结果以及错误
     *                           官方示例： https://spring.io/guides/gs/validating-form-input/
     *                           转发错误，或者在页面展示错误： https://stackoverflow.com/questions/15778913/spring-mvc-how-to-redirect-to-a-page-with-error
     *
     * @param redirectAttributes 用于转发数据。
     *                           addFlashAttribute()将可存储对象，数据将会被存在session中，数据仅存活一个request。
     *                           addAttribute()将以为 request parameters形式存储数据，如果使用的是get，则将在url中添加 ?key=value&&key=value
     *                           ref: https://stackoverflow.com/questions/14470111/spring-redirectattributes-addattribute-vs-addflashattribute
     *
     *                           官方示例： https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/mvc/support/RedirectAttributes.html
     */
    @PostMapping("/submit")
    public String submit(ModelMap modelMap, @Valid @ModelAttribute("example") ExampleModel example
            , BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("[submit] 获得数据");
        printModelMap(modelMap);

        //validation
        bindingResult.getAllErrors().forEach(err -> log.warn(err.getDefaultMessage()));

        // controller业务逻辑
        example.setField1("修改了数据");

        // 将数据提交给另一个controller
        redirectAttributes.addFlashAttribute("example",example);
        return "redirect:/example/index2";
    }

    @GetMapping("/index2")
    public String index2(ModelMap modelMap, @ModelAttribute("example") ExampleModel example) {
        log.info("[index2] 获得跳转数据，将进行打印");
        printModelMap(modelMap);

        // 页面处理

        // 渲染
        return "example/index";
    }


    @PostMapping(value = "/submit",params = {"redirect"})
    public String redirectExample( @ModelAttribute("example") ExampleModel example, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        log.info("[跳转按钮]");

        redirectAttributes.addAttribute("testAddAttribute", "哈哈哈");
        return "redirect:/example/index3";
    }

    /**
     * @param msg 获得request的 parameter
     * @return
     */
    @GetMapping("/index3")
    public String index3(ModelMap modelMap, @ModelAttribute("example") ExampleModel example, @RequestParam("testAddAttribute") String msg) {
        log.info("[index2] 获得跳转数据，将进行打印");
        printModelMap(modelMap);
        log.info("testAddAttribute: {}",msg);


        //  页面处理

        // 渲染
        return "example/index";
    }





    //todo 会话
    // todo escape html?

    private void printModelMap(ModelMap modelMap) {
        log.info("ModelMap拥有以下内容:");
        modelMap.forEach((k, v) -> log.info("[key]:{} [value]:{}", k, v));
    }

}
