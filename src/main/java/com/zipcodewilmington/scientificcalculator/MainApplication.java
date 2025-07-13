package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) 

    {
        Console.println("Welcome to walnut Scientific calculator!");
        Console.println("The current display value is"); //current value
        Console.println("1.Addition\n2.Substraction\n3.multiplication\4.division\n5.Square\6.Square root\n7.Inverse\n8.Invert sign");
        Console.println("9.Switch mode\n10.Trig functions \n11.factorial\n12.Percentage\n13.Cuberoot");
        Console.println("type exit to leave the calculator");
        ScientificCalculator calc = new ScientificCalculator(); // create calculator
        while(true)
        {
            String input=Console.getStringInput("Enter a number or type exit").toLowerCase();

        if (input=="exit")
            
                System.exit(0);  //should leave the loop but doesnt work yet
            
             
        switch (input)
            {
                case "1":
                Console.println("Addition");
                break;
                 case "2":
                Console.println("Substraction");
                break;
                 case "3":
                Console.println("multiplication");
                break;
                case "4":
                Console.println("division");
                break;
                 case "5":
                Console.println("Square");
                break;
                 case "6":
                Console.println("Square root");
                break;
                case "7":
                Console.println("Inverse");
                break;
                 case "8":
                Console.println("Invert sign");
                break;
                 case "9":
                Console.println("Switch mode");
                break;
                case "10":
                Console.println("Trig functions");
                break;
                 case "11":
                Console.println("factorial");
               // calc.factorial();
                break;
                 case "12":
                Console.println("Percentage");
                break;
                case "13":
                Console.println("Cuberoot");
                break;

                default:
                Console.println("Please try again");
            }
            
        }
        
       



       /* String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */
    }
}
