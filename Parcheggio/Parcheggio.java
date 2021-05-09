package tpsit.parcheggiosemaphore;
import java.util.concurrent.Semaphore;


public class Parcheggio {
    
    protected static int numPosti = 10;
    
    protected static Semaphore semaforoIngresso = new Semaphore(1); //ingresso
    protected static Semaphore semaforoUscita = new Semaphore(1); //uscita
    
}
