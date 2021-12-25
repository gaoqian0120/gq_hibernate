package com.gaoqian.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestBodyController {
    @RequestMapping("/body.do")
    @ResponseBody
    public String body(){
        List list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        return list.toString();
    }
}
