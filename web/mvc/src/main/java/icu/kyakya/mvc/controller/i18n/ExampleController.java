package icu.kyakya.mvc.controller.i18n;

import icu.kyakya.mvc.model.ExampleModel;
import icu.kyakya.mvc.model.i18n.I18nModel;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * https://spring.io/guides/gs/testing-web/
 */
@Controller("i18n.example")
@RequestMapping("/i18n")
public class ExampleController {

    @RequestMapping("/index")
    public String page(Model model) {
        model.addAttribute("example", new I18nModel());
        return "/i18n/example-1";
    }

    @RequestMapping(value = "/validate")
    public String validate1(@Valid @ModelAttribute("example") I18nModel i18nModel, ModelMap modelMap
            , BindingResult result) {
        String resp = Optional.of(result.getAllErrors()).filter(errs->errs.size()>0).map(
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
        String resp = Optional.of(result.getAllErrors()).filter(errs->errs.size()>0).map(
                (errs) -> {
                    List<String> list = errs.stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
                    return String.join(",", list);
                }
        ).orElse("Data passed validation");
        return resp;
    }

}
