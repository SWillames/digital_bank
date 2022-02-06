package com.company.domain;

public interface Account {

    void toWithdraw(double value);

    void deposit(double value);

    void transfer(double valor, Account destinationAccount);
}
