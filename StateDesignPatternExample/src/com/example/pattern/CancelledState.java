package com.example.pattern;

public class CancelledState implements AppointmentState {

	 @Override
	    public void confirm(Appointment a) {
	        throw invalid();
	    }

	    @Override
	    public void startConsultation(Appointment a) {
	        throw invalid();
	    }

	    @Override
	    public void complete(Appointment a) {
	        throw invalid();
	    }

	    @Override
	    public void cancel(Appointment a) {
	        System.out.println("Appointment is already cancelled.");
	    }

	    @Override
	    public String getName() {
	        return "CANCELLED";
	    }

	    private IllegalStateException invalid() {
	        return new IllegalStateException(
	            "Cancelled appointments cannot be changed."
	        );
	    }

}
