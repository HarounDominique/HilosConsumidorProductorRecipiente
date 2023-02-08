public class Productor extends Thread {
    private Recipiente r;
    private int numero; //Si hay varios productores cada
    //cada uno llevará un numero
//Constructor
    public Productor(Recipiente recipi, int num) {
        r=recipi;
        numero=num;
    }
    public void run() {
        for (int i=1; i<=5; i++) {
            r.llenar(i);
            System.out.println("Productor "+numero+" pone el valor "+i);
//espera un tiempo antes de volver a llenar
            try {
                sleep((int) (Math.random()*100));
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo...");
            }
        }
    }
}
