package org.example;

import com.gaoqian.entity.Student;
import com.gaoqian.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestUser {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        User user = new User();
        user.setUsername("root");
        user.setPassword("123456");
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }
}
