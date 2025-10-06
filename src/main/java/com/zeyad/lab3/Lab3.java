/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.zeyad.lab3;

import java.util.Scanner;

/**
 *
 * @author zeyad
 */
public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber, accountHolderName;
        double initialBalance;
        System.out.println("Create a new bank account ");
        System.out.print("1. Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("2. Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("3. Initial Balance: ");
        initialBalance = sc.nextDouble();
        sc.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);

        System.out.println("Enter the number of operation you want to do or enter anything else to exit");
        String choice;
        do {
            System.out.println("1- Deposit\n2- Withdraw\n3- Check balance");
            choice = sc.next();

            switch (choice) {
                case "1":
                    double depositAmount;
                    System.out.print("Deposit Amount: ");
                    depositAmount = sc.nextDouble();
                    if (depositAmount < 0) {
                        System.out.println("You should enter positive amount, deposit failed");
                    } else {
                        bankAccount.deposit(depositAmount);
                        System.out.println("New Balance: " + bankAccount.getCurrentBalance());
                    }
                    break;
                case "2":
                    double withdrawAmount;
                    System.out.print("Withdrawal Amount: ");
                    withdrawAmount = sc.nextDouble();
                    if (withdrawAmount < 0) {
                        System.out.println("You should enter positive amount, withdraw failed");
                    } else if (withdrawAmount > bankAccount.getCurrentBalance()) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    } else {
                        bankAccount.withdraw(withdrawAmount);
                        System.out.println("New Balance: " + bankAccount.getCurrentBalance());
                    }
                    break;
                case "3":
                    System.out.println("Current Balance :  " + bankAccount.getCurrentBalance());
                    break;
                default:
                    System.out.println("Exit");
            }
        } while (choice.equals("1") || choice.equals("2") || choice.equals("3"));
    }
}
