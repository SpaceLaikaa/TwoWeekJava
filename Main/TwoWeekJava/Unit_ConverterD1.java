package TwoWeekJava;

import java.util.Scanner;

public class Unit_ConverterD1 {
    public static double TemperatureConverter( float C){
        float fahrenheit = C * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        return C;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("    Which Converter do you want to use? Write the number.");
        System.out.print("| 1. Celsius To Fahrenheit    2. Mile to Kilometer    3. Inch to Centimeter | \n: ");
        int select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println("Enter your value(Celsius): ");
                float celsius = sc.nextInt();
                double result = TemperatureConverter(celsius);
                break;

        }


    }
}