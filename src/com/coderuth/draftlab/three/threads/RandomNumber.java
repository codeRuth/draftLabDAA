package com.coderuth.draftlab.three.threads;

import java.util.Random;


class RandomNumber extends Thread {
    public void run () {
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                int num = r.nextInt(100);
                System.out.println("RandomNumber Thread : " + num);
                Thread squareThread = new Thread(new Square(num));
                squareThread.start();
                Thread cubeThread = new Thread(new Cube(num));
                cubeThread.start();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

