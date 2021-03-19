package icu.kyakya.mvc.controller.example;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("controller.example.3")
@RequestMapping("/example/3")
public class Example3Controller {

    @Data
    static class MessageModel {
        String message1;
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        return "/example/3";
    }


    @ModelAttribute("messageModel")
    public MessageModel exampleModel() {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("MessageModel.message1 is not null");
        return messageModel;
    }
}
