package com.company;

import java.util.*;

class G extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){

            //yield() method makes the selected iteration or operation yield/skip and lets the other operation to continue

            if(i == 1) {Thread.yield();}
            else {System.out.println("\t From Thread A : i = "+i);}
        }
        System.out.println("Exit from A");
    }
}
class H extends Thread{
    public void run(){
        for(int j = 1; j <= 5; j++){
            System.out.println("\t From Thread B : j = "+j);

            //stop() method makes the selected Thread iteration stop and restricts the Thread from moving further

            if(j == 3) stop();
        }
        System.out.println("Exit From B");
    }
}
class I extends Thread{
    public void run(){
        for(int k = 1; k <= 5; k++){
            System.out.println("\t From Thread C : k = "+k);
            if(k == 1) {
                try {

                    //sleep(milliSecond) method makes the operation/iteration take a pause for the provided time limit;

                    sleep(5000);
                }
                catch(Exception e){}
            }
        }
        System.out.println("Exit From C");
    }
}

public class Threads_3{
    public static void main(String[] args) {
        G ThreadG = new G();
        H ThreadH = new H();
        I ThreadI = new I();
        System.out.println("Start Thread G");
        ThreadG.start();
        System.out.println("Start Thread H");
        ThreadH.start();
        System.out.println("Start Thread I");
        ThreadI.start();
    }
}

