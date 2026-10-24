package com.example.pattern;

public class PaymentService {
	 private PaymentStrategy paymentStrategy;

	    public PaymentService(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    public void checkout(double amount) {
	        paymentStrategy.pay(amount);
	    }
}
