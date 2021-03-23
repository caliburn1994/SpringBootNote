package icu.kyakya.mvc.controller.simple.session;

import icu.kyakya.mvc.model.session.SessionModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller("controller.session.httpSession.example")
@Slf4j
public class HttpSessionController {

    @GetMapping("/session/example/1")
    @ResponseBody
    public String index(HttpSession httpSession) {
        // create
        SessionModel sessionModel = (SessionModel) Optional.ofNullable(httpSession.getAttribute("sessionModel"))
                .orElseGet(()->{
                    SessionModel s = new SessionModel();
                    httpSession.setAttribute("sessionModel",s);
                    return s;
                });

        // op
        sessionModel.count = sessionModel.count + 1;

        // response
        return sessionModel + "";
    }
}
