package icu.kyakya.mvc.controller.simple.session;

import icu.kyakya.mvc.model.session.SessionModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Optional;
import java.util.StringJoiner;

@Controller("controller.session.SessionAttributes.example")
@SessionAttributes("sessionModel")
public class SessionAttributesController {

    @ModelAttribute("sessionModel")
    public SessionModel getSessionModel(Model model) {
        return new SessionModel();
    }

    @GetMapping(value = "/session/count", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    @ResponseBody
    public String index(Model model, HttpSession httpSession, @ModelAttribute("sessionModel") SessionModel sessionModel) {
        var rsl = new StringJoiner("\n");

        // print content of session
        Optional.of(Collections.list(httpSession.getAttributeNames())).filter(e->e.size()>0)
                .ifPresentOrElse(
                        (e) -> e.forEach(entry -> rsl.add(httpSession.getAttribute(entry).toString())),
                        () -> rsl.add("nothing in HttpSession"));


        // op
        sessionModel.count++;

        return rsl.toString();
    }
}
