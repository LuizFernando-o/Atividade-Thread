package br.unicap.thread;

import java.util.Random;

public class Heart implements Runnable  {

    @Override
    public void run() {
        try {
            Random random = new Random();
            int value;
            for (int i = 0; i < 20; i++) {
                value = random.nextInt((80 - 60) + 1) + 50;
                System.out.println("\u001B[32mECG: "+ value +" BPM");
                Thread.sleep(400);
            }
            System.out.println("\u001B[32m!!! CICLO DE VIDA DA THREAD 1 ACABOU !!!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
