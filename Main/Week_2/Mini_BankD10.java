package Week_2;

import java.util.Scanner;

public class Mini_BankD10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        float deposit = 0;


        System.out.println("Welcome to Bank Asia, please write down your Bank Account Name: ");
        String accountName = sc.nextLine();
        System.out.println("Welcome back " + accountName + " now please write your balance: ");
        float balance = sc.nextFloat();
        if(balance<0){
            System.out.println("Write a Valid Number To Proceed.");
        }
        else{
            while(check){
                System.out.println("1. Deposit"); System.out.println("2. Withdraw");
                System.out.println("3. Check Balance"); System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                }
            }
        }

    }
}
