package u4.tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class insertanombrearray {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>(); // Declara el arraylist de nombres para no tener que reservar memoria y poder añadir mas nombres sin límite
	     Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer los nombres
	     String nombre="";
	     
	        // Solicita los nombres
	        for (int i = 0; i < 5; i++) {
	         
	        	System.out.print("Ingresa el nombre " + (i + 1) + ": ");
	            nombre = sc.nextLine();
	            if(nombre.matches("[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+")){  // creo una expresión regular para hacer un control de errores recogiendo el string
	            	nombres.add(nombre);
	            	
	            }else {
	            	System.err.println("Error el nombre introducido no es válido:");
	            	i--;
	            	
	            }
	          
	        }
	        
	        
			/*
			 * for(int i=0;i<nombres.size();i++) { System.out.println(nombres.get(i)); }
			 */
	        //Insertar otro nombre al array
	        
	        

	}

}
