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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
     * @param modelMap           modelMap包含了  commonModelAttribute()和exampleModel()的数据，
     *                           但是由于form提交了一个ExampleModel，所以覆盖了和exampleModel()的ExampleModel
     *                           '@Valid' 用于启动校验器
     * @param bindingResult      用于处理校验器结果以及错误
     *                           官方示例： https://spring.io/guides/gs/validating-form-input/
     *                           转发错误，或者在页面展示错误： https://stackoverflow.com/questions/15778913/spring-mvc-how-to-redirect-to-a-page-with-error
     * @param redirectAttributes 用于转发数据。
     *                           addFlashAttribute()将可存储对象，数据将会被存在session中，数据仅存活一个request。
     *                           addAttribute()将以为 request parameters形式存储数据，如果使用的是get，则将在url中添加 ?key=value&&key=value
     *                           ref: https://stackoverflow.com/questions/14470111/spring-redirectattributes-addattribute-vs-addflashattribute
     *                           <p>
     *                           官方示例： https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/mvc/support/RedirectAttributes.html
     */
    @PostMapping()
    public String submit(ModelMap modelMap, @Valid @ModelAttribute("messageModel") MessageModel messageModel
            , BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("[submit] 获得数据");

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
        //redirect:
    }


}
