package com.ExceptionHandling;

import java.lang.*;
public class ExceptionExample {

    public static void main(String[] args) {
       int n;
        try {
             n = 0/2;
        }
//        System.out.println("Middel one");
        catch (Exception e){
            System.out.println("Exception"+ e);
        }
        finally {
            System.out.println("Last one"  );
        }

    }
}
