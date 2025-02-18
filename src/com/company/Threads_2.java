package com.company;

class A extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From Thread A : i = "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int j = 1; j <= 5; j++){
            System.out.println("\t From Thread B : j = "+j);
        }
        System.out.println("Exit From B");
    }
}
class C extends Thread{
    public void run(){
        for(int k = 1; k <= 5; k++){
            System.out.println("\t From Thread C : k = "+k);
        }
        System.out.println("Exit From C");
    }
}

public class Threads_2 {
    public static void main(String[] args) {

        //If run() is called via start() then different stack memories are used for each object and then execution is performed.
        //So the output will not be sequential but rather a random output will be shown.
        //The order of outputs may change if the program is executed for another time.

        new A().start();
        new B().start();
        new C().start();
    }
}
