package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {

    private List<AttenTraining> arrayEmployees = new ArrayList<>();

    public MeetingRoom(List<AttenTraining> arrayEmployees) {
        this.arrayEmployees = arrayEmployees;
    }

    public void checkAttendTraining () {
        for (AttenTraining element :
                arrayEmployees) {
            element.attendTraining();
        }
    }
}
