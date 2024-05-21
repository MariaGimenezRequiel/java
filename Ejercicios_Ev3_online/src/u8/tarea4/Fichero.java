package u8.tarea4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichero {

public static void escribir (String nombreFichero, String productos) {
		
	
	try {
		
		PrintWriter fichero= new PrintWriter(nombreFichero); //calse PrintWriter para escribir un ficehro de texto
		
		fichero.println(productos);
		
		fichero.close();
		
	}catch(FileNotFoundException e) {
		
		e.printStackTrace();
	}

}

public static String leer(String nombreFichero) {
	String txt="";
	File fichero = new File(nombreFichero);
	
	if (fichero.exists()) {
		try {
			Scanner scFichero = new Scanner(fichero);
			
			while (scFichero.hasNext()) {
				String linea=scFichero.nextLine();
				txt= txt+linea+"\n";
			}
			
			scFichero.close();
			
		} catch (FileNotFoundException e) {
			txt= "Error: No existe el fichero!!";
			e.printStackTrace();
		} 
	} else {
		txt="No existe el fichero!!";
	}
	return txt;
	
	
}



	
}
