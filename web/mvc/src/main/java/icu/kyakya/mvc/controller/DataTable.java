package icu.kyakya.mvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import icu.kyakya.mvc.model.Page;
import icu.kyakya.orm.mybatis.service.UserService;
import icu.kyakya.orm.mybatis.domain.User;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * http://localhost:8888/datatable/example1
 * http://localhost:8888/datatable/example2
 */
@Controller
@RequestMapping("/datatable")
@XSlf4j
public class DataTable {

    final UserService userService;

    public DataTable(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView staticPage(@PathVariable String name) {
        return new ModelAndView("static/datatable/" + name);
    }

    /**
     *
     * ref: https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
     */
    @ResponseBody
    @RequestMapping(value = "/example2_data") //produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Page<User> example2(Model model) throws JsonProcessingException {
        List<User> users = userService.selectAllOrInit();

        //https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
        return new Page<>(users);
    }

    @ModelAttribute
    public void commonModelAttribute(ModelMap modelMap) {
        // for render
    }
}
