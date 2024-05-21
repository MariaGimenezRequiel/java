package u3.resueltos;

import java.util.Scanner;

/** 
 * Solicitar un número entero por teclado e indicar si es par o impar. 
 * Utiliza la operación "%" para quedarte con el resto de la división. 
 * Recuerda que si el resto de un número dividido entre 2 es 0 el número es par y si es 1
 * impar.
 */
public class Tarea1resuelta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Introduzca un número:");
		
		if (sc.hasNextInt()) {
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es PAR");
			} else {
				System.out.println("El número " + numero + " es IMPAR");
			}
		}else {
			System.out.println("Error: Sólo se pueden introducir números.");
			sc.next();
		}
		
		System.out.println("FIN");
		

	}

}


