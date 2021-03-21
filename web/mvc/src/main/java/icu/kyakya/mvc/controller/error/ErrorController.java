package icu.kyakya.mvc.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping(value = "/error/1")
    public String error(Model model) throws Exception {
//        if (model != null) {
//            throw new Exception();
//        }
        int arr[] = new int[5];
        arr[9] = 250;


        return "/error/1";
    }

}