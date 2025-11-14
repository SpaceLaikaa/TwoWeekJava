package Week_1;

import java.security.SecureRandom;
import java.util.Scanner;

public class Password_GeneratorD2 {

    public static void main(String[] args) {
        int A = 0;
        SecureRandom random = new SecureRandom();
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] chars = pool.toCharArray();

        Scanner sc = new Scanner(System.in);

        System.out.println("How long do you want your password to be, enter a valid number: ");
        int length = sc.nextInt();

        for(;A < length;A++) {
            char c = chars[random.nextInt(chars.length)];
            System.out.print(c);
        }
    }
}
