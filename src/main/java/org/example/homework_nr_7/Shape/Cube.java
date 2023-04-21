package org.example.homework_nr_7.Shape;

public class Cube extends ThreeDimensionalShape{

    @Override
    public void figureArea(float a){
        System.out.println("Figure area is " + 3.14 * a * a);
    }

    @Override
    public void figureVolume(float a) {
        System.out.println("Figure Volume is " + a * a * a);
    }

}
