package com.example.pattern;




	
	public class Main {

	    public static void main(String[] args) {

	        PaymentService paymentService =
	                new PaymentService(
	                        new DebitCardPayment("1234567812345678")
	                );

	        // Customer chooses credit card
	        paymentService.checkout(2500.00);

	        // Customer changes payment method to PayPal
	        paymentService.setPaymentStrategy(
	                new NeftPayment("customer@example.com")
	        );
	        paymentService.checkout(1500.00);

	        // Customer chooses UPI
	        paymentService.setPaymentStrategy(
	                new UpiPayment("customer@upi")
	        );
	        paymentService.checkout(500.00);
	    }
}
