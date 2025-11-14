package Week_2;

import java.util.Scanner;

public class Mini_BankD10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        boolean checkWithdraw = true;
        float deposit = 0;
        float withdraw = 0;



        System.out.println("Welcome to Bank Asia, please write down your Bank Account Name: ");
        String accountName = sc.nextLine();
        System.out.println("Welcome back " + accountName + " now please write your balance: ");
        float balance = sc.nextFloat();

        if(balance<0){
            System.out.println("Write a Valid Number To Proceed.");
        }
        else{
            while(check){
                System.out.println("-----------------");
                System.out.println("1. Deposit"); System.out.println("2. Withdraw");
                System.out.println("3. Check Balance"); System.out.println("4. Exit");
                System.out.println("-----------------");
                int choice = sc.nextInt();

                switch (choice){
                    case 1: { //deposit
                        System.out.println("Enter deposit amount: ");
                        deposit = sc.nextFloat();
                        sc.nextLine();
                        balance = deposit + balance;
                        System.out.println("Your new balance is: " + balance + ". Would you like to perform another operation?");
                        String DepositAnswer = sc.nextLine();

                        if(DepositAnswer.equalsIgnoreCase("yes")){
                            break;
                        }
                        else if(DepositAnswer.equalsIgnoreCase("no")){
                            System.out.println("Have a nice day..!");
                            check = false;
                            break;
                        }
                        else{
                            System.out.println("Invalid Input, Exiting The System.");
                            check = false;
                            break;
                        }
                    }
                    case 2:{ //withdraw
                        while(checkWithdraw) {
                            System.out.println("Enter withdrawal amount: ");
                            withdraw = sc.nextFloat();
                            sc.nextLine();
                            if (withdraw > balance) {
                                System.out.println("Enter a valid value.");System.out.println("---------------------");
                                continue;
                            }
                            else {
                                balance = balance - withdraw;;
                                System.out.println("Your new balance is: " + balance + ". Would you like to perform another operation?");
                                String WithdrawAnswer = sc.nextLine();
                                    if(WithdrawAnswer.equalsIgnoreCase("yes")){
                                        checkWithdraw = false;
                                        break;
                                    }
                                    else if(WithdrawAnswer.equalsIgnoreCase("no")){
                                        System.out.println("Have a nice day..!");
                                        check = false;
                                        break;
                                    }
                                    else{
                                        System.out.println("Invalid Input, Exiting The System.");
                                        check= false;
                                        break;
                                    }
                            }
                        }
                    }
                }
            }
        }
    }
}
