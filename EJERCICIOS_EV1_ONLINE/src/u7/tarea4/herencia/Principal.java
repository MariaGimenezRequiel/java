package u7.tarea4.herencia;

import java.util.Scanner;

public class Principal {
	/*
	 * Utiliza la estructura de la tarea3 y crea una clase Principal en la cual: 
	 * a)
	 * Crear un método que cree instancias ficticias de Plantas, Carnívoros y
	 * Herbívoros y los inserte en el array "listaSeresVivos" :
	 *  - Crea un objeto (instancia) de Planta.
	 *   - Crea un objeto de tipo Carnivoros. 
	 *   - Crea un objeto de tipo Herbivoros.
	 * 
	 * b) Crea los métodos necesarios para solicitar datos de seres vivos y que
	 * estos se inserten en el array. Dependiendo del tipo de ser que se quiera
	 * insertar solicite los datos necesarios y se cree el SerVivo que luego se
	 * insertará en el array.
	 * 
	 * c) Por último, recorrer el array y mostrar los datos de todos los seres vivos
	 * bien formateados.
	 */
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		final String SALTO ="\n";
		final String MENUTXT= "---------------Menú---------------"+SALTO+"a) Crear instancias ficticias."
				+SALTO+"b) Solicitar los datos de seres vivos e insartarlos en en la lista de Seres Vivos."
				+SALTO+"c) Mostrar todos los seres vivos."+SALTO+"d) Salir.";
		final String MENUTXT2= "¿Qué tipo de ser vivo desea introducir?"+SALTO+"1) Planta."
				+SALTO+"2) Animal carnívoro."
				+SALTO+"3) Animal herbívoro."+SALTO+"4) Otro tipo de animal.";
		final String ERROR="Error!Introduzca un número entero.";
		boolean introducido=false;
		String opcion="";
		do {
		System.out.println(MENUTXT+SALTO+" Por favor, introduzca la opción del menú que desee:");
		opcion=sc.nextLine().toUpperCase();
		
		switch (opcion) {
		case "A":
			//SI YA EXISTEn NO SE PUEden CREAR OTRA VEZ
			if(introducido==false) {
			SeresVivos.crearDatosFicticios();
			introducido=true;
			System.out.println("Los valores han sido creados correctamente.");
			}else {
				System.err.println("Estos valores ya han sido creados y no se pueden volver a introducir.");
			}
			break;
		case "B":
			int respuesta=ControlErrores.obtenerNumer(MENUTXT2, 1, 4, ERROR);
			SeresVivos.crearSeresVivos(respuesta);
				
			break;
		case "C":
			SeresVivos.mostrarSeresVivos();
			break;
		case "D":
			System.out.println("Salimos de la aplicación.");
			break;
		default:
			System.err.println("La opción introducida no es válida. Por favor, vuelva a intentarlo.");
			break;
		}
		
		}while(opcion!="D");
		
		
		
		
		

	}

}
