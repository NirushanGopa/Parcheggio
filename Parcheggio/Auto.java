package tpsit.parcheggiosemaphore;

import java.util.Random;


public class Auto extends Thread{

    public Auto(String name) {
        super(name);
    }

    @Override
    public void run() {
        
        try{
            
            System.out.println("Macchina " + getName() + " prova ad entrare (" + Parcheggio.numPosti +")");
            Parcheggio.semaforoIngresso.acquire();
            
            Parcheggio.numPosti--;
            System.out.println("Macchina " + getName() + " entrata nel parcheggio (" + Parcheggio.numPosti +")");
            Parcheggio.semaforoIngresso.release();
            
            //la macchina sosta per un tempo random
            this.sleep(new Random().nextInt(10));
            
            System.out.println("Macchina " + getName() + " prova ad uscire (" + Parcheggio.numPosti +")");
            Parcheggio.semaforoUscita.acquire();
            
            Parcheggio.numPosti++;
            Parcheggio.semaforoUscita.release();
            System.out.println("Macchina " + getName() + " esce dal parcheggio (" + Parcheggio.numPosti +")");
            
        }catch(InterruptedException e){}
        
    }
    
}
