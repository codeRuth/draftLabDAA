package com.coderuth.draftlab.two;

class Technical extends Staff {
    private String skills;

    public Technical(int id, int no, int sal, String na, String sk) {
        super(id, no, sal, na);
        skills = sk;
    }

    void display() {
        System.out.print("\nTechnical Staff Details : \n");
        super.display();
        System.out.println("Skills :" + " " + skills);
    }
}