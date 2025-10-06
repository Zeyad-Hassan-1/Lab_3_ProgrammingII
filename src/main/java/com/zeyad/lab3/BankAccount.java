/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeyad.lab3;

/**
 *
 * @author zeyad
 */
public class BankAccount {

    private String accountNumber;
    private String name;
    private double currentBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BankAccount(String accountNumber, String name, double currentBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.currentBalance = currentBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.currentBalance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if(amount > 0 && this.currentBalance >= amount){
            this.currentBalance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

}