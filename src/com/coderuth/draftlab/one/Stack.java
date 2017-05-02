package com.coderuth.draftlab.one;

import java.util.Scanner;

public class Stack {
    private final int maxVal = 100;
    private int stackArray[] = new int[maxVal];
    private int top = -1;

    void pushElement(int ele) {
        if (top >= maxVal - 1)
            System.out.println("Stack Overflow.");
        else
            stackArray[++top] = ele;
    }

    int popElement() {
        if (top == -1)
            System.out.println("Stack Underflow.");
        else
            return stackArray[top--];
        return -1;
    }

    void displayStack() {
        if (top == -1)
            System.out.println("Stack Empty.");
        else {
            for (int i = top; i > -1; i--)
                System.out.println(stackArray[i] + " ");
        }
    }

    public static void main(String args[]) {
        Stack stackObj = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            System.out.print("Enter your Choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the Element to be Pushed : ");
                    int ele = sc.nextInt();
                    stackObj.pushElement(ele);
                    break;
                case 2:
                    int pEle = stackObj.popElement();
                    System.out.print("The Popped Element is : ");
                    System.out.print(pEle + "\n");
                    break;
                case 3:
                    System.out.println("Elements in the Stack :");
                    stackObj.displayStack();
                    break;
                case 4:
                    return;
            }
            System.out.println();
        }
    }
}