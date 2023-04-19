package org.example.homework_nr_7.Shape;

public class Cube extends ThreeDimensionalShape{

    public void figureArea(float a){
        System.out.println("Figure area is " + 3.14 * a * a);
    }

    public void figureVolume(float a) {
        System.out.println("Figure Volume is " + a * a * a);
    }

}
