public class Recipiente{

    //Campos
    private int contenido;
    private boolean lleno = false;

    //Métodos

    public synchronized int vaciar(){
        while(lleno == false){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        lleno = false;
        notifyAll();
        return contenido;
    }

    public synchronized void llenar(int valor){
        while(lleno == true){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        contenido = valor;
        lleno = true;
        notifyAll();
    }

    public int getContenido() {
        return contenido;
    }

}