package com.zephyr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ResumeController {

    @RequestMapping("/resume")
    public ModelAndView resume() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("resume");

        return modelAndView;
    }
}
