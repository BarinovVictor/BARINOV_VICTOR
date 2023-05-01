package org.example.homework_nr_9;

public class Employee {
    private String name;
    private String surname;
    private Boolean CanTraining;

    public Employee(String name, String surname, Boolean canTraining) {
        this.name = name;
        this.surname = surname;
        this.CanTraining = canTraining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getCanTraining() {
        return CanTraining;
    }

    public void setCanTraining(Boolean canTraining) {
        CanTraining = canTraining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", CanTraining=" + CanTraining +
                '}';
    }
}
