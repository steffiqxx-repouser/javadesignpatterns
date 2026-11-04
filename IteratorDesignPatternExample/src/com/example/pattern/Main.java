package com.example.pattern;

import java.util.Iterator;

public class Main {
	 public static void main(String[] args) {

	        ProductCatalog catalog = new ProductCatalog();

	        // Adding e-commerce products
	        catalog.addProduct(
	            new Product("Laptop", 15577.2757)
	        );

	        catalog.addProduct(
	            new Product("Mobile Phone", 3557.75)
	        );

	        catalog.addProduct(
	            new Product("Headphones", 1999.95)
	        );

	        catalog.addProduct(
	            new Product("Smart Watch", 4599.95)
	        );

	        // Creating iterator
	        Iterator<Product> iterator =
	            catalog.createIterator();

	        System.out.println("E-Commerce Product Catalog:");

	        // Display products one by one
	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            System.out.println(product);
	        }
	    }
}
