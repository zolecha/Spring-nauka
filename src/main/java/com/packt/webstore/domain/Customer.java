package com.packt.webstore.domain;

public class Customer {

	private int customerId;
	private String name;
	private String address;
	private String noOfOrdersMade;
			
	public Customer() {
		super();
	}
	


	public Customer(int customerId, String name, String address, String noOfOrdersMade) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.noOfOrdersMade = noOfOrdersMade;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNoOfOrdersMade() {
		return noOfOrdersMade;
	}


	public void setNoOfOrdersMade(String noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", noOfOrdersMade="
				+ noOfOrdersMade + "]";
	}
	
	
	
}
