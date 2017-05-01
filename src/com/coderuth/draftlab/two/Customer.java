package com.coderuth.draftlab.two;

import java.util.Scanner;
import java.util.StringTokenizer;

class Customer {
    private String customerName;
    private String dateOfBirth;

    public Customer(String customerName, String dateOfBirth) {
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayDetails() {
        System.out.print(customerName);
        String delims = "/";
        StringTokenizer st = new StringTokenizer(dateOfBirth, delims);
        while (st.hasMoreElements()) {
            System.out.print(", " + st.nextElement());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customers = new Customer[30];
        System.out.println("Enter the Number of Customers :");
        int n = sc.nextInt();
        System.out.println("Enter the Customer Details : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Customer Name & Date Of Birth : ");
            customers[i] = new Customer(sc.next(), sc.next());
        }
        for (int i = 0; i < n; i++)
            customers[i].displayDetails();
    }
}
