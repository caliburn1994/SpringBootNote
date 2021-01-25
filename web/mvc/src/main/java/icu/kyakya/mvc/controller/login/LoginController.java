package icu.kyakya.mvc.controller.login;

import icu.kyakya.mvc.model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("controller.login.LoginController")
@Slf4j
public class LoginController {


    @GetMapping("/login")
    public String index(ModelMap modelMap) {
        return "login";
    }

    @PostMapping(value = "/login",produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(UserModel userModel) {
        return "login";
    }
}
