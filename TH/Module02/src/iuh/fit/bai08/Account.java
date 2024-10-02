/*
 * @ (#) Account.java       1.0      10/2/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai08;

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
        this(0, "", 0);
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
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRATE() {
        return RATE;
    }
}
