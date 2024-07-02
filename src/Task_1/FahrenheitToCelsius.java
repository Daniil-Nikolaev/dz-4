package Task_1;

public class FahrenheitToCelsius implements BaseConverter{

    public double convert(double temperature) {
        return (temperature-32)*5/9;
    }
}