package com.coderuth.draftlab.two;

class Staff {
    private int staffID, phoneNumber, salary;
    private String staffName;

    public Staff(int staffID, int phoneNumber, int salary, String staffName) {
        this.staffID = staffID;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.staffName = staffName;
    }

    void display() {
        System.out.println("Staff ID:" + " " + staffID);
        System.out.println("Staff Phone Number:" + " " + phoneNumber);
        System.out.println("Staff Salary:" + " " + salary);
        System.out.println("Staff Name:" + " " + staffName);
    }
}
