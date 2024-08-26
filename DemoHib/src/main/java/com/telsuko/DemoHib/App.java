package com.telsuko.DemoHib;

import java.awt.datatransfer.SystemFlavorMap;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class App 
{
	public static void main( String[] args ) {
        AlienName an = new AlienName();
        an.setFname("Karthik");
        an.setLname("Turaka");
        an.setMname("Lakshmi");
        Alien karthik = new Alien();
       // Alien karthik =null;
        karthik.setAid(106);
        karthik.setAname(an);
        karthik.setColor("green");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg =  new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = (Transaction) session.beginTransaction();
        session.save(karthik);
        karthik = (Alien)session.get(Alien.class,106);
        tx.commit();
        System.out.println(karthik);
    }
}
