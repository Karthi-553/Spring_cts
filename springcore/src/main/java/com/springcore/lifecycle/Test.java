package com.springcore.lifecycle;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	  //  Samosa sam = (Samosa)con.getBean("s1");
		//System.out.println(sam);
		//registering shutdown hook it is in AbstractApplicationContext method
		//con.registerShutdownHook();
		// Pepsi p1 =(Pepsi) con.getBean("pepsi");
		// System.out.println(p1);
		 Example ex =(Example) con.getBean("exp");
		 System.out.println(ex);
	}
}
