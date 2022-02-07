package com.company.domain;

public class CheckingAccount extends AccountImpl{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatment() {
        System.out.printf("=== Extrato da Conta Corrente ===");
        super.infosComuns();
    }
}
