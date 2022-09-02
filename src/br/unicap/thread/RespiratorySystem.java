package br.unicap.thread;

import static br.unicap.thread.Actions.check;

public class RespiratorySystem implements Runnable {

    @Override
    public void run() {
        //verifica com média frequência o sistema respiratório
        try {
            for (int i = 0; i < 20; i++) {
                check("\u001B[31m", "Respiratory System");
                Thread.sleep(1000);
            }
            System.out.println("CICLO DE VIDA DA THREAD 2 ACABOU!");
        } catch (InterruptedException e) {
        }

    }

}
