/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author ascom
 */
public class MoneyMarketAccount extends BankAccount {
    private int numWithdrawals;

    public MoneyMarketAccount(String owner, double balance, int numWithdrawals) {
        super(owner, balance);
        this.numWithdrawals = numWithdrawals;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            if (amount <= balance) {
                System.out.println("Invalid amount");
            } else {
                this.balance -= amount;
                System.out.println("Remaining Number of Withdrawals: " + numWithdrawals);
            }
            return true;
        } else {
            return false;
        }
    }
}
