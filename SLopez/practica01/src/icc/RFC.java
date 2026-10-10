import java.util.Scanner;
/**
* Clase con RFC
* Objetivo:Este programa generará una versión simplificada del RFC de una persona a partir de su nombre completo y fecha de nacimiento
* @author Santiago López Paulino
* @version Primera versión
*/

public class RFC {

    public static void main(String [] args ){

    /**
     * Método principal que solicita al usuario su nombre completo y fecha de nacimiento
     * para posteriormente extraer iniciales y números al final para de esta forma formatear la salida final del RFC a como lo pide el programa
     */

        Scanner inicio = new Scanner(System.in);
        System.out.println("Holaaa bienvenido al sistema de generación de RFC!");
        System.out.println("Ingrese su nombre completo");

        String NombreCompleto = inicio.nextLine().trim();

        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aa");
        String fecha = inicio.nextLine().trim();

        int primerdato = NombreCompleto.indexOf(" ");
        int segundodato = NombreCompleto.indexOf(" ", primerdato +1);


        String nombre = NombreCompleto.substring(0, primerdato);
        String Apellidopaterno = NombreCompleto.substring(primerdato + 1, segundodato);
        String Apellidomaterno = NombreCompleto.substring(segundodato + 1);

        //Defines que valores quieres que adapte y la posicion que le adaptaremos al final

        String inicialNombre = nombre.substring(0, 1); //aqui irian los valores de la posicion que queremos que adpte
        String inicialPaterno = Apellidopaterno.substring(0, 2);
        String inicialMaterno = Apellidomaterno.substring(0, 1);

        String rfcOrden = inicialPaterno + inicialMaterno + inicialNombre;


        //Definimos lo mismo pero ahora para que definamos un  orden pero para el cumpleaños

        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String anio = fecha.substring(6,10);

        String rfcFinal = rfcOrden.toUpperCase () + anio + mes + dia;

        System.out.println("El RFC de " + NombreCompleto + " es: " + rfcFinal );


    }





}
