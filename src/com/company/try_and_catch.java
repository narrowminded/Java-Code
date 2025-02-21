package com.company;

import java.sql.SQLOutput;

public class try_and_catch {
    public static void main(String[] args) {

        //Example 13.4
        int a = 10, b = 5, c = 5, x, y;
        try{
            x = a / (b-c); //Exception here
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        int p = 10;
//        y = p/(b-c);
//        System.out.println("y = "+y);

        //Example 13.5
        int invalid = 0;//Number of invalid arguments
        int number,count = 0;
        for(int i = 0; i < args.length; i++){
            try{
                number = Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
                invalid = invalid + 1; //Caught an invalid number
                System.out.println("Invalid Number : "+args[i]);
                continue;
            }
            count+=1;
        }
        System.out.println("Valid Numbers : "+count);
        System.out.println("Invalid Numbers : "+invalid);
    }
}
