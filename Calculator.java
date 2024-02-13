package learning;

import java.util.ArrayList;

public class Calculator {
    public static void add(double a,double b){
        System.out.println("Addition:"+(a+b));
    }
    public static void subtract(double a,double b){
        System.out.println("Subtraction: "+(a-b));
    }
    public static void multiply(double a,double b){
        System.out.println("Multiplication:"+(a*b));
    }
    public static void divide(double a,double b){
        if(b==0){
            System.out.println("error");
        }else {
            System.out.println("Division:"+(a/b));
        }
    }

}
