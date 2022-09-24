package sep212022;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int Num1, Num2;


        try{
        System.out.println("Introduzca Numero 1:");
        Num1 = Leer.nextInt();
        System.out.println("Introduzca Numero 2:");
        Num2 = Leer.nextInt();


        System.out.printf("%d + %d\n", Num1, Num2, (Num1 + Num2));
        System.out.printf("%d + %d\n", Num1, Num2, (Num1 - Num2));
        System.out.printf("%d + %d\n", Num1, Num2, (Num1 * Num2));
        System.out.printf("%d + %d\n", Num1, Num2, (Num1 / Num2));


    }catch (InputMismatchException ex){

        System.out.println("Se deben introducir dos numeros");

    } catch(ArithmeticException ex){


        System.out.println("El numero 2 no pude ser 0");
    }catch (Exception ex ){
            System.out.println(ex.getMessage());
        }


     }
    public static int LeerEntero(Scanner inf){
        while (true){
            try{
                int valor = inf.nextInt();
                return valor;
            }catch (Exception ex){
                System.out.println("El valor que se intrdujo no es entero");
                inf.nextLine();
            }
        }
    }

     public static float LeerFlotante(Scanner inf) throws Exception{
        try{
            float valor = inf.nextFloat();
            return valor;
        }catch (Exception ex){
            throw new Exception("El valor que se introdujo no es valido");



          }


     }


}

