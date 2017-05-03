package com.coderuth.draftlab.two;

public class MultiLevel {
    public static void main(String args[]) {
        Teaching t1 = new Teaching(11, 998765434, 31000, "Prof. Kakoli Bora", "ISE", 10);
        Teaching t2 = new Teaching(12, 996655546, 30000, "Prof. Animesh Giri", "ISE", 9);
        Teaching t3 = new Teaching(13, 999933442, 32000, "Prof. Pragya", "ISE", 8);
        t1.display();
        t2.display();
        t3.display();

        Technical te1 = new Technical(21, 994433221, 22000, "Prof. Kakoli Bora", "C");
        Technical te2 = new Technical(22, 998877665, 28000, "Prof. Pragya", "Java");
        Technical te3 = new Technical(23, 991654321, 33000, "Prof. Ruthvik V", "Java");
        te1.display();
        te2.display();
        te3.display();

        Contract ct1 = new Contract(31, 998765434, 35000, "Prof. Girish", 3);
        Contract ct2 = new Contract(32, 912345678, 39000, "Prof. James Alex", 1);
        Contract ct3 = new Contract(33, 992233445, 30000, "Prof. Kiran Rao", 4);
        ct1.display();
        ct2.display();
        ct3.display();
    }
}