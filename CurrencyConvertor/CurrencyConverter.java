import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double INR_to_USD = 0.012;
        double INR_to_EUR = 0.008;
        double INR_to_GBP = 0.0065;
        double INR_to_AUD = 0.019;
        double INR_to_CAD = 0.018;
        double INR_to_JPY = 11.22;
        double INR_to_CNY = 0.085;
        double INR_to_KRW = 16.40;
        double INR_to_RUB = 1.09;
        double INR_to_SGD = 0.018;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Choose the currency you want to convert to from INR:\n");
        System.out.println("1. USD (United States Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. AUD (Australian Dollar)");
        System.out.println("5. CAD (Canadian Dollar)");
        System.out.println("6. JPY (Japanese Yen)");
        System.out.println("7. CNY (Chinese Yuan)");
        System.out.println("8. KRW (South Korean Won)");
        System.out.println("9. RUB (Russian Ruble)");
        System.out.println("10. SGD (Singapore Dollar)");

        System.out.print("Enter your choice (1-10): \n");
        int choice = sc.nextInt();

        System.out.print("Enter the amount in INR:\n");
        double amountINR = sc.nextDouble();

        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = amountINR * INR_to_USD;
                System.out.println(amountINR + " INR = " + convertedAmount + " USD");
                break;
            case 2:
                convertedAmount = amountINR * INR_to_EUR;
                System.out.println(amountINR + " INR = " + convertedAmount + " EUR");
                break;
            case 3:
                convertedAmount = amountINR * INR_to_GBP;
                System.out.println(amountINR + " INR = " + convertedAmount + " GBP");
                break;
            case 4:
                convertedAmount = amountINR * INR_to_AUD;
                System.out.println(amountINR + " INR = " + convertedAmount + " AUD");
                break;
            case 5:
                convertedAmount = amountINR * INR_to_CAD;
                System.out.println(amountINR + " INR = " + convertedAmount + " CAD");
                break;
            case 6:
                convertedAmount = amountINR * INR_to_JPY;
                System.out.println(amountINR + " INR = " + convertedAmount + " JPY");
                break;
            case 7:
                convertedAmount = amountINR * INR_to_CNY;
                System.out.println(amountINR + " INR = " + convertedAmount + " CNY");
                break;
            case 8:
                convertedAmount = amountINR * INR_to_KRW;
                System.out.println(amountINR + " INR = " + convertedAmount + " KRW");
                break;
            case 9:
                convertedAmount = amountINR * INR_to_RUB;
                System.out.println(amountINR + " INR = " + convertedAmount + " RUB");
                break;
            case 10:
                convertedAmount = amountINR * INR_to_SGD;
                System.out.println(amountINR + " INR = " + convertedAmount + " SGD");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
        }

    }
}
