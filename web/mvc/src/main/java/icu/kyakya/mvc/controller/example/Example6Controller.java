package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller("controller.example.6")
@RequestMapping("/example/6")
@Slf4j
public class Example6Controller {

    @Data
    static class MessageModel {
        String message1;
        String validationResult;

        public boolean validateMessage1(){
           return StringUtils.hasText(message1);
        }
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("Message1 is not allow null");
        messageModel.setValidationResult("Validation doesn't be executed");
        modelMap.put("messageModel", messageModel);
        return "/example/6";
    }


    @PostMapping()
    public String submit(ModelMap modelMap, @ModelAttribute("messageModel") MessageModel messageModel ) {

        String resp = Optional.of(messageModel.getMessage1())
                .filter(StringUtils::hasText)
                .map(text -> "MessageModel.message1 is: " + text)
                .orElse("Validation is passed");

        messageModel.setMessage1("MessageModel.message1 is: " + messageModel.getMessage1());
        messageModel.setValidationResult(resp);

        return "/example/6";
    }


}
