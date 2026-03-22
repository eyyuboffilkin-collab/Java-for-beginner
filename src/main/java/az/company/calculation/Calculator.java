package az.company.calculation;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Java Calculator!");
        System.out.println("You can perform +, -, *, / operations.");

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Use +, -, *, /");
                    continue;
            }
            System.out.println("Result: " + result);

            boolean validInput = false;
            while (!validInput) {
                System.out.print("Do you want to continue? (y/n) ");
                char choice = sc.next().charAt(0);

                if (choice == 'y' || choice == 'Y') {
                    validInput = true;
                } else if (choice == 'n' || choice == 'N') {
                    keepRunning = false;
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please enter 'y' or 'n'.");
                }
            }
        }
        System.out.println("Thanks for using the calculator! Goodbye!");
        sc.close();


    }

}
