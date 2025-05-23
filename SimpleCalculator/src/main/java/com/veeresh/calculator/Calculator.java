package com.veeresh.calculator;

public class Calculator {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java Calculator <number1> <number2>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}
