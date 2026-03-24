package az.company.scanner;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my office!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("No permission!");
        } else {
            System.out.println("Welcome!");
        }


    }
}
