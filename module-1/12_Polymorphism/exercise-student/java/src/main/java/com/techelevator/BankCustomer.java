package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //int[] middleElement = new int[2]
    public Accountable[] getAccounts() {
        Accountable[] accountableArray = new Accountable[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            accountableArray[i] = accounts.get(i);
        }
        return accountableArray;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int total = 0;
        for (Accountable account : accounts) {
            total = total + account.getBalance();

        }
        if (total >= 25000) {
            return true;
        } else {
            return false;
        }


    }

}





