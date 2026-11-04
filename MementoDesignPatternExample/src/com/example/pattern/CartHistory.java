package com.example.pattern;

import java.util.Stack;

public class CartHistory {
	 private Stack<CartMemento> history = new Stack<>();

	    public void save(CartMemento memento) {
	        history.push(memento);
	    }

	    public CartMemento undo() {
	        if (!history.isEmpty()) {
	            return history.pop();
	        }
	        return null;
	    }
}
