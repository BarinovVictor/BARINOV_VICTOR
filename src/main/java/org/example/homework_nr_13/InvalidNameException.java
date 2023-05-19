package org.example.homework_nr_13;

public class InvalidNameException extends Exception {
    public InvalidNameException(String messageOfException){
        //System.out.println("The name or last name can't be empty!!!");
        super(messageOfException);
    }
}
