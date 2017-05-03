package com.coderuth.draftlab.three;

import java.util.Scanner;

class DivideByZeroException extends Exception {
    public String toString() {
        return "DivideByZeroException : Cannot Divide by Zero.";
    }
}

class Divide {
    private int a, b;

    public Divide(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public void divide() {
        try {
            if (this.b != 0) {
                System.out.println("Result a/b = " + (float) 1.0 * this.a / this.b);
            } else throw new DivideByZeroException();
        } catch (DivideByZeroException e) {
            System.out.println("Error! " + e);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a & b :");
        int a = in.nextInt();
        int b = in.nextInt();
        Divide compute = new Divide(a, b);
        compute.divide();
    }
}
