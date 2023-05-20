package org.example.homework_nr_14;


import java.io.Serializable;

public class GenericClass <T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {

    public T comparable;
    public V animal;
    public K number;

    public GenericClass(Comparable comparable, Serializable serializable, Number number) {
        this.comparable = (T) comparable;
        this.animal = (V) serializable;
        this.number = (K) number;
    }

    public T getComparable() {
        return comparable;
    }

    public V getSerializable() {
        return animal;
    }

    public K getNumber() {
        return number;
    }

    public void GetSimpleNameOfTheClass(){
        System.out.println("Comparable has class name " + comparable.getClass().getSimpleName());
        System.out.println("Animal has class name " + animal.getClass().getSimpleName());
        System.out.println("Number has class name " + number.getClass().getSimpleName());
    }

}
