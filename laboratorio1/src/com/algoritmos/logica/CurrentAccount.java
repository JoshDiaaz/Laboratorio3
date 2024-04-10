package com.algoritmos.logica;

import com.algoritmos.entidad.Client;

public class CurrentAccount extends Account {
    
    public CurrentAccount() {
    }

    public CurrentAccount(String accountName, double balance, Client client) {
        super(accountName, balance, client);
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(super.getBalance() - amount);
    }

    @Override
    public double interesCalculation() {
        // Las cuentas corrientes no generan intereses
        return super.getBalance();
    }

    @Override
    public String toString() {
        return "Account type: Current Account\n" + super.toString();
    }
}
