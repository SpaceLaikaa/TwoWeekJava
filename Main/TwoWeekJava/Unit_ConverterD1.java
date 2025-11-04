package TwoWeekJava;

import java.util.Scanner;

public class Unit_ConverterD1 {
    public static double TemperatureConverter( float C){
        float fahrenheit = C * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        return C;
    }

    public static double MileConverter(double M){
        double kilometer = M * 1.60934;
        System.out.println("The length in kilometer is: " + kilometer);
        return M;
    }

    public static double InchConverter(double I){
        double centimeter = I * 2.54;
        System.out.println("The length in centimeter is: " + centimeter);
        return I;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("        Which Converter do you want to use? Write the number.");
        System.out.println("| 1. Celsius To Fahrenheit    2. Mile to Kilometer    3. Inch to Centimeter |");
        int select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println("Enter your value(Celsius): ");
                float celsius = sc.nextFloat();
                double result = TemperatureConverter(celsius);
                break;
            case 2:
                System.out.println("Enter your value(Mile): ");
                double Mile = sc.nextDouble();
                MileConverter(Mile);
                break;
            case 3:
                System.out.println("Enter your value(Inch): ");
                double Inch = sc.nextDouble();
                InchConverter(Inch);
                break;
            default:
                System.out.println("Please enter a valid number.");
                break;
        }


    }
}