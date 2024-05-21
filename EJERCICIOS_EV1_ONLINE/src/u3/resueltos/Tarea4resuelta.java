package u3.resueltos;

import java.util.Scanner;

/**
 * Solicita por teclado dos valores numéricos y una vez recogidos compararlos y mostrar un mensaje que indique si el primer valor recogido es mayor, menor o igual que el segundo valor recogido.
 * Recordad que para comparar valores numéricos utilizaremos los operadores (>, <, >=, ==, !=, ...)
 * Hacer el ejercicio con control de errores de tal forma que si no se introduce un valor numérico mostraremos un mensaje para indicar que el valor recogido no es correcto 
 * y con el uso de bucles volveremos a solicitar que introduzca otro valor. 
 * Así hasta que los dos valores solicitados sean correctos y se puedan comparar.
 *
 * @author MAngeles.
 *
 */
public class Tarea4resuelta {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		boolean correcto = false;
		
		do {
			try {
				System.out.println("Introduzca un número: ");
				n1 = sc.nextInt();
				correcto = true;
			} catch(Exception e) {
				System.err.println("Error: No se ha introducido un número.");
				sc.next();
				correcto = false; //Esta línea realmente no es necesaria porque ya es false cuando se inicializa.
			}
		} while(!correcto);
		
		do {
			try {
				System.out.println("Introduzca otro número: ");
				n2 = sc.nextInt();
				correcto = true;
			} catch(Exception e) {
				System.err.println("Error: No se ha introducido un número.");
				sc.next();
				correcto = false; //Aquí SI ES NECESARIO ya que del bucle anterior el valor de esta variable se había quedado como true.
			}
		} while(!correcto);
		
		
		if(n1 > n2) {
			System.out.println(n1+" es mayor que "+ n2);
		
		}else if(n1 < n2) {
			System.out.println(n1+" es menor que "+n2);
			
		}else {
			System.out.println(n1+" es igual que "+ n2);
		}
			
		
		System.out.println("FIN");
			
		

	}

}
