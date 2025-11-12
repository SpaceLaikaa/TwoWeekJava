package TwoWeekJava;

import java.util.Scanner;
import java.util.Random;

public class Recursive_Guessing_GameD8 {
    public static int GuessingGame(int randomNumber, int guessCount){
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        if(guessCount == 0){
            System.out.println("You Lost... The number was: " + randomNumber );
            return randomNumber;
        }
        else if (guess < randomNumber){
            System.out.println("Higher " + guessCount + " Attempts Left...");
            guessCount--;
            GuessingGame(randomNumber, guessCount);
        }
        else if (guess > randomNumber){
            System.out.println("Lower " + guessCount + " Attempts Left...");
            guessCount--;
            GuessingGame(randomNumber, guessCount);
        }
        else {
            System.out.println("You Correctly Guessed The number: " + randomNumber);
            System.out.println(guessCount + "Attempt was left.");
        }

        return guess;
    }


    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int randomNumber = r.nextInt(100) + 1;
        int guessCount = 5;

        System.out.println("Welcome to the Recursive Guessing Game! You have 6 Guesses in total. " +
                "Please write your first guess: ");
        GuessingGame(randomNumber, guessCount);
    }
}
