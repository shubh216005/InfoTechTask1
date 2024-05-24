package Task1;
import java.util.Scanner;
public class TemperatureConverter {
    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return fahrenheitToCelsius(fahrenheit) + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // enter temperature value
            System.out.print("Enter the temperature value: ");
            double value = scanner.nextDouble();

            // enter the unit of measurement
            System.out.print("Enter the unit of measurement (C/F/K): ");
            String unit = scanner.next().trim().toUpperCase();

            // Convert the temperature
            switch (unit) {
                case "C":
                    double fahrenheitFromCelsius = celsiusToFahrenheit(value);
                    double kelvinFromCelsius = celsiusToKelvin(value);
                    System.out.printf("%.2f°C is %.2f°F and %.2fK%n", value, fahrenheitFromCelsius, kelvinFromCelsius);
                    break;
                case "F":
                    double celsiusFromFahrenheit = fahrenheitToCelsius(value);
                    double kelvinFromFahrenheit = fahrenheitToKelvin(value);
                    System.out.printf("%.2f°F is %.2f°C and %.2fK%n", value, celsiusFromFahrenheit, kelvinFromFahrenheit);
                    break;
                case "K":
                    double celsiusFromKelvin = kelvinToCelsius(value);
                    double fahrenheitFromKelvin = kelvinToFahrenheit(value);
                    System.out.printf("%.2fK is %.2f°C and %.2f°F%n", value, celsiusFromKelvin, fahrenheitFromKelvin);
                    break;
                default:
                    System.out.println("Invalid unit. Please enter 'C' for Celsius, 'F' for Fahrenheit, or 'K' for Kelvin.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a numerical temperature value.");
        } finally {
            scanner.close();
        }
    }
}
