package com.gaoqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author lyj
 * @Title: DemoController
 * @ProjectName springmvc-demo
 * @Description: TODO
 * */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello.do")
    public ModelAndView handle01(){
        Date date=new Date();

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("date",date);
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
