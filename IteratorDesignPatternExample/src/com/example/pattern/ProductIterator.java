package com.example.pattern;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductIterator implements Iterator<Product> {
	 private List<Product> products;
	    private int position = 0;

	    public ProductIterator(List<Product> products) {
	        this.products = products;
	    }

	    @Override
	    public boolean hasNext() {
	        return position < products.size();
	    }

	    @Override
	    public Product next() {
	        if (!hasNext()) {
	            throw new NoSuchElementException();
	        }

	        return products.get(position++);
	    }
}
