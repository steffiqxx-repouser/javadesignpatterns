package com.example.pattern;

public interface AppointmentState {
	 void confirm(Appointment appointment);

	    void startConsultation(Appointment appointment);

	    void complete(Appointment appointment);

	    void cancel(Appointment appointment);

	    String getName();

}
