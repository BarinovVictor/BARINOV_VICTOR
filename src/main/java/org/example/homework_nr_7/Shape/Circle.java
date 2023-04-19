package org.example.homework_nr_7.Shape;

public class Circle extends TwoDimensionalShape{

    @Override
    public void figureArea(Float a){
        System.out.println("Figure area is " + 3.14 * a * a);
    }
}
