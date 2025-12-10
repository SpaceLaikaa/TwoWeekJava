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

    public static int maxFinder(int[] m, int index, int currentmax) {
        if (index == m.length) {
            return currentmax;
        }

        if (m[index] > currentmax) {
            currentmax = m[index];
        }

        return maxFinder(m, index + 1, currentmax);
    }

    public static void printStats(int[] cleanedArr, int maxVal) {
        System.out.println("------------------------------------------------");
        System.out.println("ANALYSIS RESULTS:");

        System.out.print("Cleaned Signal: [");
        for (int i = 0; i < cleanedArr.length; i++) {
            System.out.print(cleanedArr[i]);
            if (i < cleanedArr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Max Value in Signal: " + maxVal);
        System.out.println("------------------------------------------------");
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

        int maxVal = maxFinder(arr, 1, arr[0]);

        printStats(arr, maxVal);
    }
}