package org.example.homework_nr_3;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        System.out.println("41 degrees Fahrenheit = " + temperatureConverter.toCelsius(41) + " Celsius");
        System.out.println("41 degrees Celsius = " + temperatureConverter.toFahrenheit(41) + " Fahrenheit");
        System.out.println(circle.calculateArea(5.5));

    }

}
