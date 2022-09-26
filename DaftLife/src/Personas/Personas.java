package Personas;

public class Personas {
    String nombre;
    byte edad;
    byte NumeroPiernas;
    byte NumeroBrazos;
    String ColorOjos;
    byte vidaRestante;

    //Constructor
    public Personas(){
        this.nombre = "Oktron";
        this.edad = 24;
        this.NumeroPiernas = 2;
        this.NumeroBrazos = 2;
        this.ColorOjos = "Bleizer";
        this.vidaRestante = 100;
    }

    public  Personas(String nombre ,byte edad, byte NumeroPiernas, byte NumeroBrazos ,String ColorOjos){
        this.nombre = nombre;
        this.edad = edad;
        this.NumeroPiernas = NumeroPiernas;
        this.NumeroBrazos = NumeroBrazos;
        this.ColorOjos = ColorOjos;
        this.vidaRestante = 100;
    }

    public String Saludar(){
        return "Hola mi Nombre es "+this.nombre;
    }

    public void CambiarNombre(String nombre){
        this.nombre = nombre;
    }

     public void Enfermar(int PuntosVida){
        this.vidaRestante -= PuntosVida;
     }

     public void Comer(int Comida){
        this.vidaRestante += Comida;
     }


}
