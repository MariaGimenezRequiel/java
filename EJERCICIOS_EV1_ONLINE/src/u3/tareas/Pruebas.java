package u3.tareas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		
	String palabras;
	Scanner sc=new Scanner(System.in);
	System.out.println("Escriba un nombre: ");
	String nombre=sc.nextLine();
	
    
			do {                                                 // nombre= Maria de los Angeles
						int posicion= nombre.trim().indexOf(" ");//5
						nombre=nombre.trim().substring(posicion); //de los angeles
						//Para imprimir
						nombreimprimir=nombre.trim()
						System.out.println(palabras);
						
			}while(palabras.length()>-1);
			
									
	}

}
