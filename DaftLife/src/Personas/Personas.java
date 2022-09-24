package Personas;

public class Personas {
    String nombre;
    byte edad;
    byte NumeroPiernas;
    byte NumeroBrazos;
    String ColorOjos;

    //Constructor
    public Personas(){
        this.nombre = "Oktron";
        this.edad = 24;
        this.NumeroPiernas = 2;
        this.NumeroBrazos = 2;
        this.ColorOjos = "Bleizer";

    }

    public  Personas(String nombre ,byte edad, byte NumeroPiernas, byte NumeroBrazos ,String ColorOjos){
        this.nombre = nombre;
        this.edad = edad;
        this.NumeroPiernas = NumeroPiernas;
        this.NumeroBrazos = NumeroBrazos;
        this.ColorOjos = ColorOjos;
    }


}
