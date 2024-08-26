package com.telusko.Caching;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class App {
	public static void main(String args[])
	{
		AlienNew a = new AlienNew();
		
//	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//	 ServiceRegistry reg =  new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	
		Configuration con = new Configuration().configure().addAnnotatedClass(AlienNew.class);
        ServiceRegistry reg =  new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
		Session session1 = sf.openSession();
		
		session1.beginTransaction();
		
//		a = (AlienNew) session1.get( AlienNew.class,101);
		Query q1 = (Query) session1.createQuery("from AlienNew where aid=101");
		q1.setCacheable(true);
		a=(AlienNew)q1.uniqueResult();
		//System.out.println(a.getAname());
		System.out.println(a);  
		session1.getTransaction().commit();
		session1.close();          
		
        Session session2 = sf.openSession();
		
		session2.beginTransaction();
		
//		a = (AlienNew) session2.get( AlienNew.class,101);
		Query q2 = (Query) session2.createQuery("from AlienNew where aid=101");
		q2.setCacheable(true);
		a=(AlienNew)q2.uniqueResult();
		
		System.out.println(a); 
		
		session2.getTransaction().commit();
		session2.close();
	}
}
