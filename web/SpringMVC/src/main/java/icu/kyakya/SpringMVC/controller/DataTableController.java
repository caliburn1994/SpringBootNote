package icu.kyakya.SpringMVC.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import icu.kyakya.SpringMVC.model.Page;
import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.service.UserService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/datatable")
@XSlf4j
public class DataTableController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView staticPage(@PathVariable String name) {
        log.entry("/datatable/", name);
        return new ModelAndView("datatable/" + name);
    }


    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/example2_data") //produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Page<User> example2(Model model) throws JsonProcessingException {
        List<User> list = new ArrayList<>();
        IntStream.range(0, 30).forEach(i -> {
            User user = new User();
            user.setName("user" + i);
            user.setGender("xx");
            user.setHeight(180 - i);
            user.setCreateTime(new Date());
            list.add(user);
        });

        //https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
        return new Page<>(list);
//        ObjectMapper mapper = new ObjectMapper();
//        model.addAttribute("employeeList", mapper.writeValueAsString(list));
    }

//    @RequestMapping("/index")
//    public ModelAndView index(ModelMap modelMap) {
//        return new ModelAndView("/page/datatable/index");
//    }

//    @RequestMapping("/search")
//    public ModelAndView search(ModelMap modelMap) {
//
//        return new ModelAndView();
//    }

    @ModelAttribute
    public void commonModelAttribute(ModelMap modelMap){
        //todo 若干个controller共同的ModelAttribute，此处存储静态信息。
    }
}
