package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public
class MainApplication {
    public static void main(String[] args) 

    {
        Console.println("Welcome to walnut Scientific calculator!");
        Console.println("The current display value is"); //current value
        Console.println("1.Addition\n2.Substraction\n3.multiplication\n4.division\n5.Square\6.Square root\n7.Inverse\n8.Invert sign");
        Console.println("9.Switch mode\n10.Trig functions \n11.factorial\n12.Percentage\n13.Cuberoot");
        Console.println("type exit to leave the calculator/ntype save to save a number in memory\n type memory clear to clear memory\n type recall to recall memory");
        ScientificCalculator calc = new ScientificCalculator(); // create calculator
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nCurrent Display: " + calc.getDisplay());
            String input=Console.getStringInput("Enter a number or type exit").toLowerCase();
        if (input.equals("exit")){
                Console.println("Exiting calculator..."); // exit message
                break;  //should leave the loop 
        }
        switch (input)
            {
                case "1":
                Console.println("Addition");
                double add = Console.getDoubleInput("Enter number to add:");
                calc.add(add); // call add function
                break;
                 case "2":
                Console.println("Substraction");
                double sub = Console.getDoubleInput("Enter number to subtract:");
                calc.subtract(sub); // call subtract function
                break;
                 case "3":
                Console.println("multiplication");
                double mul = Console.getDoubleInput("Enter number to multiply:");
                calc.multiply(mul); // call multiply function
                break;
                case "4":
                Console.println("division");
                double div = Console.getDoubleInput("Enter number to divide by:");
                calc.divide(div); // call divide function
                break;
                 case "5":
                Console.println("Square");
                calc.square(); // call square function
                break;
                 case "6":
                Console.println("Square root");
                calc.sqrt(); // call square root function
                break;
                case "7":
                Console.println("Inverse");
                calc.inverse(); // call inverse function
                break;
                 case "8":
                Console.println("Invert sign");
                calc.invertSign(); // call invert sign function 
                break;
                 case "9":
                Console.println("Switch mode");
                calc.switchmode(); // call switch mode function  working
                break;
                case "10":
                Console.println("Trig functions");
                calc.trigfunction(); // call trig function working
                break;
                 case "11":
                Console.println("factorial");
                calc.factorial();  // call factorial function working
                break;
                 case "12":
                Console.println("Percentage");
                calc.Percentage(); // call percentage 
                break;
                case "13":
                Console.println("Cuberoot");
                calc.Cuberoot(); // call cuberoot function working
                break;
                case "14":  // log functions is working
                 Console.println("Please enter a number that will be used to calculate log functions");
                            double x=Console.getDoubleInput("Enter a number");
                    Console.println("Please enter which log function you would like to use:\n1log,2ln,3inverselog,4inverseln");
                    String log=Console.getStringInput("Enter a number").toLowerCase();
                        switch (log)
                        {
                            case "1":
                            Console.println("The log base 10  is %f",calc.logbase10(x));
                            break;
                            case "2":
                            Console.println("The natural log  is %f",calc.ln(x));
                            break;
                            case "3":
                            Console.println("The inverse natural log  is %f",calc.Inverseln(x));
                            break;
                            case "4":
                            Console.println("The inverse log base 10  is %f",calc.Inverselog10(x));
                            break;
                     }   
                case ("save"): // this is working
                    double y=Console.getDoubleInput("Enter a number");
                    calc.memoryStorage(y);
                break;
                case ("memory clear"): // this is working
                    calc.memoryClear();
                break;
                case("recall"): // this is working
                    Console.println("The memory value is %f", calc.memoryRecall());
                break;
                     

                default:
                Console.println("Please try again");
            }
            
        }
        
    }

}
 
