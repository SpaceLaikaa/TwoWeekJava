package TwoWeekJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Random_LotteryD5 {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int[] lotteryNumbers = new int[6];
        int[] userGuesses = new int[6];

        for(;i<6;i++){
            lotteryNumbers[i] = r.nextInt(1,50);
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



        System.out.println(Arrays.toString(lotteryNumbers)); // For checking
    }
}
