package icu.kyakya.mvc.controller.i18n;

import lombok.Data;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18n.example")
public class ExampleController {

    @Data
    static class I18nModel {

        String validationMsg;

        @Email
        String email;
    }


    @GetMapping("/i18n/index")
    public String page(Model model) {
        model.addAttribute("i18nModel", new I18nModel());
        return "/i18n/example-1";
    }

    @PostMapping(value = "/i18n/validate")
    public String validate1(ModelMap modelMap, @Valid @ModelAttribute("i18nModel") I18nModel i18nModel, BindingResult result) {
        String resp = Optional.of(result.getAllErrors()).filter(errs -> errs.size() > 0).map(
                (errs) -> {
                    List<String> list = errs.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
                    return String.join(",", list);
                }
        ).orElse("The form was submitted successfully and data passed validation ");

        i18nModel.setValidationMsg(resp);
        return "/i18n/example-1";
    }

    @ResponseBody
    @RequestMapping(value = "/validate2", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    public String validate2(@Valid I18nModel i18nModel, BindingResult result) {
        String resp = Optional.of(result.getAllErrors()).filter(errs -> errs.size() > 0).map(
                (errs) -> {
                    List<String> list = errs.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
                    return String.join(",", list);
                }
        ).orElse("Data passed validation");
        return resp;
    }

}
