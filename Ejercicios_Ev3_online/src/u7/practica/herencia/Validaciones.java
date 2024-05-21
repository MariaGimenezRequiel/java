package u7.practica.herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validaciones {
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
	
	public static String obtenerLetras(String msg,String expresion,String error) {
		Scanner sc= new Scanner(System.in);
		String dato="";
		boolean correcto=true;
		do {
			
				System.out.println(msg);
				dato=sc.nextLine();
				if(dato.matches(expresion)) {
					correcto=true;
				}else {
					System.err.println(error);
					correcto=false;
				}
				
		}while(!correcto);
		return dato;
	}
	
	public static int obtenerNumer(String msg,int min, int max, String error) {
		Scanner scNum= new Scanner(System.in);
		int dato=0;
		boolean correcto=true;
		do {
			try {
				System.out.println(msg);
				dato=scNum.nextInt();
				if(dato>=min && dato<=max) {
					correcto=true;
				}else {
					System.out.println("Error! Introduzca valores entre: "+min+" y "+max);
					correcto=false;
				}
				
			}catch(InputMismatchException e) {
				System.err.println(error);
				scNum.next();
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
}
