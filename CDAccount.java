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
public class CDAccount extends BankAccount {
    private double interestRate;
    public CDAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }
    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            amount += (amount * interestRate) / 100;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

