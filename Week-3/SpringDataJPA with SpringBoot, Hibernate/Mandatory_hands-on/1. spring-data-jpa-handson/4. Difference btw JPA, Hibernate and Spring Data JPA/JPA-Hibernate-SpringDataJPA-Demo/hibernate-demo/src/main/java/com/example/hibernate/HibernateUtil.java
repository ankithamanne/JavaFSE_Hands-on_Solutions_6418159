package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public static Integer addEmployee(Employee emp) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer id = null;

        try {
            tx = session.beginTransaction();
            id = (Integer) session.save(emp);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return id;
    }
}
