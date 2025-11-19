package Week_2;

import java.util.Random;
import java.util.Arrays;

public class Signal_AnalyzerD14 {

    public static void negativeRemover(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                n[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];

        System.out.print("Raw Signal: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-100, 101);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        negativeRemover(arr);

        // Temporary check to see if it works
        System.out.println("Signal cleaned.");
    }
}