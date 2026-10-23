package com.example.pattern;

public class Main {
	 public static void main(String[] args) {

	        Appointment appointment = new Appointment();

	        System.out.println(appointment.getStatus());

	        appointment.confirm();
	        System.out.println(appointment.getStatus());

	        appointment.startConsultation();
	        System.out.println(appointment.getStatus());

	        appointment.complete();
	        System.out.println(appointment.getStatus());
	    }

}
