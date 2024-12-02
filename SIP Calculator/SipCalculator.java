import java.util.Scanner;

public class SipCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SIP Calculator!");
        System.out.print("Enter the monthly investment amount (in INR): \n");
        double monthlyInvestment = sc.nextDouble();

        System.out.print("Enter the expected annual interest rate (in percentage):\n");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter the number of years you want to invest: \n");
        int years = sc.nextInt();

        double futureValue = calculateSIP(monthlyInvestment, annualInterestRate, years);
        System.out.println("The future value of your SIP investment after " + years + " years will be: " + formatAmount(futureValue));

    }

    public static double calculateSIP(double monthlyInvestment, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int totalMonths = years * 12;
        double futureValue = 0;

        for (int month = 1; month <= totalMonths; month++) {
            futureValue += monthlyInvestment * Math.pow(1 + monthlyInterestRate, totalMonths - month);
        }

        return futureValue;
    }

    public static String formatAmount(double amount) {
        if (amount >= 1_00_00_000) {
            return String.format("%.2f Cr", amount / 1_00_00_000); 
        } else if (amount >= 1_00_000) {
            return String.format("%.2f Lakh", amount / 1_00_000); 
        } else if (amount >= 1_000) {
            return String.format("%.2f Thousand", amount / 1_000); 
        } else {
            return String.format("%.2f", amount); 
        }
    }
}
