package com.company.domain;

import java.text.SimpleDateFormat;

public class SavingsAccount {
    
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    private int agency;
    private int number;
    private double balance;
    private Client client;

    public SavingsAccount(Client client) {
        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
