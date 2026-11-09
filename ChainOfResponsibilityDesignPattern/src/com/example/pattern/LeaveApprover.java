package com.example.pattern;

abstract class LeaveApprover {

    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover approver) {
        this.nextApprover = approver;
    }

    public abstract void approveLeave(int days);
}