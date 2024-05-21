package u2.tareas;

import java.util.Scanner;

public class Tarea4 {
/** Crear un programa que solicite los datos necesarios por teclado y sume lo siguiente:

dos números enteros
dos números decimales con 4 cifras de precisión
dos booleanos
dos números negativos y un decimal */
	public static void main(String[] args) {
		// creamos el lector
		Scanner sc= new Scanner(System.in);
		

		//Leemos y sumamos los dos números enteros
		System.out.println("Introduzca un número entero:");
		int a= sc.nextInt();
		System.out.println("Introduzca un segundo número entero:");
		int b= sc.nextInt();
		
		int resultado= a+b;
		System.out.println("La suma de ambos números es: "+resultado);
	
		
		
		// Leemos y sumamos dos números decimales
		System.out.println("Escriba un número decimal de no más de 4 cifras: ");
		double c= sc.nextDouble();
		System.out.println("Escriba un segundo decimal de no más de 4 cifras: ");
		double d= sc.nextDouble();
		
		double resultadodecimal= c+d;
		System.out.println(" La suma de ambos decimales es: "+ resultadodecimal);
		
		
		
		//Leemos y sumamos dos valores booleanos
		System.out.println("Escriba true o false: ");
		boolean e= sc.nextBoolean();
		System.out.println("Escriba true o false otra vez: ");
		boolean f= sc.nextBoolean();
		
		boolean resultadob= e&&f;
		System.out.println("La suma de ambas proposiciones es: "+ resultadob);
		
		
		//Leemos y sumamos dos números negativos y un número decimal
		System.out.println("Escriba un número negativo:");
		double g= sc.nextDouble();
		System.out.println("Escriba un segundo número negativo:");
		double h= sc.nextDouble();
		System.out.println("Escriba un número decimal: ");
		double i= sc.nextDouble();
		
		double resultadof= g+h+i;
		System.out.println("La suma de estos números es "+resultadof);
		

	}

}
