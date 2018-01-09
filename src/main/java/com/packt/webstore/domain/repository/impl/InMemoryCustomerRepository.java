package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer c1 = new Customer (1, "Jan Kowalski", "00-120 Warszawa ul. Akacjowa 50", "tak");
		Customer c2 = new Customer (2, "Micha³ Nowak", "09-210 Kraków ul. Pistacjowa 52", "nie");
		Customer c3 = new Customer (3, "Asia Micha³owska", "01-125 Warszawa ul. Miêdzynarodowa 15 m. 90", "tak");
		Customer c4 = new Customer (4, "Kasia Nowaczyk", "03-120 Poznañ ul. Kubusia Puchatka 5", "nie");
		Customer c5 = new Customer (5, "Paulina Cebula", "02-120 Warszawa ul. Mineralna 23", "tak");
		
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		listOfCustomers.add(c3);
		listOfCustomers.add(c4);
		listOfCustomers.add(c5);
	}
	
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
