package com.example.pattern;

public class ConfirmedState implements AppointmentState {

	 @Override
	    public void confirm(Appointment appointment) {
	        System.out.println("Appointment is already confirmed.");
	    }

	    @Override
	    public void startConsultation(Appointment appointment) {
	        System.out.println("Consultation started.");
	        appointment.setState(new InProgressState());
	    }

	    @Override
	    public void complete(Appointment appointment) {
	        throw new IllegalStateException(
	            "Start consultation before completing it."
	        );
	    }

	    @Override
	    public void cancel(Appointment appointment) {
	        System.out.println("Confirmed appointment cancelled.");
	        appointment.setState(new CancelledState());
	    }

	    @Override
	    public String getName() {
	        return "CONFIRMED";
	    }

}
