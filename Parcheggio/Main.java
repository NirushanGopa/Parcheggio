package tpsit.parcheggiosemaphore;


public class Main {
    public static void main(String[] args) {
        
        Auto a1 = new Auto("Motoscafo");
        Auto a2 = new Auto("Quadrocicletta");
        Auto a3 = new Auto("Lambo");
        Auto a4 = new Auto("Buga");
        Auto a5 = new Auto("Ferrari");
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        
        try{
            a1.join();
            a2.join();
            a3.join();
            a4.join();
            a5.join();
        }catch(Exception e){}
        
        System.out.println("\nAuto rimanenti: " + Parcheggio.numPosti);
        
    }
}
