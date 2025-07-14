package com.zipcodewilmington.scientificcalculator;

public class JBMainApplication {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        boolean running = true;

        Console.println("Welcome to Walnut Scientific Calculator!");

        while (running) {
            Console.println("\nDisplay: " + calc.getDisplay());

            if (calc.hasError()) {
                Console.println("Error state. Please clear before continuing.");
                String command = Console.getStringInput("Type 'clear' to reset or 'exit' to quit").toLowerCase();

                if (command.equals("clear")) {
                    calc.clear();
                } else if (command.equals("exit")) {
                    running = false;
                }
                // Skip rest of loop to avoid other commands when in error
                continue;
            }

            String input = Console.getStringInput("Enter operation (set, add, subtract, multiply, divide, square, sqrt, power, inverse, invert, ms, mr, mc, m+, m-, mem, clear, exit)").toLowerCase();

            switch (input) {
                case "exit":
                    running = false;
                    break;

                case "clear":
                    calc.clear();
                    break;

                case "set":
                    double setValue = Console.getDoubleInput("Enter value");
                    calc.set(setValue);
                    break;

                case "add":
                    double addValue = Console.getDoubleInput("Add: ");
                    calc.add(addValue);
                    break;

                case "subtract":
                    double subValue = Console.getDoubleInput("Subtract: ");
                    calc.subtract(subValue);
                    break;

                case "multiply":
                    double mulValue = Console.getDoubleInput("Multiply by: ");
                    calc.multiply(mulValue);
                    break;

                case "divide":
                    double divValue = Console.getDoubleInput("Divide by: ");
                    calc.divide(divValue);
                    break;

                case "square":
                    calc.square();
                    break;

                case "sqrt":
                    calc.sqrt();
                    break;

                case "power":
                    double expValue = Console.getDoubleInput("Raise to power: ");
                    calc.power(expValue);
                    break;

                case "inverse":
                    calc.inverse();
                    break;

                case "invert":
                    calc.invertSign();
                    break;

                // Memory functions
                case "ms":
                    calc.memoryStore();
                    Console.println("Stored current display to memory.");
                    break;

                case "mr":
                    calc.memoryRecall();
                    Console.println("Recalled memory to display.");
                    break;

                case "mc":
                    calc.memoryClear();
                    Console.println("Memory cleared.");
                    break;

                case "m+":
                    calc.memoryAdd();
                    Console.println("Added current display to memory.");
                    break;

                case "m-":
                    calc.memorySubtract();
                    Console.println("Subtracted current display from memory.");
                    break;

                case "mem":
                    Console.println("Memory value: " + calc.getMemoryValue());
                    break;

                default:
                    Console.println("Unknown command. Please try again.");
            }
        }

        Console.println("Goodbye!");
    }
}

