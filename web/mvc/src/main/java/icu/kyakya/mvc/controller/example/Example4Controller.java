package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("controller.example.4")
@RequestMapping("/example/4")
@Slf4j
public class Example4Controller {

    @Data
    static class MessageModel {
        String message1;
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        log.debug("Solving request...");
        return "/example/4";
    }


    @ModelAttribute
    public void renderAllRequests(ModelMap modelMap) {
        log.debug("Rendering...");
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("MessageModel.message1 is not null");
        modelMap.addAttribute("messageModel", messageModel);
    }
}
