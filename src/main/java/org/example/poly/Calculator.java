package org.example.poly;

import java.sql.SQLOutput;

public class Calculator {


    public int add(int a, int b){
        System.out.println("I am 1st method");
        return a+b;
    }

    public double add(double a, double b){
        System.out.println("I am 2nd method");
        return a+b;
    }

    public double add(double a, double b,double c){
        System.out.println("I am 3rd method");
        return a+b;
    }

    /*
    Compilation error here, as it is not overloading.
        public String add(double b, double a){

        return null;
    }
    */
    public int add(int a, double b){
        return a+(int)b;
    }


      public String add(double b, int a){
            return null;
      }



}
