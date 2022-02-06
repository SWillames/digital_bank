package com.company.domain;

public class CheckingAccount implements Account{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    private int agency;
    private int number;
    private double balance;
    private Client client;

    public CheckingAccount(Client client) {
        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void toWithdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.toWithdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
