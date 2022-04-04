package org.example;

import com.gaoqian.entity.AA;
import com.gaoqian.entity.Dept;
import com.gaoqian.entity.Emp;
import com.gaoqian.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
//        System.out.println(configuration);
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取session
        Session session = sessionFactory.openSession();
        Student student = new Student();
        student.setSno("s221");
        student.setSname("张");
        student.setSage(18);
        student.setSsex("男");
        session.save(student);
       /* Emp emp = new Emp();
        emp.setEmpno(100);
        emp.setEname("gaoqian");
        emp.setJob("chengxuyuan");
        emp.setMgr(50);
        emp.setSal(1);
        emp.setComm(100);
        emp.setDeptno(80);*/
     /*   Dept dept = new Dept();
        dept.setDeptno(60);
        dept.setDname("qian");
        dept.setLoc("gao");*/
        /*AA aa = new AA();
        aa.setA("222");*/
        session.beginTransaction().commit();
        session.close();
    }
}
