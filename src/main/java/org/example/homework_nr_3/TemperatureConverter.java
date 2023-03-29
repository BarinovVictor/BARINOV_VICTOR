package org.example.homework_nr_3;

public class TemperatureConverter {

    double Temperature;

    public TemperatureConverter(double temperature) {
        Temperature = temperature;
    }

    public double toFahrenheit(){
        double p = 1.8;
        return (Temperature * p) + 32;
    }

    public double toCelsius(){
        double p = 1.8;
        return (Temperature - 32) / p;
    }

}
