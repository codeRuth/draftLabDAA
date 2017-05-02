package com.coderuth.draftlab.one;

import java.util.Scanner;

public class Student {
    private String USN;
    private String studentName;
    private String sBranch;
    private long phoneNumber;

    public Student(String USN, String studentName, String sBranch, long phoneNumber) {
        this.USN = USN;
        this.studentName = studentName;
        this.sBranch = sBranch;
        this.phoneNumber = phoneNumber;
    }

    private void displayRecord() {
        System.out.println(USN + "\t" + studentName + "\t" + sBranch + "\t" + phoneNumber);
    }

    public static void main(String args[]) {
        Student student[] = new Student[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students : ");
        int n = sc.nextInt();
        System.out.println("Enter Student Details :");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " :");
            System.out.print("Enter Student USN : ");
            String USN = sc.next();
            System.out.print("Enter Student Name : ");
            String sName = sc.next();
            System.out.print("Enter Branch : ");
            String sBranch = sc.next();
            System.out.print("Enter Phone Number : ");
            long phoneNumber = sc.nextLong();
            student[i] = new Student(USN, sName, sBranch, phoneNumber);
            System.out.println();
        }
        System.out.println("USN\t\tName\tBranch\tPhone No.");
        for (int j = 0; j < n; j++) {
            student[j].displayRecord();
        }
    }
}