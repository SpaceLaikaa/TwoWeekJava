package TwoWeekJava;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_GameD6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i = 0;

        i = r.nextInt(3);

        String[] bot = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to the RPS Game. Please enter your choice: ");
        String UserInput = sc.nextLine();
        if     (UserInput.equalsIgnoreCase("Rock") && bot[i].equals("Rock") ||
                UserInput.equalsIgnoreCase("Paper") && bot[i].equals("Paper") ||
                UserInput.equalsIgnoreCase("Scissors") && bot[i].equals("Scissors"))
                {
                    System.out.println("CPU: " + bot[i]);
                    System.out.println("User: " + UserInput);
                    System.out.println("It's a tie!");
                }
        else if(UserInput.equalsIgnoreCase("Rock") && bot[i].equals("Scissors")||
                UserInput.equalsIgnoreCase("Scissors") && bot[i].equals("Paper")||
                UserInput.equalsIgnoreCase("Paper") && bot[i].equals("Rock"))
        {
            System.out.println("CPU: " + bot[i]);
            System.out.println("User: " + UserInput);
            System.out.println("You win!!!");
        }
        else{
            System.out.println("CPU: " + bot[i]);
            System.out.println("User: " + UserInput);
            System.out.println("You lost.");
            }

    }
}
