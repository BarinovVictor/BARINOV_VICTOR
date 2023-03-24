package org.example.homework_nr_3;

public class Circle {

    static double calculateArea(double r){
        return  (double) 3.14 * (r * r);
    }

    public static void main(String[] args){
        double radius = 5.5;
        System.out.println(calculateArea(radius));

        TemperatureConverter Temperature = new TemperatureConverter();
        System.out.println("41 degrees Celsius = " + Temperature.toFahrenheit(41) + " Fahrenheit");
        System.out.println("41 degrees Fahrenheit = " + Temperature.toCelsius(41) + " Celsius");
    }

}

class TemperatureConverter{

    static double toFahrenheit(double Celsius){
        double p = 1.8;
        return (Celsius * p) + 32;
    }

    static double toCelsius(double Fahrenheit){
        double p = 1.8;
        return (Fahrenheit - 32) / p;
    }

    public static void main(String[] args){}

}
