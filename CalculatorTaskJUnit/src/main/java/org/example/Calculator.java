package org.example;

public class Calculator {
    public double add(double a, double b){
        return a+b;
    }

    public double add(String a, String b) {
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double mult(double a, double b){
        return a*b;
    }

    public double mult(String a, String b){
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA * numB;
    }

    public double div(double a, double b){
        return a/b;
    }

    public double div(String a, String b){
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA / numB;
    }

    public double exp(double a){
        return a*a;
    }

    public double exp(String a){
        double numA = Integer.parseInt(a);
        return numA*numA;
    }

}
