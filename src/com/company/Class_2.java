package com.company;
import java.util.*;
import java.io.*;

//1. Constructor(Default, Parameterized, Non-Parameterized, Private)
//2. Access Modifiers(Public,Private,Protected, Default)
//3. Taking Input from user(Command Line, Scanner Class, Red Line Method)
//4. "super" and "this" keyword

//NOTE: "super" keywords failed to execute

class Rect{
    double width,height;
    Rect(double w, double h){
        width = w;
        height = h;
    }
    double area(){
        return width*height;
    }
}

class Practice{
    int a;
    String name;
    //Non-Parameterized Constructor
//    Practice(){
//        a = 0;
//        name = null;
//    }
    void show(){
        System.out.println(a+" "+name);
    }
}

//Access Modifiers

class demo1{
    private int i = 22;
    public int j = 2;
    protected int l = 3;
    int k = 4;
    private void show(){
        System.out.println("Hello");
    }
    public void disp(){
        System.out.println("Bye");
        System.out.println("Value of i is : "+i);
    }
    void hello(){
        System.out.println("Hello to all");
    }
    protected void hi(){
        System.out.println("All to hell");
    }
}


//Using "super" for keyword
class ASuper{
    int x = 5;
}

class ASuperMax extends ASuper{
    int x = 10;
    void show(){
        System.out.println(super.x);
    }
}

//Using "super" for method
class BSuper{
    void show(){
        System.out.println("Hello to GEC");
    }
}
class BSuperMax extends BSuper{
    void show(){
        super.show();
        System.out.println("Bye");
    }
}

//Using "super" for constructor
class CSuper{
    CSuper(int x){
        System.out.println("Hello GEC");
    }
}
class CSuperMax extends CSuper{
    CSuperMax(int x){
        super(x);
        System.out.println("BYE");
    }
}

//"this" keyword
//"this" non-Parameterized keyword
class thisA{
    int a;
    thisA(int a){
        this.a = a;
    }
    void show(){
        System.out.println("This keyword 'a' for non-Parameterized this is: "+a);
    }
}
//"this" Parameterized keyword
class thisB{
    thisB(){
        this(10);
    }
    thisB(int a){
        System.out.println("This keyword 'a' for Parameterized this is: "+a);
    }
}

public class Class_2 {
    public static void main(String[] args) throws IOException{
        Practice ref = new Practice(); //Creating an Object "ref"
        ref.show();

        //Creating Objects for Rect class namely a1,a2
        Rect a1 = new Rect(10,20);
        Rect a2 = new Rect(5,10);

        //Using area() method of Rect class
        System.out.println("Area for a1 is "+a1.area());
        System.out.println("Area for a2 is "+a2.area());

        //Access Modifiers
        //Creating Access Modifiers
        demo1 a = new demo1();
//        a.show();//will show error because protected
        a.hello();
        a.hi();
        a.disp();
        System.out.println(a.j);
        System.out.println(a.k);
        System.out.println(a.l);
//        System.out.println(a.i);

        //Using "super" keyword
        //"super" for keyword
        ASuperMax Ar = new ASuperMax();
        Ar.show();
        //"super" for method
        BSuper Br = new BSuper();
        Br.show();
        //"super" for constructor
        CSuper Cr = new CSuper(5);

        //"this" keyword
        //non-Parameterized
        thisA thisr = new thisA(5);
        thisr.show();
        //Parameterized
        thisB thisbr = new thisB(4);

        //Red-Line Method
        InputStreamReader ob = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ob);
        System.out.println("Enter the data: ");
        String s = br.readLine();
        System.out.println("Output is : "+s);
    }
}
