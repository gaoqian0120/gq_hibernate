package com.atmsystem.controller;

import com.gaoqian.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/atm")
public class ATMSystemController {
    @RequestMapping("/main.do")
    public ModelAndView main(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("atm/main/main");
        return mv;
    }

    /**
     * 注册表单页
     */
    @RequestMapping("/goPage.do")
    public String goPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atm/register/register");
        return mv.getViewName();
    }

    /**
     * 注册
     */
    @RequestMapping("/register.do")
    public String register(String userName , String passWord){
        ModelAndView mv = new ModelAndView();
        if (userName ==null ||passWord == null){
            mv.addObject("msg","用户名或者密码为空");
        }else  {
            Session session = null;
            try {
                Configuration configuration = new Configuration().configure();

                SessionFactory sessionFactory = configuration.buildSessionFactory();
                session = sessionFactory.openSession();
                User user = new User();
                user.setUsername(userName);
                user.setPassword(passWord);
                session.save(user);
                session.beginTransaction().commit();
            } catch (HibernateException e) {
                e.printStackTrace();
            } finally {
                if (session != null) {
                    session.close();
                }
            }
        }
        mv.setViewName("atm/register/register");
        return mv.getViewName();
    }
}
