package com.company.domain;

public class SavingsAccount extends AccountImpl{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatment() {
        System.out.println("=== Extrato da Poupança ===");
        super.infosComuns();
    }
}
