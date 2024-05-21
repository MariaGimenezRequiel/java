package u3.tareas;

import java.util.Scanner;

public class Tarea4 {
	/*
	 * Solicita por teclado dos valores numéricos y una vez recogidos compararlos y
	 * mostrar un mensaje que indique si el primer valor recogido es mayor, menor o
	 * igual que el segundo valor recogido.
	 * 
	 * Recordad que para comparar valores numéricos utilizaremos los operadores (>,
	 * <, >=, ==, !=, ...)
	 * 
	 * Hacer el ejercicio con control de errores de tal forma que si no se introduce
	 * un valor numérico mostraremos un mensaje para indicar que el valor recogido
	 * no es correcto y con el uso de bucles volveremos a solicitar que introduzca
	 * otro valor. Así hasta que los dos valores solicitados sean correctos y se
	 * puedan comparar.
	 */
	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		boolean respuesta=true;
		boolean respuesta2=true;
		Scanner sc =new Scanner(System.in);
		
		do{
			System.out.println("Escriba un número: ");
			respuesta= sc. hasNextInt();
			if(respuesta=true) {
				numero1=sc.nextInt();
				do{ 
					System.out.println("Escriba un segundo número");
					respuesta2=sc.hasNextInt();
				
						if(respuesta2=true){
						numero2=sc.nextInt();
								if(numero1>numero2) {
									System.out.println(numero1+" es mayor que "+ numero2);
								}else if(numero1==numero2) {
									System.out.println(numero1+" es igual que "+ numero2);
								}else {
									System.out.println(numero1+" es menor que "+numero2);
								}
						}else {
							System.out.println("Error al introducir segundo número:introduzca solo valores numéricos");
							sc.next();
							}
				}while(respuesta2=false);
			
			
			}else {
				System.out.println("Error al introducir el primer número:introduzca solo valores numéricos");
				sc.next();
				}
		}while(respuesta=false);
		
		
	System.out.println("FIN");
			
}
} 