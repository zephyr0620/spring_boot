package com.zephyr.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zephyr.client.VO.RegisterVO;
import com.zephyr.common.TopResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
    public ModelAndView delform(@Valid RegisterVO registerVO,BindingResult result) {

        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getDefaultMessage());
            }
            return null;
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("time", new Date());
        modelAndView.addObject("user",registerVO);
        modelAndView.setViewName("register_result");

        return modelAndView;
    }

    @RequestMapping("/json")
    @ResponseBody
    public Object json() {
        Map map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        TopResult topResult = TopResult.success(map);

        return topResult;
    }
}
