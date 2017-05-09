package com.coderuth.draftlab.two;

class Teaching extends Staff {
    private String domain;
    private int noOfPublications;

    public Teaching(int id, int no, int sal, String na, String  d, int nop) {
        super(id, no, sal, na);
        domain = d;
        noOfPublications = nop;
    }

    void display() {
        System.out.println("\nTeaching Staff Details : \n");
        super.display();
        System.out.println("Domain :" + " " + domain);
        System.out.println("Number Of Publictions : " + " " + noOfPublications);
    }
}