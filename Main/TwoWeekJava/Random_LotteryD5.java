package TwoWeekJava;

import java.util.Random;
import java.util.Scanner;


public class Random_LotteryD5 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 0;
        int[] pool = new int[6];

        for(;i<6;i++){
            pool[i] = r.nextInt(1,50);
        }
    }
}
