package com.zephyr.web;

import com.zephyr.client.VO.RegisterVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public ModelAndView home() {

        ModelAndView modelAndView = new ModelAndView();
        /*Map<String, Object> model = new HashMap<String, Object>();
        model.put("time", new Date());
        model.put("message", "圣诞节快乐！");
        model.put("toUserName", "刘女士");
        model.put("fromUserName", "老姚");
        modelAndView.addAllObjects(model);*/
        modelAndView.setViewName("test");

        return modelAndView;
    }

    @RequestMapping("/form")
    public ModelAndView form() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("form");

        return modelAndView;
    }

    @RequestMapping(value = "/delForm",method = RequestMethod.POST)
    public ModelAndView delform(@ModelAttribute RegisterVO registerVO) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("time", new Date());
        modelAndView.addObject("user",registerVO);
        modelAndView.setViewName("register_result");

        return modelAndView;
    }
}
