package icu.kyakya.mvc.controller.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller("controller.example.9")
@RequestMapping("/example/9")
@Slf4j
public class Example9Controller {

    @Data
    static class MessageModel {
        @NotNull
        @Size(min = 1)
        String message1;
        String validationResult;
    }

    @GetMapping()
    public String index(ModelMap modelMap) {
        MessageModel messageModel = new MessageModel();
        messageModel.setMessage1("Message1 is not allow null");
        messageModel.setValidationResult("Validation doesn't be executed");
        modelMap.put("messageModel", messageModel);
        return "/example/9";
    }


    /**
     * {@code @Valid} use to turn on validation feature
     */
    @ResponseBody
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object submit(ModelMap modelMap, @Valid @ModelAttribute("messageModel") MessageModel messageModel, BindingResult bindingResult) {
        return Optional.of(bindingResult.getAllErrors()).filter(e -> e.size() > 0)
                .map(e -> e.stream().map(objectError -> objectError.getDefaultMessage()+"").sorted().collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }


}
