package TwoWeekJava;

import java.util.Arrays;
import java.util.Random;

public class Array_RotatorD9 {
    public static int[] rotater(int[] willRotate){
        int[] rotated = new int[willRotate.length];
        rotated[0] = willRotate[willRotate.length - 1];
        for (int i = 1; i <willRotate.length;i++){
            rotated[i] = willRotate[i-1];
        }
        return rotated;
    }


    public static void main(String[] args) {
        Random r = new Random();
        int ranL = r.nextInt(10, 21);

        int[] randArr = new int[ranL];
        for (int i = 0; i < ranL; i++) {
            randArr[i] = r.nextInt(100);
        }
        for (int num : randArr) {
            System.out.print(num + " ");
        }

        System.out.println("");
        System.out.println(Arrays.toString(rotater(randArr)));
    }
}
