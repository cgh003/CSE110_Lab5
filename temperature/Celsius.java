package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return null;
//        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return null;
//        float value = ((this.getValue()*9)/5)+32;
//        return new Fahrenheit(value);
    }

    public String toString()
    {
        return "";
        // TODO: Complete this method
//        return this.getValue()+" C";
    }
}