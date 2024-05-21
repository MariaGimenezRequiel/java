package u3.tareas;

import java.util.Scanner;

public class Ejercicio3_practica {
	/** 
	 * @author "María Giménez Requiel"
	 * **/
	/**Crear un programa que pida por teclado nombres y los vaya almacenando en una variable de tipo String hasta que se introduzca la palabra fin o la longitud de la cadena sea mayor o igual a 50. 

	Una vez terminado mostrar todos los nombres introducidos (mostrar los nombres separados con salto de línea) e indicar el número de nombres que se han introducido.

	Por ejemplo:

	- Antonio
	- Peligros
	- Ana

	Se han introducido 3 nombres.**/
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre="0";
		String nombres="0";
		String nombre2="0";
		int n=1;
		int numfra1;
		int numfra2=0;
		String imprimir;
		String imprimir2="0";
		boolean correcto;
		//Recogemos el primer nombre con control de errores
		do {
			try {
				System.out.println("Introduzca un nombre: ");
				nombre=sc.nextLine().trim();
				correcto=true;
			}catch(Exception e) {
				System.out.println("Error:vuelva a intentarlo.");
				correcto=false;
			}
		}while(!correcto);
		
		numfra1= nombre.length();
		imprimir="- "+nombre;
		
		// Si al introducir el primer nombre se cumple alguna
		//de las condiciones para salir de la aplicacion, entramos en el if y si no entramos en el bucle para seguir sumando nombres.
		if(nombre.equalsIgnoreCase("fin")) {
			System.out.println("Salimos del programa. Ha introducido 0 nombres.");
		}else {
						if(numfra1>=50) {
							System.out.println(imprimir);
							System.out.println("Se han introducido "+n+" nombre.");
						}else {
							//Si el primer nombre no sobrepasa 50 de longitud del String, pasamos a recoger los siguientes nombres con un bucle.
							do {
							// Recogemos los sucesivos nombres con control de errores
								do {
									try {
										System.out.println("Introduzca un nombre: ");
										nombre2=sc.nextLine().trim();
										correcto=true;
									}catch(Exception e) {
										System.out.println("Error:vuelva a intentarlo.");
										correcto=false;
									}
								}while(!correcto);
							
								if(nombre2.equalsIgnoreCase("fin")) {
									System.out.println("Salimos de la aplicación");
									
								}else {
									n++; //n la hemos inicializado fuera del bucle a 1 porque contamos con que ya hemos recogido un nombre
									nombres= nombre+nombre2;//1º Maria+Pepe 2ºMariaPepe+Tania
									nombre=nombres;//1º MariaPepe 2ºMariaPepeTania
									numfra2=nombres.length();//1º 9  2º 14
									imprimir2= imprimir+"\n- "+nombre2; //hago una variable String diferente para contar la longitud de la cadena de nombres
									// y otra para imprimirla en pantalla con los guiones, para que al contar caracteres no tenga en cuenta los guiones
									// ni los espacios de lo que se imprime.
									imprimir=imprimir2;
									
								}
							}while(numfra2<50 && !nombre2.equalsIgnoreCase("fin")); //si la longitud de la cadena 
							//sin guiones ni espacios es inferior a 50 o el nombre introducido no es fin seguirá entrando en el bucle
							//en cuanto se cumpla una de esas condiciones sale e imprime los resultados.
							System.out.println(imprimir);
							System.out.println("Se han introducido "+n+" nombres.");
				
					}
	}
	
}

}
