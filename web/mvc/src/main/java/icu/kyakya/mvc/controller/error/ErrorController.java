package icu.kyakya.mvc.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
public class ErrorController {

    @GetMapping(value = "/error/1")
    public String error1(Model model) throws Exception {
        int arr[] = new int[5];
        arr[9] = 250;
        return "/error/1";
    }


    @GetMapping(value = "/error/2")
    public String error2(Model model) throws SQLException {
        if (model != null) {
            throw new SQLException("SQLException happens!");
        }
        return "/error/2";
    }
}