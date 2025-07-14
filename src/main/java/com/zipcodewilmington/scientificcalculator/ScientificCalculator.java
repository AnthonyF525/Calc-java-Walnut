/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

class ScientificCalculator 
{   
    private static double display = 0.0; // current number on screen
    private boolean hasError = false;  // flag if an error happened
    public double memory = 0.0; // starting value of memory

/////////////////////////////////////////////////////////////////////////////////////////////
// basic calculator functions Josiah`work


    public void Calculator() {
        this.display = 0.0;
        this.memory = 0.0;
        this.hasError = false;
    }

    // Display methods
    public String getDisplay() {
        return hasError ? "Err" : String.valueOf(display);
    }

    public double getDisplayValue() {
        return display;
    }

    public boolean hasError() {
        return hasError;
    }

    public void clear() {
        display = 0.0;
        hasError = false;
    }

    public void set(double value) {
        if (!hasError) {
            display = value;
        }
    }

    // Arithmetic
    public void add(double value) {
        if (!hasError) display += value;
    }

    public void subtract(double value) {
        if (!hasError) display -= value;
    }

    public void multiply(double value) {
        if (!hasError) display *= value;
    }

    public void divide(double value) {
        if (!hasError) {
            if (value == 0) {
                setError();
            } else {
                display /= value;
            }
        }
    }

    public void square() {
        if (!hasError) display *= display;
    }

    public void sqrt() {
        if (!hasError) {
            if (display < 0) {
                setError();
            } else {
                display = Math.sqrt(display);
            }
        }
    }

    public void power(double exponent) {
        if (!hasError) display = Math.pow(display, exponent);
    }

    public void inverse() {
        if (!hasError) {
            if (display == 0) {
                setError();
            } else {
                display = 1 / display;
            }
        }
    }

    public void invertSign() {
        if (!hasError) display = -display;
    }

    private void setError() {
        display = Double.NaN;
        hasError = true;
    }

    // Memory Functions

    public void memoryStore() {
        if (!hasError) {
            memory = display;
        }
    }
    public void memoryAdd() {
        if (!hasError) {
            memory += display;
        }
    }

    public void memorySubtract() {
        if (!hasError) {
            memory -= display;
        }
    }

    public double getMemoryValue() {
        return memory;
    }

    // Anthony's work
    public static void switchmode () // 9.switch mode
    {
        Scanner sd = new Scanner(System.in);

        System.out.println("Decimal, Binary, Octal, or Hex");
        String mode = sd.nextLine();
        

        switch (mode.toLowerCase()) {
            case "decimal": // Select Decimal mode
                System.out.println(mode + " mode selected.");
                break;
            case "binary": // Select Binary mode
                System.out.println(mode + " mode selected.");
                System.out.println(Integer.toBinaryString(sd.nextInt()));
                break;
            case "octal": // Select Octal mode
                System.out.println(mode + " mode selected.");
                System.out.println(Integer.toOctalString(sd.nextInt()));
                break;
            case "hex": // Select Hexadecimal mode
                System.out.println(mode + " mode selected.");
                System.out.println(Integer.toHexString(sd.nextInt()));
                break;
            default:
                break;
        }
    }
    public static void trigfunction() // function 10
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Radian or Degree? "); // Ask for Radian or Degree
        String radianOrDegree = sc.nextLine();

