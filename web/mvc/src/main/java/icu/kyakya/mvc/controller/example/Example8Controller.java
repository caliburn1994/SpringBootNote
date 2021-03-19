package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("controller.example.8")
@Slf4j
public class Example8Controller {

    @Data
    static class MessageModel {
        String message1;
    }

    @GetMapping("/example/8")
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("Send a request of HTML page.");
        modelMap.put("messageModel", messageModel);
        return "/example/8";
    }


    @PostMapping("/example/8")
    public String submit(ModelMap modelMap, @ModelAttribute("messageModel") MessageModel messageModel, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("message", "Submit a form.");
        return "redirect:/example/8_2";
    }


    @GetMapping("/example/8_2")
    public String redirect(ModelMap modelMap, @ModelAttribute("message") String message) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1(message + "==> redirect a Request.");
        modelMap.put("messageModel", messageModel);
        return "/example/8";
    }


}
