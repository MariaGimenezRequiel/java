package u3.tareas;

import java.util.Scanner;

public class Ejemplopropioif {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escriba su edad:");
		int edad=sc.nextInt();
		
		if(edad<0) {
			System.out.println("Valores incorrectos");
		}if(edad>0) {
		System.out.println("Su edad es: "+ edad); //como pongo if aunque se cumpla el anterior va a leer este tambien
		
		}if(edad>0 && edad<18) {
			System.out.println("Usted es menor de edad");	// para que lea esta tengo que poner un if porque la anterior se cumple
		}else {
			System.out.println("Usted es mayor de edad");  //cuando no se cumple ninguna de las anteriores condiciones ya salta el else
		}
		System.out.println("fin");
	}

}
