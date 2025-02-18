package com.company;

class D extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From Thread A : i = "+i);
        }
        System.out.println("Exit from A");
    }
}
class E extends Thread{
    public void run(){
        for(int j = 1; j <= 5; j++){
            System.out.println("\t From Thread B : j = "+j);
        }
        System.out.println("Exit From B");
    }
}
class F extends Thread{
    public void run(){
        for(int k = 1; k <= 5; k++){
            System.out.println("\t From Thread C : k = "+k);
        }
        System.out.println("Exit From C");
    }
}

public class Threads_1{
    public static void main(String[] args) {

        //If run() is called directly then a single stack memory is allocated for the whole program to run.
        //So the output will be sequential.

        new D().run();
        new E().run();
        new F().run();
    }
}
