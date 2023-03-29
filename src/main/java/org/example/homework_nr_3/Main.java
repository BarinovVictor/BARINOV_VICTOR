package org.example.homework_nr_3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        TemperatureConverter temperatureConverter = new TemperatureConverter(41);

        System.out.println("41 degrees Fahrenheit = " + temperatureConverter.toCelsius() + " Celsius");
        System.out.println("41 degrees Celsius = " + temperatureConverter.toFahrenheit() + " Fahrenheit");
        System.out.println(circle.calculateArea());

    }

}
