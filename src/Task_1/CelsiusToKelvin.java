package Task_1;

public class CelsiusToKelvin implements BaseConverter{

    public double convert(double temperature) {
        return temperature + 273.15;
    }
}