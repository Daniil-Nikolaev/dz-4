package Task_1;

public class CelsiusToFahrenheit implements BaseConverter{

    public double convert(double temperature) {
        return temperature * 1.8 + 32;
    }
}