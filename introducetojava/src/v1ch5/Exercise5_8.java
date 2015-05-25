package v1ch5;

/**
 * Created by Eric on 5/25/2015.
 */
public class Exercise5_8 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("---------------------------------------------");

        double celsius = 40;
        double fahrenheit = 120;

        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
            System.out.printf(celsius + "\t\t%.1f\t\t|\t" + fahrenheit + "\t\t%.2f",
                    celsiusToFahrenheit(celsius), fahrenheitToCelsius(fahrenheit));
            System.out.println();

        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}