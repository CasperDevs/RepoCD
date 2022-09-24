package Hilos;

public class Principal {
    public static void main(String[] args) {
       //Crear

        Proceso1 hilo1 = new Proceso1();

        Proceso1 hilo3 = new Proceso1();

        //Traer hilo con Runneable
        Thread hilo2 = new Thread(new Proceso2());

        //Metodo para Arrancar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
