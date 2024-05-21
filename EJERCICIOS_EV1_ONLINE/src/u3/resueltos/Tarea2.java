package u3.resueltos;

import java.util.Scanner;

/**
 * Crear un programa que solicite por teclado la estación del año favorita del
 * usuario y le muestre según la opción seleccionada un mensaje u otro. Utilizar
 * la estructura "switch" para realizar esta tarea.
 *
 * @author MAngeles
 *
 */
public class Tarea2resuelta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaración de constantes
		final String PRIMAVERA = "primavera";
		final String OTONYO = "otoño";
		final String INVIERNO = "invierno";
		final String VERANO = "verano";
		
		
		System.out.println("Introduzca su estación del año favorita:");

		String estacion = sc.nextLine().trim();

		switch (estacion.toLowerCase()) {
		case PRIMAVERA:
			System.out.println("La primavera comienza el 20 de Marzo y acaba el 21 de junio.");
			break;

		case VERANO:
			System.out.println("El verano comienza el 21 de junio y acaba el 23 de septiembre.");
			break;

		case OTONYO:
			System.out.println("El otoño comienza el 23 de septiembre y acaba el 21 de diciembre.");
			break;

		case INVIERNO:
			System.out.println("El invierno comienza el 21 de diciembre y acaba el 20 de marzo.");
			break;
			
		default:
			System.err.println("La estación introducida NO existe");
			break;
		}


	}

}
