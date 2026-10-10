import java.util.Scanner;
/**
* Programa para Terapiar a una persona
* Objetivo Es el poder familiarizarse con la creación y uso de objetos de la clase String
  utilizando algunos métodos de dicha clase en la elaboración de un programa
  para simular una sesión con un psicólogo.
* @author Santiago López Paulino
* @version Primera versión
*/
public class Psicólogo {

/**
     * Método principal que ejecuta la simulación de la sesión psicológica es "public static void (String [] args)".
     * Este recaba el nombre y los problema del paciente para poder interactuar en la consola.
     */

    public static void main (String [] args) {
        Scanner chocolate = new Scanner(System.in);

        System.out.println("Holaaa Bienvenido! ¿Cuál es tu nombre?");
        String nombre = chocolate.nextLine();

        System.out.println("Que onda " + nombre + ".");
        System.out.println("Cuenteme, ¿Cuál es su problema en la vida?");
        String problema = chocolate.nextLine();

        System.out.println("MMM... Ya veo " + nombre + ".");
        System.out.println("Y dígame...");
        System.out.println("¿Por qué dice que " + problema + " ? ");
        String resolución = chocolate.nextLine();

        System.out.println("Muy interesante! hablaremos de ello con más detalle en la siguiente sesión");


    }


}
