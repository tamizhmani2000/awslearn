package com.springcommerce;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCommerceApplication {

	public static HashMap<String,Product> productList;
	

	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringCommerceApplication.class, args);
		initializeProducts();
		
	}
	private static void initializeProducts() {
		
productList = new HashMap<String,Product>();
		
		Product one = new Product("P1","Shirt");
		productList.put(one.getProductId(), one);
		
		Product two = new Product("P2","Trousers");
		productList.put(two.getProductId(), two);
		
		Product three=new Product("P3","Coats");
		productList.put(three.getProductId(), three);
		
		System.out.println("Application Initialized");
	}
}
