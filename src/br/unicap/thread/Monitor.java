package br.unicap.thread;

public class Monitor {

    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        RespiratorySystem r1 = new RespiratorySystem();
        Heart h1 = new Heart();

        new Thread(t1).start();
        new Thread(h1).start();
        new Thread(r1).start();
    }
}