        if (radianOrDegree.equalsIgnoreCase("degree")){
            System.out.println("Which Operation? (sin, cos, tan, asin, acos, atan):"); //Ask for the operation
            String operation = sc.nextLine();
            switch (operation) {
                case "sin": // Perform sine operation, Radian
                    System.out.print("What number do you want in the sin? ");
                    System.out.println(Math.sin(Math.toRadians(sc.nextInt())));
                    break;
                case "cos": // Perform cosine operation, Radian
                    System.out.print("What number do you want in the cos? ");
                    System.out.println(Math.cos(Math.toRadians(sc.nextInt())));
                    break;
                case "tan": // Perform tangent operation, Radian
                    System.out.print("What number do you want in the tan? ");
                    System.out.println(Math.tan(Math.toRadians(sc.nextInt())));
                    break;
                case "asin": // Perform arcsine operation, Radian
                    System.out.print("What number do you want in the asin? ");
                    System.out.println(Math.asin(Math.toRadians(sc.nextInt())));
                    break;
                case "acos": // Perform arccosine operation, Radian
                    System.out.print("What number do you want in the acos? ");
                    System.out.println(Math.acos(Math.toRadians(sc.nextInt())));
                    break;
                case "atan": // Perform arctangent operation, Radian 
                    System.out.print("What number do you want in the atan? ");
                    System.out.println(Math.atan(Math.toRadians(sc.nextInt())));
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Which Operation? (sin, cos, tan, asin, acos, atan):");
            String operation = sc.nextLine();
            switch (operation) {
                case "sin": // Perform sine operation
                    System.out.print("What number do you want in the sin? ");
                    System.out.println(Math.sin(sc.nextInt()));
                    break;
                case "cos": // Perform cosine operation
                    System.out.print("What number do you want in the cos? ");
                    System.out.println(Math.cos(sc.nextInt()));
                    break;
                case "tan": // Perform tangent operation
                    System.out.print("What number do you want in the tan? ");
                    System.out.println(Math.tan(sc.nextInt()));
                    break;
                case "asin": // Perform arcsine operation
                    System.out.print("What number do you want in the asin? ");
                    System.out.println(Math.asin(sc.nextInt()));
                    break;
                case "acos": // Perform arccosine operation
                    System.out.print("What number do you want in the acos? ");
                    System.out.println(Math.acos(sc.nextInt()));
                    break;
                case "atan": // Perform arctangent operation
                    System.out.print("What number do you want in the atan? ");
                    System.out.println(Math.atan(sc.nextInt()));
                    break;
                default:
                    break;

        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
/// Younis's work
    public static long factorial() //11. factorial 
    {  
        Console.println("please enter a number to calculate factorial");
        int x= Console.getIntegerInput("Enter a number: "); // ask user to type
        if (x<0)
        {
        throw new IllegalArgumentException("Factroial not defined for negative numbers");
        }
        long result =1;  // factorial of zero is always zero 
        for (int i=1;i <=x;i++)
        {   
        result = result * i;
        }
        Console.println("the answer is "+ result);
        return result;

    }

    public static double logbase10(double x) // mehtod to calculate log base 10
    {
        if (x <= 0)
        {   
        Console.println("Error: Logarithm is not defined for non-positive numbers.");
        }
        return Math.log10(x);  // return log10(X)
    }

    public static double Inverselog10(double x) // method to calculate inverse log 10
    {
           
        return Math.log(x);  // return inverse log base 10
    }

    public static double ln(double x)  // method to calculate natural log
    {
        if (x <= 0)
        {
        Console.println("Error: Natural log is not defined for non-positive numbers.");
        }
        
        return Math.exp(x);  // return inverse ln(x)
        
    
    }
    public static double Inverseln(double x) // method to calculate inverse log
    {
        
        return Math.log(x);  // return ln(x)

    }
        public void memoryStorage(double y)
    {
        String input=Console.getStringInput("Would you like to save this number? yes or no").toLowerCase();
        if ("yes".equals(input))
        {
        memory = y;
        }
        else if ("no".equals(input))
        {
            Console.println("The memory value is not saved");
        }
      
        
    }
        public void memoryClear()
        {
            Console.println("The memory value is cleared");
            memory= 0.0;
        }
        public double memoryRecall()
        {
        return memory;
        }
    public long Percentage() 
    {
        Console.println("Enter the part value:");
        int x = Console.getIntegerInput("Enter a number:");
        Console.println("Enter the total value:");
        int y = Console.getIntegerInput("Enter a number:");

        if (y <= 0) {
            Console.println("Error: Total must be greater than 0.");
            return 0;
        }

        long result = (x * 100) / y;
        Console.println("The percentage is " + result + "%");
        return result;
    }
    public long Cuberoot() // 13.cuberoot
    {
        Console.println("Enter a number to calculate the cube root:");
        double x = Console.getDoubleInput("Enter a number:");
        if (x < 0) {
            Console.println("Error: Cube root is not defined for negative numbers.");
            return 0;
        }
        long result = (long) Math.cbrt(x);
        Console.println("The cube root of is " + result);
        return result;
    }



        
}

    





