package com.gaoqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping("/some.do")
    public ModelAndView dosome(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","出理了some.do请求");
        mv.addObject("fun","执行dosome方法|");
        mv.getModel().put("name", "caoyc");
        mv.setViewName("/show");

        return mv;
    }
}
