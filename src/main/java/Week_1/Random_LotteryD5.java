package Week_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Random_LotteryD5 {

    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);

        boolean valid = true;// For to check if the numbers are valid at the end.
        int i = 0;
        int[] lotteryNumbers = new int[6];
        int[] userGuesses = new int[6];

        for(;i<6;i++){
            lotteryNumbers[i] = r.nextInt(1,21);
            boolean alreadyExists = false;
            for (int j = 0; j < i; j++) {
                if (lotteryNumbers[j] == lotteryNumbers[i]) {
                    alreadyExists = true;
                    if (alreadyExists) {
                        i--;
                    }
                }
            }
        }

        for (i = 0; i < 6; i++) {
            System.out.print("Guess " + (i + 1) + ": ");
            int Guesses = sc.nextInt();
            userGuesses[i] = Guesses;
            boolean exists = false;

            for(int k = 0;k<i;k++){
                if (userGuesses[i] == userGuesses[k]){
                    System.out.println("Please enter uniqe guesses.");
                    exists = true;
                    break;
                }

            }
            if (exists){
                valid = false;
                break;
            }
        }
        int matchCount = 0;

        for (i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userGuesses[i] == lotteryNumbers[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        if(valid){
            System.out.print("Lottery Numbers are: ");
            System.out.println(Arrays.toString(lotteryNumbers)); // For checking
            System.out.print("Your numbers were: ");
            System.out.println(Arrays.toString(userGuesses)); // For checking
            System.out.print("You guessed " + matchCount + " numbers correctly! ");
            if(matchCount >= 3){
                System.out.println("You won the small prize!!");
            }
            else if(matchCount >=6){
                System.out.println("No way... Idk what to say.");
            }
}
}
}
