package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author gq
 * @Title: DemoController
 * @ProjectName springmvc-demo
 * @Description: TODO
 * */
@Controller
@RequestMapping("/index")
public class LoginController {

    @RequestMapping("/login.do")
    public ModelAndView dologin(){

        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("date",new Date());
//        System.out.println(date);

        modelAndView.setViewName("login");
        return modelAndView;
    }
}
