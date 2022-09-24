package HilosConParametros;

public class Proceso extends Thread{

    int num_int;

    @Override
    public void run(){
        for(int i = 0; i<= num_int; i++){
            System.out.println(i);
        }
    }

    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;

    }

}
