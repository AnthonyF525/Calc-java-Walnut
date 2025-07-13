/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.zipcodewilmington.scientificcalculator;


class ScientificCalculator 
{
    private static double Currentvaluedisplay = 0.0; // current number on screen
    private boolean Error = false;  // flag if an error happened

    public static long factorial(long x) //method to calculate factorial
    {
        //if (Currentvaluedisplay<0)
        //{
        //throw new IllegalArgumentException("Factroial not defined for negative numbers");
        //}
        long result =1;  // factorial of zero is always zero 
        for (int i=1;i <=Currentvaluedisplay;i++)
        {   
        result = result *i;
        }
        return result;

    }

    public static double logbase10(double x) // mehtod to calculate log base 10
    {
        if (x <= 0)
        {
        throw new IllegalArgumentException("Err");
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
        throw new IllegalArgumentException("Err");
        }
        return Math.exp(x);  // return inverse ln(x)

    }
    public static double Inverseln(double x) // method to calculate inverse log
    {
        
        return Math.log(x);  // return ln(x)

    }

    private double memory = 0.0; // starting value of memeory
    
        public void memoryStorage(double x)
        {
        memory = x;
        }
        public void memoryClear()
        {
        memory= 0.0;
        }
        public double memoryRecall()
        {
        return memory;
        }


}

    





