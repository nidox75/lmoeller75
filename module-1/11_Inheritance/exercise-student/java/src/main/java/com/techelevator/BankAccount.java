package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    // return account number

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getBalance() { return balance;}

        





    
    public int deposit(int amountOfDeposit) {
        balance = (balance + amountOfDeposit);
        return balance;
    }
    public int withdraw(int amountToWithdraw) {
        balance = (balance - (amountToWithdraw));
        return balance;
    }
    

        

        

    }

