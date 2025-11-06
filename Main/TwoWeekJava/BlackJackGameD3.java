package TwoWeekJava;

import java.util.Random;
import java.util.Scanner;

public class BlackJackGameD3{

    public static int drawCard(Random r) {
        return r.nextInt(1, 11);
    }

    public static int total(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int dealer1 = drawCard(r);
        int dealer2 = drawCard(r);

        int user1 = drawCard(r);
        int user2 = 0;

        System.out.println("Croupier: " + dealer1 + " + " + dealer2);
        System.out.println("-----------------");
        System.out.println("User: " + user1);
        System.out.print("Hit or Stand: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("hit")) {
            user2 = drawCard(r);
            int userTotal = total(user1, user2);
            System.out.println("User: " + user1 + " + " + user2 + " = " + userTotal);

            if (userTotal > 21) {
                System.out.println("You lost :) !");
            } else if (userTotal == 21) {
                System.out.println("Blackjack... You win >:( ");
            } else {
                System.out.println("You stand with " + userTotal);
            }

        }
        else if (choice.equalsIgnoreCase("stand")) {
            int dealerTotal = total(dealer1, dealer2);
            System.out.println("User stands with: " + user1);
            System.out.println("Dealer total: " + dealerTotal);

            if (user1 > dealerTotal) {
                System.out.println("You win!");
            } else if (user1 == dealerTotal) {
                System.out.println("Draw!");
            } else {
                System.out.println("You lost!");
            }
        } else {
            System.out.println("Invalid input. Please type 'hit' or 'stand'.");
        }
    }
}
