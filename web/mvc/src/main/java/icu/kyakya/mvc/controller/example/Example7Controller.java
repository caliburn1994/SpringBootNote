package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("controller.example.7")
@Slf4j
public class Example7Controller {

    @Data
    static class MessageModel {
        String message1;
    }

    @GetMapping("/example/7")
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("Send a request of HTML page.");
        modelMap.put("messageModel", messageModel);
        return "/example/7";
    }


    @PostMapping("/example/7")
    public String submit(ModelMap modelMap, @ModelAttribute("messageModel") MessageModel messageModel, RedirectAttributes redirectAttributes) {
        messageModel.setMessage1("Submit a form.");
        redirectAttributes.addFlashAttribute("messageModel", messageModel);
        return "redirect:/example/7_2";
    }


    @GetMapping("/example/7_2")
    public String redirect(ModelMap modelMap, @ModelAttribute("messageModel") MessageModel messageModel) {
        messageModel.setMessage1(messageModel.getMessage1() + "==> redirect a Request.");
        modelMap.put("messageModel", messageModel);
        return "/example/7";
    }


}
