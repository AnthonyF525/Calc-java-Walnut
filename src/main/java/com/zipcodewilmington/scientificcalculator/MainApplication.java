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
                calc.switchmode(); // call switch mode function this is working
                break;
                case "10":
                Console.println("Trig functions");
                calc.trigfunction(); // call trig function this is working
                break;
                 case "11":
                Console.println("factorial");
                calc.factorial();  // call factorial function this is working
                break;
                 case "12":
                Console.println("Percentage");
                break;
                case "13":
                Console.println("Cuberoot");
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
                case ("clear"): // this is working
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
 
