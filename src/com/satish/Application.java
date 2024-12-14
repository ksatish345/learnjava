package com.satish;

public class Application {

    public static void main(String[] args) {
        Calculator calculate=new Calculator();
        int a=12;
        int b=3;
        calculate.addition(a,b);
        calculate.subtract(a,b);
        calculate.multiply(a,b);
        calculate.devide(a,b);
        calculate.remainder(a,b);
        calculate.power(a,b);
    }
}

class Calculator{

    public void addition(int a,int b){
        System.out.println("sum is : "+(a+b));
    }

    public void subtract(int a,int b){
        System.out.println("subtract is : "+(a-b));
    }

    public void multiply(int a,int b){
        System.out.println("multiply is : "+(a*b));
    }

    public void devide(int a,int b){
        System.out.println("devide is : "+(a/b));
    }

    public void remainder(int a,int b){
        System.out.println("remainder is : "+(a%b));
    }

    public void power(int a,int b){
        System.out.println("power is : "+Math.pow(a,b));
    }
}