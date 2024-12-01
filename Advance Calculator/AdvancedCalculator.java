import java.util.*;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Advanced Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Factorial");
            System.out.println("8. Logarithm (base 10)");
            System.out.println("9. Logarithm (Custom Base)");
            System.out.println("10. Percentage");
            System.out.println("11. Modulus");
            System.out.println("12. Prime Check");
            System.out.println("13. Fibonacci");
            System.out.println("14. Trigonometric Functions");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 15) {
                System.out.println("Exiting the calculator...");
                break;
            }

            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + sqrt(num1));
                    break;

                case 6:
                    System.out.print("Enter the base and exponent: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + power(num1, num2));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + factorial((int) num1));
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + log(num1));
                    break;

                case 9:
                    System.out.print("Enter a number and the base: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + customLog(num1, num2));
                    break;

                case 10:
                    System.out.print("Enter the total and percentage: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + percentage(num1, num2));
                    break;

                case 11:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + modulus(num1, num2));
                    break;

                case 12:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + isPrime((int) num1));
                    break;

                case 13:
                    System.out.print("Enter the number of Fibonacci terms: ");
                    int n = sc.nextInt();
                    System.out.println("Fibonacci Series: ");
                    fibonacci(n);
                    break;

                case 14:
                    System.out.println("Trigonometric Functions:");
                    System.out.print("Enter an angle in degrees: ");
                    num1 = sc.nextDouble();
                    System.out.println("sin: " + Math.sin(Math.toRadians(num1)));
                    System.out.println("cos: " + Math.cos(Math.toRadians(num1)));
                    System.out.println("tan: " + Math.tan(Math.toRadians(num1)));
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static double log(double a) {
        return Math.log10(a);  // Logarithm to the base 10
    }

    public static double customLog(double a, double base) {
        return Math.log(a) / Math.log(base);  // Logarithm with custom base
    }

    public static double percentage(double total, double percent) {
        return (total * percent) / 100;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
