package com.company;

import java.util.Scanner;
public class Exam_Prep {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b : ");
//        int b = sc.nextInt();
//        System.out.println("The sum of a and b is "+(a+b));

//        System.out.println(2/0);

//        moti-nehru mess



        int x = 8, y= 4,k = 1000, z = 4, diff;
//        try{
//            diff = x/(y-z);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero");
//        }
        try{
            float diffn = (float)x/(float)k;
            if(diffn < 0.01){
                throw new MyException("Number is too small");
            }
        }
        catch(MyException e){
            System.out.println("MyException caught");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am always here");
        }
    }
}
