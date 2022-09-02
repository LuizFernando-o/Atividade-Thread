package br.unicap.thread;

public class Monitor {

    public static void main(String[] args) {
   
        //criar monitoramentos
        Heart h1 = new Heart();
        Pressure p1 = new Pressure();
        RespiratorySystem r1 = new RespiratorySystem();

        //inicializando as Threads (método run)
        new Thread(h1).start();
        new Thread(p1).start();
        new Thread(r1).start();
                
        
    }
}
