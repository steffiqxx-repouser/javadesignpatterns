package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	 private List<String> products = new ArrayList<>();

	    public void addProduct(String product) {
	        products.add(product);
	        System.out.println(product + " added to cart");
	    }

	    // Save cart state
	    public CartMemento saveState() {
	        System.out.println("Shopping cart state saved");
	        return new CartMemento(products);
	    }

	    // Restore previous cart state
	    public void restoreState(CartMemento memento) {
	        products = memento.getSavedProducts();
	        System.out.println("Shopping cart state restored");
	    }

	    public void displayCart() {
	        System.out.println("Current Shopping Cart: " + products);
	    }
}
