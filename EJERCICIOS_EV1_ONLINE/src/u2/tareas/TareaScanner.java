package u2.tareas;

import java.util.Scanner;

public class TareaScanner {

	public static void main(String[] args) {
		// Creamos el lector para letras y otro para números
	Scanner sc= new Scanner(System.in);
	Scanner scnumero= new Scanner(System.in);
	
	
	// Leemos nombre
	System.out.println("Introduzca su nombre: ");
	String nombre= sc.nextLine(); //asignamos un valor string que recoge teclado
		
		//Leemos la edad
		System.out.println("Introduzca su edad: ");
		int edad= scnumero.nextInt(); // asignamos un valor int que recoge teclado
		
		
		//Leemos el deporte
		System.out.println("Introduzca el deporte que practica: " );
	    String deporte=sc.nextLine();// asignamos un valor string que recoge teclado
	   
	    //Compongo un mensaje con todos los datos recogidos
	    
	   String descripcion= nombre+" de "+ edad+ " años, me gusta practicar "+deporte ;
	   System.out.println(descripcion);
	    

	}

}
