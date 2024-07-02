package Task_1;

public class KelvinToFahrenheits implements BaseConverter {

    public double convert(double temperature) {
        return  (temperature-273.15)*9/5+32;
    }
}