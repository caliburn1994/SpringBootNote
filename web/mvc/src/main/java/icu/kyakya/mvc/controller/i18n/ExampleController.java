package icu.kyakya.mvc.controller.i18n;

import icu.kyakya.mvc.model.i18n.I18nModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18n.example")
@RequestMapping("/i18n")
public class ExampleController {

    @RequestMapping("/index")
    public String page(Model model){
        model.addAttribute("example",new I18nModel());
        return "/i18n/index";
    }

    @ResponseBody
    @RequestMapping(value = "/validate",produces = MediaType.TEXT_PLAIN_VALUE+";charset=UTF-8")
    public String validate(@Valid I18nModel i18nModel, BindingResult result){
        return result.getAllErrors().get(0).getDefaultMessage();
    }



}
