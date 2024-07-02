package Task_1;

public class FahrenheitToKelvin implements BaseConverter{

    public double convert(double temperature) {
        return (temperature-32)*5/9+273.15;
    }
}