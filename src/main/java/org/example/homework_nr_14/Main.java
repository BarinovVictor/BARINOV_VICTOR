package org.example.homework_nr_14;

public class Main {
    public static void main(String[] args) {

        Comparable T = "Comparable";

        Animal V = new Animal();

        Number K = new Number();

        GenericClass<String, Animal, Number> meGenericClass = new GenericClass<String, Animal, Number>(T,V,K);

        meGenericClass.GetSimpleNameOfTheClass();

    }
}
