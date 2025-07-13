package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) 
    {
        while (true) 
        {  
            try {
                String input = getStringInput(prompt);  // ask user to type
                return Integer.parseInt(input);         // try converting to integer
                } 
            catch (NumberFormatException e) 
                {
                println("Invalid Please try again."); //print string to user
                }
        }
    }

    public static Double getDoubleInput(String prompt) {
         while (true) 
         { // keep asking until valid input
            try {
                String input = getStringInput(prompt); // ask user to type
                return Double.parseDouble(input); // try converting to double
                } 
        catch (NumberFormatException e) 
                {
                println("Invalid Please try again."); // print string to user
                }
    }
    }
}
