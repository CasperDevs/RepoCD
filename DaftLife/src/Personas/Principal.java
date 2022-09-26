package Personas;

public class Principal {
    public static void main(String[] args) {
        //Crear o instanciar objeto de la clase personas

        Personas objeto1 = new Personas();
        System.out.println("El nombre que contiene objeto1 es:" + "   " + objeto1.nombre + "   " + "La edad es: " + "  " + objeto1.edad + "Años"
                + "   " + "El color de ojos es: " + objeto1.ColorOjos + "   " + "Tiene :" +
                objeto1.NumeroBrazos + "   " +
                "Brazos" + "    " + "Y " + "     " + "Tiene : " + objeto1.NumeroPiernas + "Piernas");

        Personas objeto2 = new Personas("Chase Coleman", (byte) 26, (byte) 2, (byte) 2, "Concavo");
        System.out.println("El nombre que tiene objeto 2 es:" + "  " + objeto2 + " " + "El color de Ojos que tiene el objeto 2 es:"
                + "  " + objeto2.ColorOjos + " " + "Tiene :" + "  " + objeto2.NumeroBrazos + " " + "Brazos" + " " + " y" + " " + "Tiene : " + "  " + objeto2.NumeroPiernas + " "
                + "Piernas");

        System.out.println("El saludo de objeto 1 es:\n" + objeto1.Saludar());
        System.out.println("El saludo de objeto 1 es:\n" + objeto2.Saludar());

        objeto2.CambiarNombre("Ydelahina Moritz Crhue");
        System.out.println("El saludo de objeto 1 Despues de suistituir elemneto es:\n" + objeto2.Saludar());
        objeto2.CambiarNombre("Thurko Troitz Herrer");

        System.out.println("objecto 2 Says:Hi my name is:"+" "+objeto2.Saludar());

        System.out.println("La vida del objeto 2 antes de enfermar es: \n"+objeto2.vidaRestante);
        objeto2.Enfermar(20);
        System.out.println("La vida del objeto 2 despues de enfermar con 20puntos es:\n"+objeto2.vidaRestante);

        //obejto 2 come

        objeto2.Comer(40);
        System.out.println("Despues de comer 40 points su vida es de \n "+objeto2.vidaRestante);

        System.out.println("Sin embargo, la vida del objeto 1 es la misma, es decir, \n"+objeto1.vidaRestante);


    }


}
