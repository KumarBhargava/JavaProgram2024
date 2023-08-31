package src;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static int temperature;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a Fahrenheit temp:");
        temperature = sc.nextInt();
        int temperatureInCelsius = convertIntoCelsius(temperature);
        System.out.println(temperatureInCelsius);
    }

    public static int convertIntoCelsius(int value){
        return ((temperature-32)*5)/9;
    }
}
