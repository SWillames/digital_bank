package com.company.domain;

import org.w3c.dom.ls.LSOutput;

public abstract class AccountImpl implements Account{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;
    protected String msg;

    public AccountImpl(Client client) {
        this.agency = AccountImpl.DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public String toWithdraw(double value) {
        if (balance < value) {
            msg = "Saldo insuficiente";
        } else {
            balance -= value;
            msg = "Saque realizado com sucesso!";
        }
        return msg;
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

    protected void infosComuns() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
