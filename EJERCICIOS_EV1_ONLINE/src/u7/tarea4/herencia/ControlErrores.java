package u7.tarea4.herencia;

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
	// obtener número con min y max . Esto es por si quiero por ejemplo que la edad sea mayor de 18 y si no lo es que le salte el error
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
					System.err.println("Error! Introduzca valores entre: "+min+" y "+max);
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
	// obtener número decimal con control de errores
	public static double obtenerNumeroDecimal (String msg, String error) {
		Scanner scNum= new Scanner(System.in);
		double dato=0;
		boolean correcto=true;
		do {
			try {
				System.out.println(msg);
				dato=scNum.nextDouble();
				correcto=true;
				
			}catch(Exception e) { //aquí le he metido una excepción general pero si quieres puedes capturar una específica
				System.err.println(error);
				scNum.next();
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
	// validar un string con una expresión regular
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
	public static boolean obtenerBoolean(String msg) {
		Scanner sc= new Scanner(System.in);
		String dato="";
		boolean si=true;
		boolean correcto=true;
		do {
			
				System.out.println(msg);
				dato=sc.nextLine();
			
				if(dato.equalsIgnoreCase("si")||dato.equalsIgnoreCase("sí")) {
					si=true;
					correcto=true;
				}else if (dato.equalsIgnoreCase("no")) {
					si=false;
					correcto=true;
				}else {
					System.out.println("El valor introducido no es correcto. Por favor, introduzca \"sí\" o \"no\":");
					correcto=false;
					
					
				}
				
		}while(!correcto);
		return si;
	}
	
	
	
	
	
	
}
