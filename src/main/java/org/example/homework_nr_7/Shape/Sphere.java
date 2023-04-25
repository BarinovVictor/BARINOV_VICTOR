package org.example.homework_nr_7.Shape;

public class Sphere extends ThreeDimensionalShape{

    @Override
    public void figureArea(float a){
        System.out.println("Figure area is " + 3.14 * a * a);
    }

    @Override
    public void figureVolume(float a) {
        System.out.println("Figure Volume is " + 4 * 3.14 * a * a);
    }

}
