package u4.tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemploarray {

	public static void main(String[] args) {
	// declarar un array de tipo entero de 5 posciones
		int [] numeros = new int[5]; // aunque no utilice todas estoy reservando 5 posiciones
		// si mi array tiene un tamaño de 5 las posicines van desde la 0 hasta la 4	
		// en este array tengo dos formas de meter los valores, indicando el índice, en un principio he creado el array que está vaío y
		// voy incluyendo valores conforme los vaya necesitando

		numeros[0]=2;
		numeros[3]=5;
		
		// oooo tambien puedo declarar el array e inicializar los valores directamente
		int[] numeros3= {1,2,3,4,5};
		
		// recoger valores por consola
		int []numeros4=new int[3];
		Scanner numero=new Scanner(System.in);
		for(int i=0;i< numeros4.length;i++) {
			System.out.println("Introduzca un número entero:");
			if(numero.hasNextInt()) {
				numeros4[i]=numero.nextInt();
			}else {
				numero.next();
				i--; // para que el error no se sume como un intento mas del bucle
			}
		}
		
		//Para pintar los valores por consola
		for(int i=0;i<numeros4.length;i++) {
			System.out.println(numeros4[i]);
			
		}
		
		
		// los anteriores son el mismo tipo de array y los utilizaré en función de si sé los valores que hay que introducir o no.
		ArrayList<Integer>numeros2= new ArrayList<>(); // no necesito darle un tamaño a este y requiere de importar una clase
														//coge espacio de la memoria conforme va metiendo datos
		
		// para añadir datos
		numeros2.add(100); // acabo de añadir un valor a mi arraylist
		numeros2.add(200); //se añade uno detrás de otro
		
		// también puedo añadir valores con un bucle y recogiendo por teclado como en el anterior
		for(int i=0;i<5;i++) {
			System.out.println("Introduzca un número entero:");
			if(numero.hasNextInt()) {
				numeros2.add(numero.nextInt());  // solo cambio esta línea
				// numeros2.add(5, numero.nextInt()); con este método podemos incluir los valores en un lugar concreto del índice
			}else {
				numero.next();
				i--; // para que el error no se sume como un intento mas del bucle
			}
		}
			//ahora vamos a recorrer el array para imprimir por consola
			 for(int i=0;i<numeros2.size();i++) {
				 // para imprimir en este caso tendremos que usar el método get
				 System.out.println(numeros2.get(i));
			 }
			
		
	}

}
