package br.unicap.thread;

import java.util.Random;

public class RespiratorySystem implements Runnable {

    @Override
    public void run() {
        try {
            Random random = new Random();
            int value;
            for (int i = 0; i < 20; i++) {
                value = random.nextInt((99 - 95) + 1) + 95;
                System.out.println("\u001B[34mSpO2: " + value + " %");
                Thread.sleep(400);
            }
            System.out.println("\u001B[34m!!! CICLO DE VIDA DA THREAD 2 ACABOU !!!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
