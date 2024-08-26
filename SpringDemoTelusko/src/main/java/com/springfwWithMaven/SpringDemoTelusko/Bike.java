package com.springfwWithMaven.SpringDemoTelusko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive()
	{
		System.out.println("Bike chal raha hai");
	}
}
