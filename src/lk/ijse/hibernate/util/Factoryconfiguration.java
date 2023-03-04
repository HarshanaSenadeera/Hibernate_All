package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconfiguration {

    private static Factoryconfiguration factoryconfiguration;

    private SessionFactory sessionFactory;

    private Factoryconfiguration(){

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Factoryconfiguration getInstance(){
        return factoryconfiguration==null ? factoryconfiguration=new Factoryconfiguration()
                :factoryconfiguration;
    }

    public Session session(){
        return sessionFactory.openSession();
    }

}
