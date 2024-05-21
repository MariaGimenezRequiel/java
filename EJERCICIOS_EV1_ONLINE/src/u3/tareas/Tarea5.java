package u3.tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea5 {
	/*
	 * Solicitar por teclado un número y mostrar los números impares que hay desde 0
	 * hasta el número indicado.
	 ** 
	 * Utilizar el bucle for para mostrar todos los números pares Utiliza el control
	 * de excepciones con try..catch
	 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean correcto=false;//es necesario para que se ejecute el bucle

		do {
					try {
								System.out.println("Escriba un número entero: ");
								int numero=sc.nextInt();
								
								correcto=true;	//es necesario para que se ejecute el bucle
								System.out.println("Números impares del 0 al " +numero);
								for(int i=0;i<numero;i++ ) {
									if(i%2!=0) {
										System.out.println(i);
									}
									
								}
						
					}catch(InputMismatchException e) {
							System.out.println("Error:introduzca un valor numérico.");
							sc.next();
					}catch(Exception e) {
						System.out.println("Se ha producido un error inesperado. Por favor, vuelva a intentarlo.");
						sc.next();
						}
					
		}while(!correcto);
		
		System.out.println("FIN");
	}

}
