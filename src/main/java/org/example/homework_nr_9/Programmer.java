package org.example.homework_nr_9;

public class Programmer extends Employee implements AttenTraining{
    private String program;

    public Programmer(String name, String surname, String program, Boolean canTraining) {
        super(name, surname, canTraining);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void attendTraining() {
        if(this.getCanTraining())
            System.out.println("Can training");
        else System.out.println("Can't training");
    }
}
