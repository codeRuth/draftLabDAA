package com.coderuth.draftlab.three.threads;

class Square implements Runnable {
    public int x;

    public Square(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Square Thread : " + x * x);
    }
}