package HilosConParametros;

public class Principal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso();
        Proceso hilo2 = new Proceso();

        hilo1.start();
        hilo2.start();
    }
}
