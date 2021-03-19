package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller("controller.example.5")
@RequestMapping("/example/5")
@Slf4j
public class Example5Controller {

    @Data
    static class MessageModel {
        @NotNull
        @Size(min =1)
        String message1;
        String validationResult;
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("Message1 is not allow null");
        messageModel.setValidationResult("Validation doesn't be executed");
        modelMap.put("messageModel", messageModel);


        return "/example/5";
    }


    /**
     * {@code @Valid} use to turn on validation feature
     */
    @PostMapping()
    public String submit(ModelMap modelMap, @Valid @ModelAttribute("messageModel") MessageModel messageModel, BindingResult bindingResult) {

        //validation
        String resp = Optional.of(bindingResult.getAllErrors()).filter(errs -> errs.size() > 0).map(
                (errs) -> {
                    List<String> list = errs.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
                    return String.join(",", list);
                }
        ).orElse("Validation is passed");
        messageModel.setMessage1("MessageModel.message1 is: " + messageModel.getMessage1());
        messageModel.setValidationResult(resp);

        return "/example/5";
    }


}
