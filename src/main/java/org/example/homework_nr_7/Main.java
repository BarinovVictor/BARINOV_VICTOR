package org.example.homework_nr_7;

import org.example.homework_nr_7.Shape.Circle;

public class Main {
    public static void main(String[] args) {

        Student someStudent = new Student("Ivan","Dacia 33","c++",5, 15500);
        System.out.println(someStudent);
        Person somePerson = new Person("Petea","Dacia 35");
        System.out.println(somePerson);
        Staff someStaff = new Staff("Katea","Dacia 36","A. Russo",9000);
        System.out.println(someStaff);

    }

}
