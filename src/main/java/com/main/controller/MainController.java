package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/main.do")
    public ModelAndView dologin(){

        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("date",new Date());
//        System.out.println(date);

        modelAndView.setViewName("main/Main");
        return modelAndView;
    }
}
