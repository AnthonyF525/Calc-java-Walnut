package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.*;




class Switch {
    public static void main (String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.println("Decimal, Binary, Octal, or Hex");
        String mode = sd.nextLine();
        

        switch (mode.toLowerCase()) {
            case "decimal":
                System.out.println(mode + " mode selected.");
                break;
            case "binary":
                System.out.println(mode + " mode selected.");
                System.out.println(Integer.toBinaryString(sd.nextInt()));
                break;
            case "octal":
                System.out.println(mode + " mode selected.");
                System.out.println(Integer.toOctalString(sd.nextInt()));
                break;
            case "hex":
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Radian or Degree? ");
        String radianOrDegree = sc.nextLine();

        if (radianOrDegree.equalsIgnoreCase("degree")){
            System.out.println("Which Operation? (sin, cos, tan, asin, acos, atan):");
            String operation = sc.nextLine();
            switch (operation) {
                case "sin":
                    System.out.print("What number do you want in the sin? ");
                    System.out.println(Math.sin(Math.toRadians(sc.nextInt())));
                    break;
                case "cos":
                    System.out.print("What number do you want in the cos? ");
                    System.out.println(Math.cos(Math.toRadians(sc.nextInt())));
                    break;
                case "tan":
                    System.out.print("What number do you want in the tan? ");
                    System.out.println(Math.tan(Math.toRadians(sc.nextInt())));
                    break;
                case "asin":
                    System.out.print("What number do you want in the asin? ");
                    System.out.println(Math.asin(Math.toRadians(sc.nextInt())));
                    break;
                case "acos":
                    System.out.print("What number do you want in the acos? ");
                    System.out.println(Math.acos(Math.toRadians(sc.nextInt())));
                    break;
                case "atan":
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
                case "sin":
                    System.out.print("What number do you want in the sin? ");
                    System.out.println(Math.sin(sc.nextInt()));
                    break;
                case "cos":
                    System.out.print("What number do you want in the cos? ");
                    System.out.println(Math.cos(sc.nextInt()));
                    break;
                case "tan":
                    System.out.print("What number do you want in the tan? ");
                    System.out.println(Math.tan(sc.nextInt()));
                    break;
                case "asin":
                    System.out.print("What number do you want in the asin? ");
                    System.out.println(Math.asin(Math.toRadians(sc.nextInt())));
                    break;
                case "acos":
                    System.out.print("What number do you want in the acos? ");
                    System.out.println(Math.acos(Math.toRadians(sc.nextInt())));
                    break;
                case "atan":
                    System.out.print("What number do you want in the atan? ");
                    System.out.println(Math.atan(Math.toRadians(sc.nextInt())));
                    break;
                default:
                    break;

        }
    }
}
}


