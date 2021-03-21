package icu.kyakya.mvc.controller.error.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
public class ErrorExampleController {

    @GetMapping(value = "/exceptions/example/1")
    public String error1(Model model) throws Exception {
        int arr[] = new int[5];
        arr[9] = 250;
        return "/exceptions/example/1";
    }


    @GetMapping(value = "/exceptions/example/2")
    public String error2(Model model) throws SQLException {
        if (model != null) {
            throw new SQLException("SQLException happens!");
        }
        return "/exceptions/example/2";
    }

    @GetMapping(value = "/exceptions/example/ajax404")
    public String ajax404(Model model) throws SQLException {
        return "/exceptions/example/ajax404";
    }
}