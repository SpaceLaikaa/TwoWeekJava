package Week_2;

import java.util.Scanner;

public class Mind_TestD11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int riskScore = 0;
        int stableScore = 0;

        System.out.print("Welcome to the Mind Guess Test! ");
        System.out.println("You will answer a couple of questions and I will analyze your decisions.");
        System.out.println("Press ENTER to continue...");
        sc.nextLine();

        // QUESTIONS
        System.out.println("Do you make decisions quickly? (yes/no)");
        String answer1 = sc.nextLine();

        if (answer1.equalsIgnoreCase("yes")) {
            riskScore++;
        } else if (answer1.equalsIgnoreCase("no")) {
            stableScore++;
        }

        // RESULT
        System.out.println("\n--- RESULT ---");

        if (riskScore > stableScore) {
            System.out.println("You are a fast thinker who takes risks!");
        } else if (stableScore > riskScore) {
            System.out.println("You are careful and prefer stable decisions.");
        } else {
            System.out.println("You are balanced, sometimes fast and sometimes careful.");
        }
    }
}
