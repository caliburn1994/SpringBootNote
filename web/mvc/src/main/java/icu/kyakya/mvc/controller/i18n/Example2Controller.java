package icu.kyakya.mvc.controller.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller("i18n.example.2")
public class Example2Controller {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/i18n/example/2")
    public String example2(Model model, Locale locale) {
        String hello = messageSource.getMessage("hello", new String[]{}, locale);
        model.addAttribute("hello", hello);
        return "/i18n/example/2";
    }

}
