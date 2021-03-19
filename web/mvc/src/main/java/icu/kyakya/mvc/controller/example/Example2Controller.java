package icu.kyakya.mvc.controller.example;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("controller.example.2")
@RequestMapping("/example/2")
public class Example2Controller {

    @Data
    static class MessageModel {
        String message1;
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("MessageModel.message1 is empty");
        modelMap.addAttribute("messageModel", messageModel);
        return "example/2";
    }

    @PostMapping()
    public String submit(ModelMap modelMap, MessageModel messageModel) {
        messageModel.setMessage1("MessageModel.message1 is: " + messageModel.getMessage1());
        return "example/2";
    }

//    @ModelAttribute("example")
//    public ExampleModel exampleModel() {
//        ExampleModel exampleModel = new ExampleModel();
//        exampleModel.setField1("页面初始化时，我传入了一个数据");
//        return exampleModel;
//    }
}
