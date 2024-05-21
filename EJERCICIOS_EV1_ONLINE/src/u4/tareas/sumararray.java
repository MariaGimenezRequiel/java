package u4.tareas;

import java.util.Scanner;

public class sumararray {
	/*
	 * Crear una aplicación que solicite 5 números entre el 0 y el 50 y los inserte
	 * en un array. Posteriormente calcularemos la suma de todos.
	 */
	public static void main(String[] args) {
		int numeros[]=new int [5];
		Scanner sc= new Scanner(System.in);
		int suma=0;
		for(int i =0; i<numeros.length;i++) {
			System.out.println("Introduzca un número entero entre 0 y 50: ");
			if(sc.hasNextInt()) {
				numeros[i]=sc.nextInt();
					if(numeros[i]<0||numeros[i]>50) {
						System.err.println("Valor no válido, introduzca un número entero entre 0 y 50");
						sc.next();
						i--;
					}
			}else {
				System.err.println("Valor no válido, introduzca un número entero entre 0 y 50");
				sc.next();
				i--;
			}
		}
			for(int i =0; i<numeros.length;i++) {
			suma= suma+numeros[i]; //suma=0+primer numero introducido(6)=6
									// segunda vuelta suma=6+segundo numero(6)=12
			
			}
			System.out.println(numeros[0]+"+"+numeros[1]+"+"+numeros[2]+"+"+numeros[3]+"+"+numeros[4]+"= "+suma);
		

	}

}
