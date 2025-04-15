package com.company;
import java.lang.Exception;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

public class throws_ {
    public static int sum(int x,int y) throws
            NegativeNumberException{
        if(x<0 || y<0){
            throw new NegativeNumberException("Negative Numbers are not allowed");
        }
        return x+y;
    }

    public static void main(String[] args) {
        try{
            int z = sum(5,-4);
            System.out.println("Result = "+z);
        }
        catch (NegativeNumberException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
