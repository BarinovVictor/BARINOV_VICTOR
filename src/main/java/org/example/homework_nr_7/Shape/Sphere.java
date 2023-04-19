package org.example.homework_nr_7.Shape;

public class Sphere extends ThreeDimensionalShape{


    public void figureArea(float a){
        System.out.println("Figure area is " + 3.14 * a * a);
    }

    public void figureVolume(float a) {
        System.out.println("Figure Volume is " + 4 * 3.14 * a * a);
    }

}
