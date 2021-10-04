package com.techelevator

public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
        super();
    }
    public CheckingAccount(String accountNumber, String balance, String accountHolderName) {
        super(accountNumber, accountHolderName,  balance);
    }
    @Override
    public String withdraw(String amountToWithdraw) {
        if(super.getBalance(double) >= amountToWithdraw(double))
            super.withdraw((amountToWithdraw));
        }else {
            if(super.getBalance() +  super.withdraw() >= -100)
                super.withdraw() + new String("10")));
            }
            else {
                return  super.getBalance();
            }

        return super.getBalance();
    }
}
