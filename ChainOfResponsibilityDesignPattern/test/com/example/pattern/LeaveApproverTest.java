
package com.example.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class LeaveApproverTest {

    @Test
    void testTeamLeadApproval() {
        testApproval(1,
            "Team Lead approved 1 days leave");
    }

    @Test
    void testTeamLeadMaximumApproval() {
        testApproval(2,
            "Team Lead approved 2 days leave");
    }

    @Test
    void testManagerApproval() {
        testApproval(3,
            "Manager approved 3 days leave");
    }

    @Test
    void testManagerMaximumApproval() {
        testApproval(5,
            "Manager approved 5 days leave");
    }

    @Test
    void testDirectorApproval() {
        testApproval(6,
            "Director approved 6 days leave");
    }

    @Test
    void testDirectorMaximumApproval() {
        testApproval(10,
            "Director approved 10 days leave");
    }

    @Test
    void testLeaveRejection() {
        testApproval(11,
            "Leave request rejected!");
    }

    @Test
    void testLargeLeaveRequestRejection() {
        testApproval(15,
            "Leave request rejected!");
    }

    private void testApproval(int days, String expected) {

        LeaveApprover teamLead = new TeamLead();
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        ByteArrayOutputStream output =
            new ByteArrayOutputStream();

        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(output));

            teamLead.approveLeave(days);

            assertEquals(expected,
                output.toString().trim());

        } finally {
            System.setOut(originalOut);
        }
    }
}
