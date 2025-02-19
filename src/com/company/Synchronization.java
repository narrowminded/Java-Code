package com.company;

class Pyramid{

    //If we do not use synchronized keyword here then two Threads will work simultaneously to create the Pyramid one of '*' and the other of '#'
    //So, without synchronized the Output will be distorted making no sense
    //If synchronized is applied then two Threads will work in a synchronized manner and both the Threads will not work independently
    synchronized void draw_pyramid(char ch){
        for(int i = 0; i < 10; i+=2){
            for(int k = 10-i; k > 0; k-=2){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class Anything extends Thread{
    Pyramid p;
    Anything(Pyramid p){
        this.p = p;
    }
    public void run(){
        p.draw_pyramid('*');
    }
}

class Anything2 extends Thread{
    Pyramid p;
    Anything2(Pyramid p){
        this.p = p;
    }
    public void run(){
        p.draw_pyramid('#');
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Pyramid pobj = new Pyramid();
        Anything ThreadA = new Anything(pobj);
        Anything2 ThreadB = new Anything2(pobj);
        ThreadA.start();
        ThreadB.start();
    }
}
