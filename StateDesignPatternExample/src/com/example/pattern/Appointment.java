package com.example.pattern;

public class Appointment {
	private AppointmentState state;

    public Appointment() {
        this.state = new BookedState();
    }

    public void confirm() {
        state.confirm(this);
    }

    public void startConsultation() {
        state.startConsultation(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public String getStatus() {
        return state.getName();
    }

    public void setState(AppointmentState state) {
        this.state = state;
    }

}
