package TwoWeekJava;

import java.security.SecureRandom;

public class Password_GeneratorD2 {


    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";

        char[] chars = pool.toCharArray();

        char c = chars[random.nextInt(chars.length)];
        System.out.println(c);

    }
}
