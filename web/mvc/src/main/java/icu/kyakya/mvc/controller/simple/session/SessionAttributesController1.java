package icu.kyakya.mvc.controller.simple.session;

import icu.kyakya.mvc.model.session.SessionModel;
import org.springframework.boot.Banner;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.stream.Collectors;

@Controller("controller.session.example1")
@SessionAttributes("sessionModel")
public class SessionAttributesController1 {

    @ModelAttribute("sessionModel")
    public SessionModel getSessionModel(Model model) {
        return new SessionModel();
    }

    @GetMapping(value = "/session/count", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    @ResponseBody
    public String index(Model model, HttpSession httpSession, @ModelAttribute("sessionModel") SessionModel sessionModel) {
        var rsl = new StringJoiner("\n");

        // print content of session
        Optional.ofNullable(Collections.list(httpSession.getAttributeNames())).filter(e->e.size()>0)
                .ifPresentOrElse(
                        (e) -> e.forEach(entry -> rsl.add(httpSession.getAttribute(entry).toString())),
                        () -> rsl.add("HttpSession 未添加 sessionModel"));


        // op
        sessionModel.count++;

        return rsl.toString();
    }
}
