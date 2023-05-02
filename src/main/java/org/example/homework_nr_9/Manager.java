package org.example.homework_nr_9;

public class Manager extends Employee implements Intervieweble, AttenTraining {

    private Integer experience;
    private Boolean canTakeInterview;
    public Manager(String name, String surname, Boolean canTraining, Integer experience, Boolean canTakeInterview) {
        super(name, surname, canTraining);
        this.experience = experience;
        this.canTakeInterview = canTakeInterview;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public void conductInterview() {
        if(this.canTakeInterview)
            System.out.println("Can interview");
        else System.out.println("Can't interview");
    }

    @Override
    public void attendTraining() {
        if(this.getCanTraining())
            System.out.println("Can training");
        else System.out.println("Can't training");
    }
}
