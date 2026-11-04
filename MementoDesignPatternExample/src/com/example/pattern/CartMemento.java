package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

public class CartMemento {
	 private final List<String> products;

	    public CartMemento(List<String> products) {
	        this.products = new ArrayList<>(products);
	    }

	    public List<String> getSavedProducts() {
	        return new ArrayList<>(products);
	    }
}
