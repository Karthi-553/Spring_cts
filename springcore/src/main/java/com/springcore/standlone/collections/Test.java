package com.springcore.standlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		   ApplicationContext con =  new ClassPathXmlApplicationContext("com/springcore/standlone/collections/standalone-config.xml");
		   Person p1 = (Person) con.getBean("person1");
		   Person p2 = (Person) con.getBean("person2");
		   System.out.println(p1);
		   System.out.println(p1.getFriends().getClass().getName());
		   System.out.println("------------------------------------------------");
		   System.out.println(p2);
		   System.out.println(p2.getFeestructure().getClass().getName());
	}   
}
