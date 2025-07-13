package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;




class Switch {
    public static void main (String[] args) 
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
    // public static void switchDisplayMode(String mode) {
       
    //     Scanner sc = new Scanner(System.in);
    //     int Decimal;
        
    //     System.out.println("Enter a Decimal number:");
    //     Decimal = sc.nextInt();

    //     String Binary, Octal, Hexadecimal;
    //     Binary = Integer.toBinaryString(Decimal);
    //     Octal = Integer. toOctalString(Decimal);
    //     Hexadecimal = Integer.toHexString(Decimal);
        
    //     System.out.println("Decimal: " + Decimal + " " + "Binary: " + Binary + " " + "Octal: " + Octal + " " + "Hexadecimal: " + Hexadecimal);

        
    }



class Trig {
    public static void main(String[] args) 
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
}


