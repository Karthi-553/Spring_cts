package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Student st = (Student)context.getBean("student1");
		System.out.println(st.getName());
		System.out.println(st.getPhones());
		System.out.println(st.getAddress());
		System.out.println(st.getCourses());
		System.out.println(st.getPhones().getClass().getName());
	}
}
