package com.example.pattern;

public class RtgsPayment implements PaymentStrategy {

	 private final String accountNumber;

	    public RtgsPayment(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    @Override
	    public void pay(double amount) {
	        System.out.println(
	            "Paid ₹" + amount + " using PayPal account: " + accountNumber
	        );
	    }

}
