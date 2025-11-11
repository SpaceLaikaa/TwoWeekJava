package TwoWeekJava;

import java.util.Scanner;

public class Input_Stats_CounterD7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        int positivenums = 0;
        int negativenums = 0;
        int zeros = 0;

        int[] pool = new int[10];

        for(;i<10;i++){
            System.out.println("Value" + (i+1) + " : ");
            pool[i] = sc.nextInt();
            if(pool[i] * -1 < 0 && pool[i] != 0){
                positivenums++;
            }
            else if(pool[i] * -1 > 0 && pool[i] != 0){
                negativenums++;
            }
            else{
                zeros++;
            }
        }
        System.out.println("There were " + positivenums + " positive, " + negativenums + " negative and, " + zeros + " zero numbers.");

    }
}