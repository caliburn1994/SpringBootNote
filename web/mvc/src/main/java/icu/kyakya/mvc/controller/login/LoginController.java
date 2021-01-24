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
    public String index(ModelMap modelMap) { // <-- ModelMap将自动传入 exampleModel() 和 commonModelAttribute(ModelMap modelMap) 数值
        modelMap.addAttribute("message", "初始化数据");
        return "login";
    }

    @PostMapping(value = "/login",produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(UserModel userModel) {

        return "login";
    }
}
