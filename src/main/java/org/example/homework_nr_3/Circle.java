package org.example.homework_nr_3;

public class Circle {

    public static float calculateArea(float r){
        return  (float) 3.14 * (r * r);
    }

    static void main(String[] args){
        float radius = 5.15F;
        System.out.println(calculateArea(radius));
    }
}

