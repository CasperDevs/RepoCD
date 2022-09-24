package HumanAfterAll;

public class Personas {
    String nombre;
    byte edad;
    byte numPiernas;
    byte numBrazos;
    String colorOjos;

    //Constructor
    //inicializar la variable

    public Personas(){
        this.nombre = "Thomas Bangalter";
        this.numBrazos = 2;
        this.numPiernas = 2;
        this.colorOjos = "Verde";

    }
    public Personas(String nombre,byte edad,byte numPiernas,byte numBrazos,String colorOjos){
        this.nombre = nombre;
        this.numBrazos = numBrazos;
        this.numPiernas = numPiernas;
        this.colorOjos = colorOjos;
    }

    public String Saludar(){
        return "Hello my name is Daft"+this.nombre;
    }

    public void CambiarNombre(String nombre){
        this.nombre = nombre;
    }

}
