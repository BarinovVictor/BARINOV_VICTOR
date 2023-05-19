package org.example.homework_nr_13;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan", "Ivanov",-5);
        Person person2 = new Person("Petr", "Petrov",30);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println("---------------------------------------------------");
        Numbers numbers = new Numbers();

        try {
            for (int i = 5 ; i >= 0 ; i--) {
                numbers.divisionBy(i);
                System.out.println(i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------");

        try{
            System.out.println(numbers.countDivisibleBy7Numbers(1,28));
            System.out.println(numbers.countDivisibleBy7Numbers(3,2));
            System.out.println(numbers.countDivisibleBy7Numbers(14,28));
        } catch (InvalidRangeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
