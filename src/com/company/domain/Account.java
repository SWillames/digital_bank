package com.company.domain;

public interface Account {

    String toWithdraw(double value);

    void deposit(double value);

    void transfer(double valor, Account destinationAccount);

    void bankStatment();
}
