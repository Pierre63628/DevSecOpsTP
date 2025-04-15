package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation (1-4): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case 4:
                try {
                    System.out.println("Result: " + calculator.divide(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
