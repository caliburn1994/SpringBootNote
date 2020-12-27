package icu.kyakya.mvc.controller.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18nExample")
@RequestMapping("/i18n")
public class Example {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/index")
    public String page(){
        return "/i18n/index";
    }

    @ResponseBody
    @RequestMapping(value = "/echo",produces = MediaType.TEXT_PLAIN_VALUE+";charset=UTF-8")
    public String echoJa(Model model){
        return messageSource.getMessage("hello", null, Locale.JAPANESE);
    }

}
