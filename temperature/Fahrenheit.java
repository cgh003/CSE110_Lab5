package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
//        return null;
        float value = ((this.getValue()-32)*5/9);
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
//        return null;
        return this;
    }

    public String toString()
    {
//        return "";
        // TODO: Complete this method
        return this.getValue()+" F";
    }
}