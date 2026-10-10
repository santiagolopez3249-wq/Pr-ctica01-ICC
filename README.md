pasos que seguí para cada programa hecho (describiré la serie de pasos, los programas limpios están contenidos en las filas ICC que es el último repositorio según lo solicitado);

1.Archivo: Psicologo.java

// En este programa muy por encima es que hacemos que la consola simule una plática pidiendo datos y respondiendo en base a ellos.
import java.util.Scanner; // Importamos la herramienta para poder leer lo que teclea el usuario

public class Psicologo {
    
    public static void main (String [] args) {
        
        // Creamos nuestro escáner (yo le puse de nombre 'chocolate' para identificarlo rápido)
        Scanner chocolate = new Scanner(System.in);
        
        // Empezamos a soltar las preguntas usando prints normales para que se vean en la terminal
        System.out.println("Holaaa Bienvenido! ¿Cuál es tu nombre?");
        
        // Atrapamos lo que el usuario escribe usando el método nextLine() y lo guardamos
        String nombre = chocolate.nextLine();
        
        // Para que parezca que el psicólogo te está hablando, vamos concatenando es decir 
        // pegando el texto fijo con las variables que guardamos, usando el signo +
        System.out.println("Que onda " + nombre + ".");
        System.out.println("Cuenteme, ¿Cuál es su problema en la vida?");
        String problema = chocolate.nextLine();
        
        // Aquí usamos el nombre como agregado en la terminal para darle más continuidad y para que la plática fluya natural
        System.out.println("MMM... Ya veo " + nombre + ".");
        System.out.println("Y digame...");
        
        // Juntamos la pregunta final directamente con el problema que nos dio el usuario y así obtener nuestra respuesta final
        System.out.println("¿Por qué dice que " + problema + " ? ");
        String resolución = chocolate.nextLine();
        
        System.out.println("Muy interesante! hablaremos de ello con más detalle en la siguiente sesión");
        
    }
}






2.Archivo: RFC.java

//En esta ocasión este programa va a crear un pequeño RFC a partir de 2 datos que le demos que en este caso es nuestro cumpleaños y nombre completo


import java.util.Scanner; // En este código de igual forma importamos esta herramienta para poder leer los datos desde la consola

public class RFC {
    
    public static void main(String[] args) {
        
        // Abrimos nuestro Scanner que llamé "inicio" para leer lo que escriba el usuario
        Scanner inicio = new Scanner(System.in);
        
        // Pedimos los datos y le agregamos un .trim() al final del nextLine(). 
        // Esto es por si al usuario se le escapa un espacio al principio o al final, el programa lo limpie.
        String NombreCompleto = inicio.nextLine().trim();
        String fecha = inicio.nextLine().trim();
        
        // Para no usar métodos raros, usamos indexOf para buscar en qué posición exacta 
        // cae el primer espacio en blanco. Así sabemos dónde termina el nombre.
        int primerdato = NombreCompleto.indexOf(" ");
        
        // Para el segundo apellido hacemos casi lo mismo, pero le pasamos (primerdato + 1) adentro. 
        // Básicamente le decimos a Java que empiece a buscar el espacio un pasito después del que ya encontró.
        int segundodato = NombreCompleto.indexOf(" ", primerdato + 1);
        
        // Teniendo ya bien ubicados los espacios, usamos substring(inicio, fin) para ir 
        // recortando los pedazos exactos. Por ejemplo, sacamos el apellido paterno.
        String Apellidopaterno = NombreCompleto.substring(primerdato + 1, segundodato);
        
        // Con las palabras separadas, volvemos a aplicar puros substrings chiquitos 
        // para volarnos solo las primeritas letras que nos pide la regla del RFC.
        String inicialNombre = nombre.substring(0, 1);
        String inicialPaterno = Apellidopaterno.substring(0, 2);
        
        // Para la fecha hacemos el mismo truco del substring para ir saltándonos 
        // las diagonales y atrapar solo los numeritos de día, mes y año.
        String anio = fecha.substring(6, 8);
        
        // Ya para rematar, juntamos las letras y le metemos un .toUpperCase() para forzar las mayúsculas.
        // Finalmente le pegamos las variables de los números de la fecha ¡Y listo, lo imprimimos!
        String rfcFinal = rfcOrden.toUpperCase() + anio + mes + dia;
        
    }
}
