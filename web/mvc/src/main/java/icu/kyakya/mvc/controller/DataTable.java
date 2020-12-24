package icu.kyakya.mvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import icu.kyakya.mvc.model.Page;
import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.service.UserService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/datatable")
@XSlf4j
public class DataTable {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView staticPage(@PathVariable String name) {
        return new ModelAndView("datatable/" + name);
    }


    @Autowired
    UserService userService;

    /**
     * ref: https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
     */
    @ResponseBody
    @RequestMapping(value = "/example2_data") //produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Page<User> example2(Model model) throws JsonProcessingException {
        List<User> users = userService.selectAllOrInit();


        //https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
        return new Page<>(users);
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
    public void commonModelAttribute(ModelMap modelMap) {
        //todo 若干个controller共同的ModelAttribute，此处存储静态信息。
    }
}
