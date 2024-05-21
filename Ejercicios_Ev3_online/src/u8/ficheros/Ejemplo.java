package u8.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/* este código intenta escribir tres
 *  nombres en un archivo de texto especificado
 *   por nombreFichero utilizando la clase PrintWriter. Si el archivo no puede ser encontrado o creado, se captura la excepción y
 *    se muestra la traza de la misma.*/
public class Ejemplo {
	/*
	 * * El método "escribir" recibe como parámetro el nombre de un archivo
	 * (nombreFichero) en el que se desea escribir.
	 */
	public static void escribir (String nombreFichero) {
		
		/**
		 * Se coloca el código dentro de un bloque try-catch. Esto se debe a que se está
		 * utilizando la clase PrintWriter, que puede generar una excepción del tipo
		 * FileNotFoundException si el archivo no puede ser encontrado o creado.
		 */
	try {
		/**
		 * Dentro del bloque try, se crea una instancia de PrintWriter llamada "fichero"
		 * pasando el nombre del archivo como argumento. PrintWriter es una clase en
		 * Java que se utiliza para escribir en archivos de texto.
		 */
		PrintWriter fichero= new PrintWriter(nombreFichero); //calse PrintWriter para escribir un ficehro de texto
		
		/**
		 * * A continuación, se utiliza el objeto "fichero" para escribir tres líneas de
		 * texto en el archivo. En este caso, se está escribiendo los nombres "Juan",
		 * "Maria" y "Jesús", cada uno en una línea separada.
		 */
		fichero.println("Juan");
		fichero.println("Maria");
		fichero.println("Jesús");
		/**
		 * Después de escribir en el archivo, se cierra el objeto "fichero" utilizando
		 * el método close(). Esto es importante para asegurar que los recursos
		 * asociados al archivo se liberen correctamente.
		 */
		fichero.close();
		
	}catch(FileNotFoundException e) {
		/**
		 * Si se produce una excepción del tipo FileNotFoundException, se captura en el
		 * bloque catch correspondiente. Dentro de este bloque, se imprime la traza de
		 * la excepción utilizando el método printStackTrace(). Esto ayudará a
		 * identificar la causa del error en caso de que ocurra.
		 */
		e.printStackTrace();
	}

}
	
	public static void leer(String nombre) {
		File fichero= new File(nombre);
		if(fichero.exists()) {
			try {
			Scanner datosFichero= new Scanner(fichero); //creamos el scanner para leer el fichero
		
		while(datosFichero.hasNext()) // con hasNext entrara al bucle hasta que no llegue al final del fichero
			System.out.println(datosFichero.nextLine());
		
		datosFichero.close();
			}catch(FileNotFoundException e) {
				System.err.println("Error: No existe el fichero!!");
				e.printStackTrace();
			}
		}else {
			System.err.println("El fichero no existe !!!");
		}
		
		
	}
	
	
	
	}
