package u3.tareas;

import java.util.Scanner;

public class Tarea3 {
	/**
	 * Solicitar un número entero por teclado e indicar si es par o impar
	 * (reutilizar el código de la tarea 1) Tu aplicación debe permitir seguir
	 * solicitando números y diciendo si son par o impar hasta que el usuario
	 * introduzca el valor -1, en ese caso mostraremos un mensaje indicando que
	 * termina la ejecución y finalizaremos el programa.
	 *
	 * RECUERDA: Puedes usar para el control de errores hasNextInt() para comprobar
	 * que lo que recoges por teclado es un número y si no mostrar un mensaje al
	 * usuario indicando que debe introducir sólo valores numéricos. En caso de no
	 * ser un número el valor introducido recuerda que tienes que limpiar el buffer
	 * de lectura utilizando el método next() para que te deje continuar insertando
	 * nuevos valores.
	 * 
	
	 *
	 */
	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			int numero=0; //declaro la variable fuera del while para poder utilizarla fuera del if
			
			do {
				System.out.println("Introduzca un número entero:");
				if(sc. hasNextInt()) {  //si ha comentado un numero ejecuta lo que hay en el if 
				numero= sc.nextInt();
					if (numero%2==0) {
					System.out.println(numero+ " es un número par");
					}
					else if(numero ==-1) {
						System.out.println("Salimos del bucle");
					}
					
					else {
					System.out.println(numero+ " es un número impar");
					}
				}else {
					System.out.println("El valor introducido es incorrecto. Introduzca valores numéricos.");
					sc.next(); //limpiar lo que ha leido de teclado para poder volver a escribir
				}	
			}while (numero !=-1);
			
		}

	}


