package u3.tareas;

import java.util.Scanner;

public class Ejemplosclase3_11 {

	public static void main(String[] args) {
	//ejemplo if y else
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int edad= sc.nextInt();
		if (edad<12) {
			System.out.println("Usted es estudiante");
		}else if (edad>12 && edad<17) {
		System.out.println("Usted es menor de edad y está en el instituto");
	    }else if(edad<18) { 			
			System.out.println("Usted es menor de edad");
		} else if (edad>=65) {
			System.out.println("Usted es mayor de edad y está en edad de retirarse");	
		}
		else {                                             // cuando no se cumpla ninguna de las condiciones anteriores se ejecuta el else
			System.out.println("Usted es mayor de edad pero todavía no se puede retirar"); // se tomo los valores igual y superior a 18
		}													
		System.out.println("Fin");

	}

}
