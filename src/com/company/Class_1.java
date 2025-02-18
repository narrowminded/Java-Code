package com.company;
import java.util.*;

public class Class_1 {
//    class String{
//        int String = 234;
//        System.out.println(String);
//    }
//
//    class Runnable{
//        int Runnable = 623;
//        System.out.println(Runnable);
//    }

    //HomeWork to add two numbers by taking input from the user
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int xxxxxxxbbcdefgha2lufluyfuyfuhflyufyuyu309bc = 10;
        System.out.println(xxxxxxxbbcdefgha2lufluyfuyfuhflyufyuyu309bc);
//        byte b = True;
//        boolean b = true;
//        while(1){
//            System.out.println("Hello");
//        }
//        System.out.println(b);
        int a = 2;
        System.out.println(++a);
        int b = 5;
        System.out.println(a+b);
//        boolean c = ((a>b)?(a:b));
//        System.out.println(c);


        //Operators
        int x = 10;
        int y= --x;
        System.out.println(y);

        int i = 6;
        int j = i+1;
        System.out.println(i);
        System.out.println(j);

        int k = 6;
        int l = ++k;
        System.out.println(k);
        System.out.println(l);


        //TypeCasting
        int g = 10;
        long z = 1;
        double d = 3.4;
        byte h;
        h = (byte) g;
        System.out.println(h);
        g = (int) z;
        System.out.println(g);

        //HomeWork Adding two numbers
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first : ");
        num1 = sc.nextInt();
        System.out.println("Enter second : ");
        num2 = sc.nextInt();
        System.out.println("The sum of "+num1+" and "+num2+" is : "+add(num1,num2));
    }

}
