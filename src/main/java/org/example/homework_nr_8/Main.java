package org.example.homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant(false,0,true,4);

        elephant.CanFly();
        elephant.CanRun();
        ((Animal)elephant).produceSound();
        Animal.canSwim();
        System.out.println("-------------------------------------");
        if(new Elephant(false,0,true,4).eatPlants()) Erbivor.informationAboutAnimal();
    }

}
