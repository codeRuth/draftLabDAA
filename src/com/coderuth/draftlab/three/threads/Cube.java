package com.coderuth.draftlab.three.threads;

class Cube implements Runnable {
    public int x;

    public Cube(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Cube Thread : " + x * x * x);
    }
}