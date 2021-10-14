package com.techelevator;
/*A CreditCardAccount isn't a BankAccount but "can-do" Accountable.

        Constructor	Description
        CreditCardAccount(String accountHolder, String accountNumber)	A new credit card account requires an account holder name and account number. The debt defaults to a 0 dollar balance.
        Attribute Name	Data Type	Get	Set	Description
        accountHolder	String	X		Returns the account holder name that the account belongs to.
        accountNumber	String	X		Returns the account number that the account belongs to.
        debt	int	X		Returns the amount the customer owes.*/

public class CreditCardAccount implements Accountable {
    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }

    public int pay(int amountToPay) {
        debt = debt - amountToPay;
        return debt;
    }

    public int charge(int amountToCharge) {
        debt = debt + amountToCharge;
        return debt;
    }

    @Override
    public int getBalance() {
        return -debt;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
}
