package com.university;

import java.util.Scanner;

import java.security.SecureRandom;

public class LinearEquation {
     private double a,b,c,d,e,f;

    LinearEquation(double a1,double b1,double c1,double d1, double e1, double f1){
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
        this.e = e1;
        this.f = f1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getX(){
        double numerator = e * d - b * f;
        double denominator = a * d - b * c;
        return numerator / denominator;
    }
    public double getY(){
        double numerator = a * f - e * c;
        double denominator = a * d - b * c;
        return numerator / denominator;
    }
    public boolean isSolvable(){
        double denominator = a * d - b * c;
        if(denominator != 0) {
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {
        double a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Enter the values of a, b, c, d, e, f: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        LinearEquation ln = new LinearEquation(a, b, c, d, e, f);
        if(ln.isSolvable() == true){

            int output = 1 + randomNumbers.nextInt(4);
            switch (output) {
                case 1 -> System.out.printf("1. x is %.1f and y is %.1f", ln.getX(), ln.getY());
                case 2 -> System.out.printf("2. (x,y) = (%.1f,%.1f)", ln.getX(), ln.getY());
                case 3 -> System.out.printf("3. x = %.1f, y = %.1f", ln.getX(), ln.getY());
                case 4 -> System.out.printf("4. The solution is (%.1f,%.1f)", ln.getX(), ln.getY());
            }
        }
        else {
            int output = 1 + randomNumbers.nextInt(4);
            switch (output) {
                case 1 -> System.out.println("1. The equation has no solution.");
                case 2 -> System.out.println("2. The equation can not be solved");
                case 3 -> System.out.println("3. Error: no solution exists for the equation");
                case 4 -> System.out.printf("4. The equation with following coefficients is unsolvable:\n a= %.1f, b = %.1f, c = %.1f, d = %.1f, e = %.1f, f = %.1f", ln.getA(), ln.getB(), ln.getC(), ln.getD(), ln.getE(), ln.getF());
            }
        }

    }
}

