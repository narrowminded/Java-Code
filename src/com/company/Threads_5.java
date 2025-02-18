package com.company;

class AAA extends Thread{
    public void run(){
        System.out.println("This is Thread AAA\tThread ID: "+Thread.currentThread().threadId()+"\tThread Priority: "+Thread.currentThread().getPriority());
    }
}
class BBB extends Thread{
    public void run(){
        System.out.println("This is Thread BBB\tThread ID: "+Thread.currentThread().threadId()+"\tThread Priority: "+Thread.currentThread().getPriority());

    }
}
class CCC extends Thread{
    public void run(){
        System.out.println("This is Thread CCC\tThread ID: "+Thread.currentThread().threadId()+"\tThread Priority: "+Thread.currentThread().getPriority());

    }
}

public class Threads_5{
    public static void main(String[] args) {
        AAA ThreadAAA = new AAA();
        BBB ThreadBBB = new BBB();
        CCC ThreadCCC = new CCC();

        ThreadAAA.setPriority(Thread.MIN_PRIORITY);
        ThreadBBB.setPriority(Thread.NORM_PRIORITY);
        ThreadCCC.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nThis is the main Thread\t Thread ID: "+Thread.currentThread().threadId()+"\tThread Priority: "+Thread.currentThread().getPriority()+"\n");
        System.out.println("Let's call the other Threads in the sequence AAA->BBB->CCC\n");
        ThreadAAA.start();
        ThreadBBB.start();
        ThreadCCC.start();
    }
}
