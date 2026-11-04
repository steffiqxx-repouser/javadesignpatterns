package com.example.pattern;

public class Main {
	  public static void main(String[] args) {

	        ShoppingCart cart = new ShoppingCart();
	        CartHistory history = new CartHistory();

	        cart.addProduct("Laptop");
	        cart.addProduct("Mobile Phone");

	        // Save current state
	        history.save(cart.saveState());

	        cart.addProduct("Headphones");

	        cart.displayCart();

	        // Undo operation
	        CartMemento previousState = history.undo();

	        if (previousState != null) {
	            cart.restoreState(previousState);
	        }

	        cart.displayCart();
	    }
}
