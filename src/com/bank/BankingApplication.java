package com.bank;

public class BankingApplication {
    private static double annualInterestRate;
    private static double savingsBalance;


    public BankingApplication() {
        savingsBalance = 0;
        annualInterestRate =0;

    }
    public BankingApplication(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;

    }
    public void calculateMonthlyInterest() {
        System.out.println("Current savings balance is : " +savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) /12;
        savingsBalance += monthlyInterest;
        System.out.println("New saving balance after calculating monthly interest is");

    }
    public static double getBalance() {
        return savingsBalance;
    }
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

}
class SpecialSavings extends BankingApplication{
    protected static void modifyInterestRate() {
        if (BankingApplication.getBalance() >10000) {
            modifyInterestRate(0.1);
        }
    }
}