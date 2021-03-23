package icu.kyakya.mvc.controller.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("controller.example.1")
@RequestMapping("/example/1")
public class Example1Controller {

    /**
     * https://www.baeldung.com/spring-mvc-model-model-map-model-view
     * index(ModelMap modelMap) == index(Model model)
     */
    @GetMapping()
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("message", "Message is empty.");
        return "/example/1";
    }

    @PostMapping()
    public String submit(ModelMap modelMap, @RequestParam("message") String message) {
        modelMap.addAttribute("message", "Message is: " + message);
        return "/example/1";
    }


}
