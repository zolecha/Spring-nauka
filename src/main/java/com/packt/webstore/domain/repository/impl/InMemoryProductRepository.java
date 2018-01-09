package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;


@Repository
public class InMemoryProductRepository implements ProductRepository {
	
	private List<Product> listOfProducts = new ArrayList<Product>();
	
	public InMemoryProductRepository() {
		
		Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
		iphone.setDescription("Opis iphona");
		iphone.setCategory("SmartPhone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		Product laptop_dell = new Product("P12345", "Dell Inspiron", new BigDecimal(700));
		laptop_dell.setDescription("Opis Della");
		laptop_dell.setCategory("Laptop");
		laptop_dell.setManufacturer("Dell");
		laptop_dell.setUnitsInStock(1000);
		
		
		Product tablet_Nexus = new Product("P12346", "Nexus 7", new BigDecimal(300));
		tablet_Nexus.setDescription("Opis Nexusa");
		tablet_Nexus.setCategory("Tablet");
		tablet_Nexus.setManufacturer("Google");
		tablet_Nexus.setUnitsInStock(1000);
		
		listOfProducts.add(iphone);
		listOfProducts.add(laptop_dell);
		listOfProducts.add(tablet_Nexus);
		
	}

	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	public Product getProductById(String productId) {
		Product productById = null;
		for (Product product : listOfProducts) {
			if(product!=null && product.getProductId()!=null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			} if(productById == null) {
				throw new IllegalArgumentException("Brak produktu o wskazanym id: "+ productId);
			}
		}
		return productById;
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> productsByCategory = new ArrayList<Product>();
		for(Product product: listOfProducts) {
			if(category.equalsIgnoreCase(product.getCategory())) {
				productsByCategory.add(product);
			}
		}
		return productsByCategory;
	}
	

}
