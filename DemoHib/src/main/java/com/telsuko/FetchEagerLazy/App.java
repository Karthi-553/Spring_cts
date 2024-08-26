package com.telsuko.FetchEagerLazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;




public class App {
	public static void main(String args[])
	{
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
       // ServiceRegistry reg =  new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Alien a1 = (Alien) session.get(Alien.class,1);
		
		System.out.println(a1.getAname());
		
//		This is lazy
		
//		Collection<Laptop> laps = a1.getLaps();
//		
//		
//		for(Laptop l : laps)
//		{
//			System.out.println(l);
//		}
		session.getTransaction().commit();
	}
}
