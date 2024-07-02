import Task_1.*;
import Task_2.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task_1
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Выберите операцию:
                1-Перевод из Цельсия в Фаренгейты
                2-Перевод из Цельсия в Кельвины
                3-Перевод из Фаренгейта в Цельсии
                4-Перевод из Фаренгейта в Кельвины
                5-Перевод из Кельвина в Цельсии
                6-Перевод из Кельвина в Цельсии
                """);
        int numberOfOperation = sc.nextInt();

        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();
        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius();
        FahrenheitToKelvin fahrenheitToKelvin = new FahrenheitToKelvin();
        KelvinToCelsius kelvinToCelsius = new KelvinToCelsius();
        KelvinToFahrenheits kelvinToFahrenheits = new KelvinToFahrenheits();

        System.out.println("Введите температуру");
        double temperature = sc.nextDouble();

        switch (numberOfOperation) {
            case 1 -> {
                System.out.println("Температура В Фаренгейтах=" + celsiusToFahrenheit.convert(temperature));
            }
            case 2 -> {
                System.out.println("Температура в Кельвинах=" + celsiusToKelvin.convert(temperature));
            }
            case 3 -> {
                System.out.println("Температура в Цельсиях=" + fahrenheitToCelsius.convert(temperature));
            }
            case 4 -> {
                System.out.println("Температура в Кельвинах=" + fahrenheitToKelvin.convert(temperature));
            }
            case 5 -> {
                System.out.println("Температура в Цельсиях=" + kelvinToCelsius.convert(temperature));
            }
            case 6 -> {
                System.out.println("Температура в Фаренгейтах=" + kelvinToFahrenheits.convert(temperature));
            }
            default -> System.out.println("Ошибка");

        }
        //Task_2
        Box box = new Box(6842);
        Ball ball = new Ball(2);
        Cylinder cylinder = new Cylinder(5, 140);
        Pyramid pyramid = new Pyramid(52, 10);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));


    }
}