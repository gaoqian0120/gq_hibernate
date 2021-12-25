package org.example;

import com.gaoqian.entity.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        //创建Configuration
        Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        People people = new People();
        people.setName("张");
        people.setMoney(1000.0);
        session.save(people);
        session.beginTransaction().commit();
        session.close();
    }
}
