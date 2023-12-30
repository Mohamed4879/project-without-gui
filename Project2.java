/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String owner;
        double balance;
        double interestRate;
        int numWithdrawals;

        System.out.println("Enter information for Bank Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Balance: $");
        balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        BankAccount account1 = new BankAccount(name, balance);

        System.out.println("\nEnter information for CD Account:");
        System.out.print("Balance: $");
        balance = scanner.nextDouble();
        System.out.print("Interest rate: ");
        interestRate = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        CDAccount account2 = new CDAccount(name, balance, interestRate);

        System.out.println("\nEnter information for Money Market Account:");
        System.out.print("Balance: $");
        balance = scanner.nextDouble();
        System.out.print("Number of withdrawals: ");
        numWithdrawals = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        MoneyMarketAccount account3 = new MoneyMarketAccount(name, balance, numWithdrawals);

        // Print initial balances
        System.out.println("\n" + account1.getName() + "'s Bank Account balance is now $" + account1.getBalance());
        System.out.println(account2.getName() + "'s CD Account balance is now $" + account2.getBalance());
        System.out.println(account3.getName() + "'s Money Market Account balance is now $" + account3.getBalance());

        // Allow user to deposit or withdraw from accounts
        int choice;
        int choice2;
        double amount;

        System.out.println("\nEnter *1* for deposit, *2* for withdraw, *3* for Exit");
        choice = scanner.nextInt();
        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.println("Enter *1* for deposit in bank account, *2* for deposit in CD account, *3* for deposit in money market account");
                    choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.print("Enter amount to deposit: ");
                        balance = scanner.nextDouble();
                        account1.deposit(balance);
                    } else if (choice2 == 2) {
                        System.out.print("Enter amount to deposit: ");
                        balance = scanner.nextDouble();
                        account2.deposit(balance);
                    } else if (choice2 == 3) {
                        System.out.print("Enter amount to deposit: ");
                        balance = scanner.nextDouble();
                        account3.deposit(balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter *1* to withdraw from bank account, *2* to withdraw from CD account, *3* to withdraw from money market account");
                    choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.print("Enter amount to withdraw: ");
                        balance = scanner.nextDouble();
                        account1.withdraw(balance);
                    } else if (choice2 == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        balance = scanner.nextDouble();
                        account2.withdraw(balance);
                    } else if (choice2 == 3) {
                        System.out.print("Enter amount to withdraw: ");
                        balance = scanner.nextDouble();
                        account3.withdraw(balance);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
            System.out.println("\nEnter *1* for deposit, *2* for withdraw, *3* for Exit");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }
        System.out.println("Balance for bank account: " + account1.getBalance());
        System.out.println("Balance for CD account: " + account2.getBalance());
        System.out.println("Balance for money market account: " + account3.getBalance());
    }
    
}
