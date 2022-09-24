package Hilos;

public class Proceso1 extends Thread{

    @Override
    public void run(){
        for(int i=0; 1<=5; i++){

            System.out.println("Clase en Proceso 1");
        }
    }
}
