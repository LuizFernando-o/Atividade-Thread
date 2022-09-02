package br.unicap.thread;

import static br.unicap.thread.Actions.check;

public class Heart implements Runnable  {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                //Math.random(95-115)
                //check("\u001B[32m", "Heart beats: " +varBPM+"BPM"); (simular com Math.random os batimentos 110BPM..90BPM..)
                check("\u001B[32m", "Heart beats");
                Thread.sleep(200);
            }
            System.out.println("CICLO DE VIDA DA THREAD 1 ACABOU!");
        } catch (InterruptedException e) {
        }
    }
}
