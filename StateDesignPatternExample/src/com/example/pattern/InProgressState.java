package com.example.pattern;

public class InProgressState implements AppointmentState {

	@Override
    public void confirm(Appointment appointment) {
        throw new IllegalStateException(
            "Consultation is already in progress."
        );
    }

    @Override
    public void startConsultation(Appointment appointment) {
        System.out.println("Consultation is already in progress.");
    }

    @Override
    public void complete(Appointment appointment) {
        System.out.println("Consultation completed.");
        appointment.setState(new CompletedState());
    }

    @Override
    public void cancel(Appointment appointment) {
        throw new IllegalStateException(
            "Cannot cancel an ongoing consultation."
        );
    }

    @Override
    public String getName() {
        return "IN_PROGRESS";
    }

}
