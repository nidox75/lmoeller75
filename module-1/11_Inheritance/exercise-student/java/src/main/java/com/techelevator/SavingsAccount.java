package com.techelevator;

import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String accountNumber, String accountHolderName, String balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public String withdraw(String amountToWithdraw) {
        if (super.getBalance() >150){
            super.withdraw(amountToWithdraw);
        }else{
            if (super.getBalance() <150 && (super.getBalance()>=0) &&(amountToWithdraw()
            <=(super.getBalance()(super.withdraw(amountToWithdraw)) + new String("2.00"));

        } else{
            return super.getBalance();
        }
    }
}
