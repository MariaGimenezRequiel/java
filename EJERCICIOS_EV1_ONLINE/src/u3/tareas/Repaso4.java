package u3.tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {
		/*
		 * 4) Lee un número por teclado y comprueba que este número es mayor o igual
		 * que cero, si no lo es lo volverá a pedir (do while), después muestra ese
		 * número por consola.
		 */
			Scanner num= new Scanner(System.in);
			boolean correcto=true;
			int numero=0;
			
		do {
					try {
							  System.out.println("Introduzca un número entero: ");
							  numero=num.nextInt(); 
							  correcto=true;
							  if(numero<0) {
									System.err.println("Valor incorrecto, debe introducir un número mayor o igual a 0");
									correcto=false;
								}
						
					}catch(InputMismatchException e) {
							  System.err.println("Error: no ha introducido un número entero.");
							  correcto=false;
							  num.next();
					}
		}while(!correcto); 
		
						
		System.out.println("NÚMERO ES IGUAL A= "+numero);
			
					
	}	

}
