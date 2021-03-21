package icu.kyakya.mvc.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController {

    @GetMapping("/404")
    public String page404(Model model, HttpServletRequest req, Exception ex) {
        return "/exceptions/404";
    }

    @GetMapping("/500")
    public String page500(Model model, HttpServletRequest req, Exception ex) {
        return "/exceptions/500";
    }
}
