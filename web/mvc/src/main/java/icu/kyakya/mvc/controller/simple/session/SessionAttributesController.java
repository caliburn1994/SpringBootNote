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

@Controller("controller.session.SessionAttributes.example")
@SessionAttributes("sessionModel")
public class SessionAttributesController {

    @ModelAttribute("sessionModel")
    public SessionModel getSessionModel(Model model) {
        return new SessionModel();
    }

    @GetMapping(value = "/session/example/2", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String index(Model model, HttpSession httpSession, @ModelAttribute("sessionModel") SessionModel sessionModel) {
        // op
        sessionModel.count++;

        return sessionModel+"";
    }
}
