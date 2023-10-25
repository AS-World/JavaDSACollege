package Functions;
// 6. Convert Celsius into Fahrenheit and vice versa

import java.util.Scanner;

public class Temperature {
    static double toFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32)/1.8;
    }

    public static void main(String[] args) {
        double temperature;
        Scanner sc = new Scanner(System.in);
        char givenIn;

        System.out.print("Enter temperature value : ");
        temperature = sc.nextDouble();
        System.out.print("Given Temperature is in (F/C) : ");
        givenIn = sc.next().charAt(0);
        sc.close();

        if (givenIn == 'F') {
            System.out.println("Temperature in Celsius : "+toCelsius(temperature));
        } else {
            System.out.println("Temperature in Fahrenheit : "+toFahrenheit(temperature));
        }
    }
}
