package ejerciciosexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HorasSemanales {
	/* @author Mar�a Gim�nez Requiel 49169385P 
	 * Vamos a crear una aplicaci�n para calcular las horas de estudio de una persona semanalmente.
Solicitar por teclado el nombre de una persona, n�mero de horas al d�a que dedica a estudiar y el total de d�as
dedicados al estudio.
El nombre debe tener una longitud mayor o igual que 3.
El n�mero de horas que dedica a estudiar al d�a debe ser un n�mero entero entre 0 y 10 ambos inclusive.
Los d�as totales dedicados al estudio debe ser un n�mero entero entre 1 y 7.
Una vez recogidos todos los datos utilizando el scanner de lectura hacer el c�lculo de las horas totales que dedica
semanalmente a estudiar (multiplicando los d�as por las horas al d�a) y mostrar por consola el nombre de la persona y
las horas totales de estudio semanal calculadas.
	 * */
	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in); 
		Scanner numero=new Scanner (System.in);
		String nombre="0";
		boolean correcto=true;
		int horasdiarias=0;
		int dias=0;
		System.out.println("Introduzca su nombre: ");
		do{
			try {
			
			nombre= sc.nextLine();
			correcto=true;
				if (nombre.length()<3) {
					System.out.println("El nombre no es v�lido, introduzca m�s de 3 letras o m�s.");
					correcto=false;
					sc.next();
				}
			}catch( Exception e){
				System.out.println("Error. Vuelva a intentarlo:");
				correcto= false;
				sc.next();
				
			}
		} while(!correcto);
		
		System.out.println("Introduzca el n�mero de horas dirarias que dedica al estudio: ");
		do{
			try {
			
			horasdiarias= numero.nextInt();
			correcto=true;
			if (horasdiarias<0 || horasdiarias>10) {
				System.out.println("El valor no es v�lido. Por favor, introduzca un n�mero entre el 0 y el 10.");
				numero.next();
				correcto=false;
			}
				
			}catch( InputMismatchException e){
				System.out.println("Error. Introduzca un n�mero entero:");
				correcto= false;
				numero.next();
			}
			
		
		} while(!correcto);
		
		System.out.println("Introduzca el n�mero de d�as semanales que dedica al estudio: ");
		do{
			try {
			dias= numero.nextInt();
			correcto=true;
			if (dias<1 || dias>7) {
				System.out.println("El valor no es v�lido. Por favor, introduzca un n�mero entre el 1 y el 7.");
				numero.next();
				correcto=false;
			}
			}catch( InputMismatchException e){
				System.out.println("Error.Introduzca un n�mero entero: ");
				correcto= false;
				numero.next();
		}
		} while(!correcto);
		
		int totalhoras= horasdiarias*dias;
		System.out.println("NOMBRE: "+nombre.toUpperCase()+"\nTOTAL DE HORAS SEMANALES DEDICADAS AL ESTUDIO: "+ totalhoras);
		
		
		
		
	}

}