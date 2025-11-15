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

        //ANSWERS
        System.out.println("Do you make decisions quickly? (yes/no)");
        String answer1 = sc.nextLine();
        if (answer1.equalsIgnoreCase("yes")) riskScore++; else stableScore++;

        System.out.println("Do you enjoy taking risks? (yes/no)");
        String answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("yes")) riskScore++; else stableScore++;

        System.out.println("Do you prefer to plan everything before acting? (yes/no)");
        String answer3 = sc.nextLine();
        if (answer3.equalsIgnoreCase("yes")) stableScore++; else riskScore++;

        System.out.println("Do you try new things often? (yes/no)");
        String answer4 = sc.nextLine();
        if (answer4.equalsIgnoreCase("yes")) riskScore++; else stableScore++;

        System.out.println("Do you stay calm under pressure? (yes/no)");
        String answer5 = sc.nextLine();
        if (answer5.equalsIgnoreCase("yes")) stableScore++; else riskScore++;

        System.out.println("Do you enjoy surprises? (yes/no)");
        String answer6 = sc.nextLine();
        if (answer6.equalsIgnoreCase("yes")) riskScore++; else stableScore++;

        System.out.println("Do you prefer routine over change? (yes/no)");
        String answer7 = sc.nextLine();
        if (answer7.equalsIgnoreCase("yes")) stableScore++; else riskScore++;

        System.out.println("Do you get bored easily? (yes/no)");
        String answer8 = sc.nextLine();
        if (answer8.equalsIgnoreCase("yes")) riskScore++; else stableScore++;

        System.out.println("Do you think carefully before speaking? (yes/no)");
        String answer9 = sc.nextLine();
        if (answer9.equalsIgnoreCase("yes")) stableScore++; else riskScore++;

        System.out.println("Do you like making spontaneous decisions? (yes/no)");
        String answer10 = sc.nextLine();
        if (answer10.equalsIgnoreCase("yes")) riskScore++; else stableScore++;


        //RESULT
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
