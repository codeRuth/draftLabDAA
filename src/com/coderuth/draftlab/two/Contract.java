package com.coderuth.draftlab.two;

class Contract extends Staff {
    private int period;

    public Contract(int id, int no, int sal, String na, int pd) {
        super(id, no, sal, na);
        period = pd;
    }

    void display() {
        System.out.println("\nContract Staff Details : \n");
        super.display();
        System.out.println("Contract Period : " + period + " years.");
    }
}
