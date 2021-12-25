package org.example;

import com.gaoqian.entity.Emp;
import com.gaoqian.entity.People;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

public class SelectTest {
    public static void main(String[] args) {
      Configuration configuration = new Configuration().configure();
      SessionFactory sessionFactory =configuration.buildSessionFactory();
      Session session = sessionFactory.openSession();

      String hql = "from Emp";
        Query query = session.createQuery(hql);
        List<Emp> list = query.list();
         for(Emp emp:list){
             System.out.println(emp);
         }
         session.close();
    }


}