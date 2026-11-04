package com.example.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCatalog {
	private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    // Creates an iterator
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
