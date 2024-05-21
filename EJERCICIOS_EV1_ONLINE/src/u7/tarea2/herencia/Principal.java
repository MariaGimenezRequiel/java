package u7.tarea2.herencia;

import java.util.Scanner;

public class Principal {
	/*
	 * Una vez hecha la estructura de la tarea 2, crear un menú:
	 * 
	 * 1) Crear Vehículos (deberá solicitar los datos del vehículo que se quiera
	 * crear, tendréis que saber si el vehículo es un barco, coche, avión... ) y una
	 * vez creado almacenarlo en un array de Vehículos.
	 * 
	 * 2) Mostrar Información de un vehículo concreto.
	 * 
	 * 3) Mostrar todos los coches (mostrar su número de serie, color y nº de
	 * puertas)
	 */ 

	public static void main(String[] args) {
		Coche.crearCochesFicticios();
		Avion.crearAvionesFicticios();
		Barco.crearBarcosFicticios();
		Scanner sc= new Scanner (System.in);
		final String SALTO = "\n";
		final String TXTMENU="_________Menú___________"+SALTO+"1) Crear vehículos"+SALTO+"2) Mostrar información de un vehículo en concreto."+SALTO
		 		+ "3) Mostrar todos los coches."+SALTO+"4) Salir.";
		final String TXTMENU2="¿Qué tipo de vehículo desea registrar?"+SALTO+" A)Coche."+SALTO+" B)Avión."+SALTO+" C)Barco."+SALTO+" D)Otro.";
		 
		int opcion=0;
		 
		 do {
		System.out.println(TXTMENU);
		opcion= ControlErrores.obtenerNumero("Introduzca la opción deseada: ", "Error! Debe introducir un número entero.");
		
		switch (opcion) {
		case 1:
			// crear  vehículo clasificándolo
		boolean correcto=true;
		do {
		System.out.println(TXTMENU2);
		String respuesta= sc.nextLine();
		
			if (respuesta.equalsIgnoreCase("A")|respuesta.equalsIgnoreCase("B")|respuesta.equalsIgnoreCase("C")|respuesta.equalsIgnoreCase("D")) {
				Vehiculo.crearVehiculo(respuesta);
				correcto=true;
			}else {
				System.out.println("La opción introducida no es correcta. Vuelva a intentarlo introduciendo una de las letras de las opciones del menú.");
				sc.next();
				correcto=false;
				
			}
		}while(!correcto);
					break;
		case 2:
					Vehiculo.mostrarVehiculo();
					break;
		case 3:
					Coche.mostrarCoches();
					break;
		case 4:
			System.out.println("Salimos.");
			break;
		default:
			System.err.println("La opción escogida no está dentro del menú.");
			break;
		}
			 
			 
		 }while (opcion!=4);
		 

	}

}
