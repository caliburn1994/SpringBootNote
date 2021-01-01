package icu.kyakya.mvc.controller.simple.form;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("simpe.form.FormController")
@RequestMapping("/simple/form")
public class FormController {

    /**
     * http://localhost:8888/simple/form/test?clear
     */
    @GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8", params = "clear")
    @ResponseBody
    public String clear(ModelMap modelMap) {

        //  页面处理

        // 渲染

        return "清除按钮";
    }


    /**
     * http://localhost:8888/simple/form/test?submit
     */
    @GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8", params = "submit")
    @ResponseBody
    public String submit(ModelMap modelMap) {

        //  页面处理

        // 渲染

        return "提交按钮";
    }


    /**
     * http://localhost:8888/simple/form/test?id=1
     */
    @GetMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8", params = "id")
    @ResponseBody
    public String id(ModelMap modelMap, @RequestParam("id") String id) {

        //  页面处理

        // 渲染

        return "id=" + id;
    }
}
