package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		 ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autowire-config.xml");
		    Emp e1=(Emp)con.getBean("emp1");
		    System.out.println(e1);
	}
}
