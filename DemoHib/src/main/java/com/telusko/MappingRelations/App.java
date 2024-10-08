package com.telusko.MappingRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class App {
	public static void main(String args[])
	{
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student student = new Student();
		student.setRollno(1);
		student.setName("Karthik");
		student.setMarks(90);
		student.getLaptop().add(laptop);
		
		
		laptop.getStudents().add(student);
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(registry);
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(laptop);
		session.save(student);
		session.getTransaction().commit();
	}
}
