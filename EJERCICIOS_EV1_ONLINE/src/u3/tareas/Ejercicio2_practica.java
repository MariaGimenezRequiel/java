package u3.tareas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2_practica {

	public static void main(String[] args) {
		/** 
		 * @author "María Giménez Requiel"
		 * **/
		/**Escribe un programa recoja 3 números entero y muestre un menú en el que se dan las siguientes opciones:

a) Ordenar: Esta opción ordenará de menor a mayor los 3 números recogidos y los mostrará ordenados.

b) Mostrar: Preguntará si quiere mostrar el mayor o menor y dependiendo de lo que el usuario indique mostrará el valor mayor o menor de los 3 números recogidos.

c) Cambiar: volverá a solicitar 3 valores nuevos.

d) Salir: cuando el usuario seleccione esta opción mostrará un mensaje indicando el final de la ejecución y se cerrará la aplicación.

		 ** Controlar que no se repitan los 3 valores recogidos.

		 ** Debe llevar control de errores.

		 ** Utilizar bucles para controlar que el programa no finalice hasta que la opción elegida sea la "d" (salir).
		 * 
		 */

		Scanner sc= new Scanner(System.in);
		Scanner letras=new Scanner (System.in);
		int numero1=0;
		int numero2=0;
		int numero3=0;
		boolean correcto=true;
		String opcion="0";
		String opcion2="0";

		//Pedimos el primer número con control de errores

		do {
			do {
				try {
					System.out.println("Introduzca el primer número entero: ");
					numero1=sc.nextInt();
					correcto=true;
				}catch(InputMismatchException e) {
					System.out.println("Error al introducir un número, por favor vuelva a intentarlo. Introduzca unicamente números enteros");
					sc.next();
					correcto=false;
				}
			}while(!correcto);

			//Pedimos el segundo número con control de errores y que no se repita con el tercero
			do {
				try {
					System.out.println("Introduzca el segundo número entero: ");

					numero2=sc.nextInt();
					if(numero2!=numero1){
						correcto=true;
					}else {
						System.out.println("Valor incorrecto. Por favor, introduzca un número diferente del anterior");
						correcto=false;
					}
				}catch(InputMismatchException e) {
					System.out.println("Error al introducir un número, por favor vuelva a intentarlo. Introduzca unicamente números enteros");
					sc.next();
					correcto=false;
				}
			}while(!correcto);

			// Pedimos el tercer numero entero con control de errores y que no se repita con ninguno de los anteriores
			do {
				try {
					System.out.println("Introduzca el tercer número entero: ");
					numero3=sc.nextInt();
					if(numero2!=numero1&& numero3!=numero2 && numero3!=numero1){
						correcto=true;
					}else {
						System.out.println("Valor incorrecto. Por favor, introduzca un número diferente de los anteriores");
						correcto=false;
					}
				}catch(InputMismatchException e) {
					System.out.println("Error al introducir un número, por favor vuelva a intentarlo. Introduzca unicamente números enteros");
					sc.next();
					correcto=false;
				}
			}while(!correcto);

			//Creamos el texto del menú
			String txtmenu="A) Ordenar números de menor a mayor. \nB) Mostrar mayor o menor de los tres números introducidos. \nC) Cambiar los números. \nD) Salir.";
			System.out.println(txtmenu);
			do {
				do {
							try {
								System.out.println("Introduzca la letra de la opción escogida: ");
								//Recogemos la opción elegida con control de errores
								opcion= letras.nextLine().toLowerCase().trim();
								correcto=true;
							}catch(Exception e) {
								System.out.println("Error!! Vuelva a intentarlo");
								correcto=false;
							}
					}while(!correcto);
				switch (opcion) {
				case "a":
					if (numero1>numero2&& numero2>numero3) {

						System.out.println("Números ordenados de menor a mayor: "+ numero3+" , "+numero2+" , "+numero1);
					}else if (numero1<numero2&&numero2<numero3) {
						System.out.println("Numeros ordenados de menor a mayor: "+ numero1+ " , "+numero2+" , "+numero3);
					}else if (numero2>numero1&& numero1>numero3) {
						System.out.println("Numeros ordenados de menor a mayor: "+ numero3+ " , "+numero1+" , "+numero2);
					}else if(numero2<numero1&&numero1<numero3) {
						System.out.println("Numeros ordenados de menor a mayor: "+ numero2+ " , "+numero1+" , "+numero3);
					}else if(numero1>numero3&& numero3>numero2) {
						System.out.println("Números ordenados de menor a mayor: "+ numero2+" , "+numero3+" , "+numero1);
					}else{
						System.out.println("Números ordenados de menor a mayor: "+ numero1+" , "+numero3+" , "+numero2);
					}
					break;
				case "b":
					do {
						do {
								try {
									System.out.println(" Escriba si quiere mostrar el \"mayor\" o \"menor\" de los tres.");
									opcion2=letras.nextLine().toLowerCase().trim();
									correcto=true;
								}catch(Exception e) {
									System.out.println("Error! Vuelva a intentarlo");
									correcto=false;
								}
						}while(!correcto);
						switch (opcion2) {
						case "mayor":
							correcto=true;
							if(numero1>numero2&& numero1>numero3) {
								System.out.println(numero1+" es el mayor número de los tres introducidos.");	
							}else if(numero2>numero1&&numero2>numero3) {
								System.out.println(numero2+" es el mayor número de los tres introducidos.");
							}else {
								System.out.println(numero3+" es el mayor número de los tres introducidos.");
							}
							break;
						case "menor":
							correcto=true;
							if(numero1<numero2&& numero1<numero3) {
								System.out.println(numero1+" es el menor número de los tres introducidos.");	
							}else if(numero2<numero1&&numero2<numero3) {
								System.out.println(numero2+" es el menor número de los tres introducidos.");
							}else {
								System.out.println(numero3+" es el menor número de los tres introducidos.");
							}
							break;
						default:
							System.out.println("La opción escogida no está dentro de las posibles.");
							correcto=false;
							break;
						}
					}while (!correcto);
					
					break;

				case "c":
					System.out.println("Escoja otros números nuevamente.");
					break;
				case "d":
					System.out.println("Salimos de la aplicación.");
					break;

				default:
					System.out.println("La opción elegida no está dentro de las opciones disponibles del menú. Por favor, vuelva a intentarlo.");
					correcto=false;
					break;
				}
			}while(opcion.equals("a")||opcion.equals("b")||!correcto);
		}while (opcion.equals("c"));
	}


}
