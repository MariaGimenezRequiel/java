package u3.tareas;

import java.util.Scanner;

public class Tare1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Introduzca un número entero:");
	int numero= sc.nextInt();
	
	if (numero%2==0) {
	System.out.println(numero+ " es un número par");
	}
	else {
	System.out.println(numero+ " es un número impar");
	}
	
	System.out.println("Fin");
	}

}
