package org.example;

import com.gaoqian.entity.People;
import com.gaoqian.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SelectAll {
    public static void main(String[] args) {
        //创建Configuration
        Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();
        //1.创建Query对象
        Query query = session.createQuery("from Student");
        //2.调用Query方法 得到结果集
        List<Student> list = query.list();
        for (Student student : list) {
            System.out.println(student
            );
        }

        session.close();
        sessionFactory.close();


    }

}
