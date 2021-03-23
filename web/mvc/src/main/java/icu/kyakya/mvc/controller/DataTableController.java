package icu.kyakya.mvc.controller;

import icu.kyakya.mvc.model.Page;
import icu.kyakya.orm.mybatis.domain.Users;
import icu.kyakya.orm.mybatis.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/datatable")
public class DataTableController {

    final UsersService usersService;

    public DataTableController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ModelAndView staticPage(@PathVariable String name) {
        return new ModelAndView("datatable/" + name);
    }

    /**
     *
     * ref: https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
     */
    @ResponseBody
    @RequestMapping(value = "/example2_data")
    public Page<Users> example2(Model model) {
        List<Users> users = usersService.selectAll();
        //https://frontbackend.com/thymeleaf/spring-boot-bootstrap-thymeleaf-datatable
        return new Page<>(users);
    }

    @ModelAttribute
    public void commonModelAttribute(ModelMap modelMap) {
        // for render
    }
}
