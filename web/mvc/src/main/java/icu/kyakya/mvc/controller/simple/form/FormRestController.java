package icu.kyakya.mvc.controller.simple.form;

import icu.kyakya.mvc.model.ExampleModel;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FormRestController {

    @RequestMapping("/simple/form/ajax")
    public String index(ModelMap modelMap) {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setField1("Ajax Test");
        exampleModel.setField2(40);
        modelMap.addAttribute("example", exampleModel);
        return "simple/form/ajax";
    }

    @ResponseBody
    @RequestMapping(value = "/simple/form/ajaxAction")
    public Object ajax(@Valid ExampleModel example, BindingResult result) {
        List<String> errs = result.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        errs.forEach(System.out::println);
        return errs;
    }


    @RequestMapping("/simple/form/ajax2")
    public String index2(ModelMap modelMap) {
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setField1("Ajax Test");
        exampleModel.setField2(40);
        modelMap.addAttribute("example", exampleModel);
        return "simple/form/ajax2";
    }

    @ResponseBody
    @RequestMapping(value = "/simple/form/ajaxAction2")
    public Object ajax(@Valid ExampleModel example, ModelMap modelMap, BindingResult result) {
        System.out.println("错误用法");
        return "错误用法";
    }
}
