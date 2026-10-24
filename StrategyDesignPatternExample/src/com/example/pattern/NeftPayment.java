package com.example.pattern;

public class NeftPayment implements PaymentStrategy {

	 private final String accountNumber;

	    public NeftPayment(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    @Override
	    public void pay(double amount) {
	        System.out.println(
	            "Paid ₹" + amount + " using PayPal account: " + accountNumber
	        );
	    }

}
