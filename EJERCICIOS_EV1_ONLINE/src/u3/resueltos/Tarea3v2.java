package u3.resueltos;

import java.util.Scanner;

/**
 * Solicitar un número entero por teclado e indicar si es par o impar
 * (reutilizar el código de la tarea 1) Tu aplicación debe permitir seguir
 * solicitando números y diciendo si son par o impar hasta que el usuario
 * introduzca el valor -1, en ese caso mostraremos un mensaje indicando que
 * termina la ejecución y finalizaremos el programa.
 *
 * Usamos try..catch para controlar los errores.
 * 
 * @author MAngeles
 *
 */
public class Tarea3v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;

		do {

			System.out.println("Introduzca un número:");

			try {

				numero = sc.nextInt();

				if (numero % 2 == 0) {

					System.out.println("El número " + numero + " es par.");

				} else {
					System.out.println("El número " + numero + " es impar.");
				}

			} catch (Exception e) {
				System.err.println("Error, sólo se pueden introducir números enteros.");
				sc.next();
			}

		} while (numero != -1);

		System.out.println("FIN.");

	}

}

