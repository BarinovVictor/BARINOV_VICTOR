package org.example.homework_nr_7.Shape;

import org.example.homework_nr_7.Person;
import org.example.homework_nr_7.Staff;
import org.example.homework_nr_7.Student;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalShape circleObject = new Circle();
        circleObject.figureArea(5.0f);
        System.out.println("--------------------------------");
        ThreeDimensionalShape cubeObject = new Cube();
        cubeObject.figureVolume( 10.0f);
        cubeObject.figureArea(10.0f);
    }
}
