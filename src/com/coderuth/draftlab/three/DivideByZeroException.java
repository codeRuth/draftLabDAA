package com.coderuth.draftlab.three;

import java.util.Scanner;

public class DivideByZeroException {
    public static void main(String[] args) {
        int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Two Integers : ");
        a = input.nextInt();
        b = input.nextInt();
        try {
            result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println(e + ". You Cannot Divide by Zero.");
        }
    }
}