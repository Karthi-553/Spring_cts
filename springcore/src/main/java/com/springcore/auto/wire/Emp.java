package com.springcore.auto.wire;

import java.lang.foreign.AddressLayout;

public class Emp {
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

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}
	
}
