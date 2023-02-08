
public class Main {

    public static void main(String args[]) {
        Recipiente r = new Recipiente();
        Productor p = new Productor(r, 1);
        Consumidor c = new Consumidor(r, 1);
        //Consumidor c2 = new Consumidor(r, 2);
        p.start();
        c.start();
        //c2.start();
    }
}