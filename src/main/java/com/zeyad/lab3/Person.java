/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeyad.lab3;

/**
 *
 * @author zeyad
 */
public class Person {

    private String name;
    private double salary;
    private boolean isWorking;
    private double monthlyExpenses;
    private final double defaultSalary = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
          this.salary = isWorking == false ? 0 : (salary == 0? this.defaultSalary:salary);
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
        this.salary = isWorking == false ? 0 : (this.salary == 0? this.defaultSalary:this.salary);
    }

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public double getDefaultSalary() {
        return defaultSalary;
    }

    public Person(String name) {
        this.name = name;
        this.salary = 0;
        this.monthlyExpenses = 0;
        this.isWorking = false;
    }

    public Person(String name, double salary, boolean isWorking, double monthlyExpenses) {
        this.name = name;
        this.salary = isWorking == false ? 0 : (salary == 0? this.defaultSalary:salary);
        this.isWorking = isWorking;
        this.monthlyExpenses = monthlyExpenses;
    }

    public double netIncome() {
        return this.salary - this.monthlyExpenses;
    }

}
