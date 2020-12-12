package icu.kyakya.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/datatable")
public class DataTableController {

//    @RequestMapping("/index")
//    public ModelAndView index(ModelMap modelMap) {
//        return new ModelAndView("/page/datatable/index");
//    }

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public ModelAndView adminPage(@PathVariable String name){
        return new ModelAndView("datatable/" + name);
    }

//    @RequestMapping("/search")
//    public ModelAndView search(ModelMap modelMap) {
//
//        return new ModelAndView();
//    }
}
