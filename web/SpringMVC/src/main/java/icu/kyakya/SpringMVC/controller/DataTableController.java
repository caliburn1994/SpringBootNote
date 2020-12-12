package icu.kyakya.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/datatable")
public class DataTableController {

    @RequestMapping("/index")
    public ModelAndView index(ModelMap modelMap) {

        return new ModelAndView("/page/datatable/index");
    }


    @RequestMapping("/search")
    public ModelAndView search(ModelMap modelMap) {

        return new ModelAndView();
    }
}
