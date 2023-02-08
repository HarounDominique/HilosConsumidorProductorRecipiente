public class Consumidor extends Thread {
    private Recipiente r;
    private int numero;
    //constructor
    public Consumidor(Recipiente recipi, int nume) {
        r=recipi;
        numero=nume;
    }
    public void run() {
        int valor=0;
        for (int i=1; i<=5; i++) {
            valor = r.vaciar();
            System.out.println("Consumidor "+numero+" toma el valor "+i);
//espera un tiempo antes de volver a consumir
            try {
                sleep((int) (Math.random()*100));
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo...");
            }
        }
    }
}
