package icu.kyakya.mvc.controller.i18n;

import icu.kyakya.mvc.model.i18n.ExampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Locale;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18n.example")
@RequestMapping("/i18n")
public class ExampleController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/index")
    public String page(Model model){
        model.addAttribute("example",new ExampleModel());
        return "/i18n/index";
    }

    @ResponseBody
    @RequestMapping(value = "/validate",produces = MediaType.TEXT_PLAIN_VALUE+";charset=UTF-8")
    public String validate(@Valid ExampleModel exampleModel, BindingResult result){
        return result.getAllErrors().get(0).getDefaultMessage();
    }



}
