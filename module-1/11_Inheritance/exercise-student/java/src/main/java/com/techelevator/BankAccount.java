package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    public String accountHolderName;
    private String balance = new String("0");

    public BankAccount() {
        balance = new String("0.00");
        accountNumber = "unknown";
        accountHolderName = "unknown";
    }

    public BankAccount(String accountNumber, String balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = "";
    }
    // return account number

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        
    }
    public List<BankAccount> getAccounts() {
        return null;
    }
    //return balance
    public String getBalance() {
        System.out.println("balance");
        return "balance";
    }
    
    //Methods
    
    public String deposit(String amountOfDeposit) {
        balance = (balance + amountOfDeposit);
        return "balance";
    }
    public String withdraw(String amountToWithdraw) {
        balance = (balance + (amountToWithdraw));
        return "balance";
    }
    

        

        
        public String toString(){
            return accountNumber;
        }
    }
}
