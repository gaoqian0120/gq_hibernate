package org.example;

import com.gaoqian.entity.AA;
import com.gaoqian.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
//        System.out.println(configuration);
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取session
//        Session session = sessionFactory.getCurrentSession();
        Session currentSession = sessionFactory.getCurrentSession();
        Student student = new Student();
        student.setSno("s400");
        student.setSname("王七");
        student.setSage(19);
        student.setSsex("男");
        currentSession.save(student);
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
       /* try {
            session.beginTransaction();
            AA aa = new AA("121212");
            session.save(aa);
//        aa.setA("565");
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }*/
      /* AA aa = new AA();
        aa.setA("aa");*/
        //   session.save();
        currentSession.close();
    }
}
