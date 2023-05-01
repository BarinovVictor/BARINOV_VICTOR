package org.example.homework_nr_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ivan", "Ivanov", "c++", true);
        Manager manager = new Manager("Petr", "Petrov",false,5, true);

        programmer.attendTraining();
        System.out.println("---------------------");
        manager.conductInterview();
        manager.attendTraining();
        System.out.println("---------------------");
        List<AttenTraining> arrayEmployees = new ArrayList<>();
        arrayEmployees.add(programmer);
        arrayEmployees.add(manager);
        MeetingRoom chekMeetingRoom = new MeetingRoom(arrayEmployees);
        chekMeetingRoom.checkAttendTraining();
        System.out.println("---------------------");
        Employee programmer2 = new Programmer("Sergei", "Petcov", "1c", true);
        Employee manager2 = new Manager("Victor", "Usov",true,5, false);
        Employee[] arrayEmployee = new Employee[]{programmer, programmer2, manager, manager2};
        for (Employee employee:
             arrayEmployee) {
            if(employee instanceof Programmer){
                ((Programmer) employee).attendTraining();}
            else {((Manager)employee).conductInterview();
            }
        }

    }
}

