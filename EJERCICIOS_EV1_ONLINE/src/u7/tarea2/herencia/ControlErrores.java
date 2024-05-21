package u7.tarea2.herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlErrores {
	
	public static int obtenerNumero(String msg, String error) {
		Scanner scNum= new Scanner(System.in);
		int dato=0;
		boolean correcto=true;
		do {
			try {
				System.out.println(msg);
				dato=scNum.nextInt();
				
					correcto=true;
				
			}catch(InputMismatchException e) {
				System.err.println(error);
				scNum.next();
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
	

	public static double obtenerNumeroDecimal (String msg, String error) {
		Scanner scNum= new Scanner(System.in);
		double dato=0;
		boolean correcto=true;
		do {
			try {
				System.out.println(msg);
				dato=scNum.nextDouble();
				correcto=true;
				
			}catch(Exception e) {
				System.err.println(error);
				scNum.next();
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
	
	
	
	
	
	
	
}
