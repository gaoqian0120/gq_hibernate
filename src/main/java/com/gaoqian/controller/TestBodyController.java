package com.gaoqian.controller;


import com.gaoqian.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
    @RequestMapping("/student.do")
    @ResponseBody
    public String student(String tableName){
        //创建Configuration
        Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();
        //1.创建Query对象
        Query query = session.createQuery("from "+tableName);
        //2.调用Query方法 得到结果集
        List list = query.list();
      /*  for (Student student : list) {
            System.out.println(student);
        }*/

        session.close();
        sessionFactory.close();

        return list.toString();
    }
}
