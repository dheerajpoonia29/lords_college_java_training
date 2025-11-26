package org.example.module_3.inheritance;

public class Main {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        obj.deposit(5000);
        obj.printBalance();
        obj.applyInterest();
        obj.printBalance();
    }
}
