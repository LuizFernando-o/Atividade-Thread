package br.unicap.thread;

import java.util.Random;

public class Temperature implements Runnable {

    @Override
    public void run() {
        try {
            Random random = new Random();
            int value;
            for (int i = 0; i < 20; i++) {
                value = random.nextInt((37 - 36) + 1) + 36;
                System.out.println("\u001B[33mTEMP: "+ value +" C");
                Thread.sleep(400);
            }
            System.out.println("\u001B[33m!!! CICLO DE VIDA DA THREAD 3 ACABOU !!!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
