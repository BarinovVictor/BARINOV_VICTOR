package org.example.homework_nr_13;

public class Person {

    String firstName;
    String lastName;
    Integer Age;

    public Person(String firstName, String lastName, Integer age) {
        try {
            if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
                throw new InvalidNameException("The name or last name can't be empty!!!");
            }

            if (age < 0 || age > 150) {
                throw new InvalidAgeException("The age must be between 0 and 150 !!!");
            }

            this.firstName = firstName;
            this.lastName = lastName;
            Age = age;
        }
        catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                '}';
    }

}

