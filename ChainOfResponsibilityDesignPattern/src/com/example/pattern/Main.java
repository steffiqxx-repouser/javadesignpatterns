package com.example.pattern;

public class Main {

    public static void main(String[] args) {

        LeaveApprover teamLead = new TeamLead();
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();

        // Creating the chain
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        // Leave requests
        teamLead.approveLeave(1);
        teamLead.approveLeave(4);
        teamLead.approveLeave(8);
        teamLead.approveLeave(15);
    }
}
