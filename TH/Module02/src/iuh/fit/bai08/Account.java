/*
 * @ (#) Account.java       1.0      10/2/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai08;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 10/2/2024 2:02 AM
 */
public class Account {

    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;


    //constructors
    public Account(){
        this(000000, "chưa xác định", 50000);
    }
    public Account(long accountNumber, String name, double balance){
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(balance);
    }

    public Account(long accountNumber, String name){
        setAccountNumber(accountNumber);
        setName(name);
    }

    //getters and setters

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber < 0){
            this.accountNumber = 0;
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equalsIgnoreCase("") || name == null){
            this.name = "chưa xác định";
        } else {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 50000){
            this.balance = 50000;
        } else {
            this.balance = balance;
        }
    }

    public double getRATE() {
        return RATE;
    }

    //methods

    public boolean deposit(double amount){
        if (amount >0){
            balance += amount;
            return true;
        }else{
            return false;
        }
    }

    public boolean withdraw(double amount, double fee){
        if (amount >0 && amount + fee <= balance){
            balance = balance - amount - fee;
            return true;
        }else{
            return false;
        }
    }

    public void addInterest(){
        balance = balance + balance * RATE;
    }

    public boolean tranfer(Account acc2, double amount){
        if (amount >0 && amount <= balance){
            this.balance = this.balance - amount;
            acc2.balance = acc2.balance + amount;
            return true;
        }else{
            return false;
        }
    }


    //money format
    Locale local = new Locale("vi", "VN");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

    @Override
    public String toString(){
        return String.format("%-20d %-20s %-20s %-20s", accountNumber, name, formatter.format(balance), formatter.format(balance * RATE));
    }
}
