package org.example.homework_nr_8;

/*Создайте класс Elephant, реализуйте интерфейс Animal
Создайте объект типа Elephant через интерфейс Animal
Вызвать методы*/
public class Elephant extends Erbivor implements Animal {

    public boolean haveWings = false;
    public int quantityWings = 0;
    public boolean haveLegs = false;
    public int quantityLegs = 0;

    public Elephant(boolean haveWings, int quantityWings, boolean haveLegs, int quantityLegs) {
        this.haveWings = haveWings;
        this.quantityWings = quantityWings;
        this.haveLegs = haveLegs;
        this.quantityLegs = quantityLegs;
    }

    @Override
    public void CanRun() {
        System.out.println("It can run");
    }

    @Override
    public void CanFly() {
        System.out.println("It can't fly");
    }

    @Override
    public boolean eatPlants() {
        return true;
    }
}
