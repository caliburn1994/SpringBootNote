package icu.kyakya.mvc.controller.i18n;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18n.example.1")
public class Example1Controller {

    @GetMapping("/i18n/example/1")
    public String example1(Model model, Locale locale) {
        return "/i18n/example/1";
    }

}
