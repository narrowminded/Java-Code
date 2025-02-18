package com.company;

class AA extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("\t From Thread A : i = "+i);
        }
        System.out.println("Exit from AA");
    }
}
class BB extends Thread{
    public void run(){
        for(int j = 1; j <= 5; j++){
            System.out.println("\t From Thread B : j = "+j);
        }
        System.out.println("Exit From BB");
    }
}
class CC extends Thread{
    public void run(){
        for(int k = 1; k <= 5; k++){
            System.out.println("\t From Thread C : k = "+k);
        }
        System.out.println("Exit From CC");
    }
}

public class Threads_4{
    public static void main(String[] args) {
        AA ThreadAA = new AA();
        BB ThreadBB = new BB();
        CC ThreadCC = new CC();

        ThreadCC.setPriority(Thread.MAX_PRIORITY);
        ThreadBB.setPriority(ThreadAA.getPriority()+1);
        ThreadAA.setPriority(Thread.MIN_PRIORITY);

        //Program will run in a random order but the priority is set.
        //The first Line will always be of CC.
        //CC will always complete first due to its high Priority.
        //BB will always complete second due to its mid Priority.
        //AA will always complete last due to its low Priority.

        System.out.println("Start Thread AA");
        ThreadAA.start();

        System.out.println("Start Thread BB");
        ThreadBB.start();

        System.out.println("Start Thread CC");
        ThreadCC.start();

        System.out.println("End of Main Thread");
    }
}

