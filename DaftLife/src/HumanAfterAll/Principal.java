package HumanAfterAll;

public class Principal {
    public static void main(String[] args) {

        //Instanciamos un objeto de la clase persona
        Personas obj1 = new Personas();

        System.out.println("El nombre que contiene objeto 1 es :"+ obj1.nombre+ "La edad es :"+obj1.edad+
                "El color de ojos es:"+obj1.colorOjos+"Tiene :"+obj1.numPiernas+"Piernas"+"Tiene :"+
                obj1.numBrazos+"Brazossss");

        Personas obj2 = new Personas("Guy-Manuel de Homem-Christo",(byte) 56,(byte)2,(byte)2,"Azul");
        System.out.println("El nombre que tiene objeto 2 es:" + obj2.nombre+ "La edad es :"+obj2.edad+
                "El color de ojos es:"+obj2.colorOjos+"Tiene :"+obj2.numPiernas+"Piernas"+"Tiene :"+
                obj2.numBrazos+"Brazossss");
        System.out.println("El saludo de los Dafts es"+obj1.Saludar());
        System.out.println("El saludo de los dafts 2 es"+obj2.Saludar());
        obj2.CambiarNombre("Jhon Estebia Rmz");
        System.out.println("El saludo del obj 2, despues de cambiar nombre es: "+obj2.Saludar());
    }
}
