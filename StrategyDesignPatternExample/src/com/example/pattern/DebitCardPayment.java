package com.example.pattern;

public class DebitCardPayment implements PaymentStrategy {

	 private final String cardNumber;

	    public DebitCardPayment(String cardNumber) {
	        this.cardNumber = cardNumber;
	    }

	    @Override
	    public void pay(double amount) {
	        System.out.println(
	            "Paid ₹" + amount + " using Credit Card ending in "
	            + cardNumber.substring(cardNumber.length() - 4)
	        );

}
}
