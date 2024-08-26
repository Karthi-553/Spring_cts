package com.springcore.auto.wire.annotation;

import java.lang.foreign.AddressLayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address1")
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside Setter");
		this.address = address;
	}
//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");

	}
	
}
