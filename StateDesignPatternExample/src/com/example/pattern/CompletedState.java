package com.example.pattern;

public class CompletedState implements AppointmentState {

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
	        System.out.println("Appointment is already completed.");
	    }

	    @Override
	    public void cancel(Appointment a) {
	        throw invalid();
	    }

	    @Override
	    public String getName() {
	        return "COMPLETED";
	    }

	    private IllegalStateException invalid() {
	        return new IllegalStateException(
	            "Completed appointments cannot change state."
	        );
	    }

}
