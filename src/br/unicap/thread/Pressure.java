package br.unicap.thread;

import static br.unicap.thread.Actions.check;

public class Pressure implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                check("\u001B[34m", "Pressure");
                Thread.sleep(2000);
            }
            System.out.println("CICLO DE VIDA DA THREAD 3 ACABOU!");
        } catch (InterruptedException e) {
        }
    }
}
