package org.example.homework_nr_3;

public class TemperatureConverter {

    public double toFahrenheit(double Celsius){
        double p = 1.8;
        return (Celsius * p) + 32;
    }

    public double toCelsius(double Fahrenheit){
        double p = 1.8;
        return (Fahrenheit - 32) / p;
    }

    public static void main(String[] args){}

}
