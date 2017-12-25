package com.zephyr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
