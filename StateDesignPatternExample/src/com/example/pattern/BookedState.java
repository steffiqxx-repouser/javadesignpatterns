package com.example.pattern;

public class BookedState implements AppointmentState {

    @Override
    public void confirm(Appointment appointment) {
        System.out.println("Appointment confirmed.");
        appointment.setState(new ConfirmedState());
    }

    @Override
    public void startConsultation(Appointment appointment) {
        throw new IllegalStateException(
            "Confirm the appointment before consultation."
        );
    }

    @Override
    public void complete(Appointment appointment) {
        throw new IllegalStateException(
            "A booked appointment cannot be completed."
        );
    }

    @Override
    public void cancel(Appointment appointment) {
        System.out.println("Booked appointment cancelled.");
        appointment.setState(new CancelledState());
    }

    @Override
    public String getName() {
        return "BOOKED";
    }
}
