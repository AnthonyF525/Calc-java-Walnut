package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;



class JBMainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("\nCurrent Display: " + Currentvaluedisplay());
        System.out.println("Enter operation (add, subtract, multiply, divide, change, sqrt, pow, inv, ): ");
        String operation = scanner.nextLine();

        int a = getNumber(scanner, "Enter first number: ");
        int b = getNumber(scanner, "Enter second number: ");

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + add(a, b));
                break;
            case "subtract":
                System.out.println("Result: " + subtract(a, b));
                break;
            case "multiply":
                System.out.println("Result: " + multiply(a, b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + divide(a, b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
                case "sqrt":
                System.out.println("What number do you want in sqrt: ");
                double num = scanner.nextDouble();
                if (num < 0) {
                    System.out.println("Error: Cannot take square rootvof a negative number.");
                } else {
                    double result = Math.sqrt(num);
                    System.out.println("Result: " + result);
                }
                break;
                    default:
                    break;
                }
            }
           

       

    private static String Currentvaluedisplay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Currentvaluedisplay'");
    }




    // Arithmetic methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    private static int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number, try again.");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
}



