package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class JBMainApplication {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrent Display: " + calc.getDisplay());
            System.out.print("Enter operation (add, subtract, multiply, divide, square, sqrt, pow, inv, sign, clear, exit): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) break;

            if (calc.hasError() && !input.equals("clear")) {
                System.out.println("Error state! Type 'clear' to reset.");
                continue;
            }

            switch (input) {
                case "add":
                    calc.add(getDouble(scanner, "Enter number to add: "));
                    break;
                case "subtract":
                    calc.subtract(getDouble(scanner, "Enter number to subtract: "));
                    break;
                case "multiply":
                    calc.multiply(getDouble(scanner, "Enter number to multiply: "));
                    break;
                case "divide":
                    calc.divide(getDouble(scanner, "Enter number to divide by: "));
                    break;
                case "square":
                    calc.square();
                    break;
                case "sqrt":
                    calc.sqrt();
                    break;
                case "pow":
                    calc.exponentiate(getDouble(scanner, "Enter exponent (y): "));
                    break;
                case "inv":
                    calc.inverse();
                    break;
                case "sign":
                    calc.inverse();
                    break;
                case "clear":
                    calc.clear();
                    break;
                default:
                    System.out.println("Unknown operation.");
            }
        }

        scanner.close();
    }

    private static double getDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Try again.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }
}

