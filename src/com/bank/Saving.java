package com.bank;

public class Saving {
    public static void main(String[] args) {

        BankingApplication person1 = new BankingApplication(8000);
        BankingApplication person2 = new BankingApplication(5000);
        BankingApplication.modifyInterestRate(.02);
        person1.calculateMonthlyInterest();
        BankingApplication.modifyInterestRate(.02);
        person2 .calculateMonthlyInterest();

        BankingApplication.modifyInterestRate(.03);
        person1.calculateMonthlyInterest();
        BankingApplication.modifyInterestRate(.03);
        person2.calculateMonthlyInterest();

    }
}
