package GESTION_SALA_ORDENADORES;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MARIA REQUIEL
 *
 */
public class Principal {
	/*
	 * Mostrar un menú que haga lo siguiente:
	 * 
	 * - Crear un puesto. - Eliminar un puesto. - Reservar un puesto. - Listar los
	 * ordenadores reservados. - Listar los ordenadores disponibles. - Salir.
	 */
	
	public static String recogerLetras(String msg ) {
			String dato="";
			
			Scanner sc= new Scanner (System.in);
		
				System.out.println(msg);
				dato=sc.nextLine();
		
				return dato;
		
		}
	
	public static int recogerNumeros(String msg,String error) {
		Scanner scNum= new Scanner (System.in);
		int dato=0;
		boolean correcto=true;
		do{
			try {
			System.out.println(msg);
			dato= scNum.nextInt();
			correcto=true;
			}catch(InputMismatchException e) {
				System.err.println(error);
				correcto=false;
				scNum.next();
			}
		}while(!correcto);
		return dato;
	}
	
	
	public static void main(String[] args) {
	
	
	final String MENU ="-----Menú------\n 1. Crear puesto.\n 2. Eliminar puesto.\n 3. Reservar puesto.\n"
	+" 4. Listar ordenadores reservados\n 5. Listar ordenadores disponibles. \n 6. Salir";
	int opcion=0;
	System.out.println(MENU);
		do {
		 opcion= recogerNumeros("Introduzca la opción deseada: ", "Error! debe introducir un número entero.");
			
			switch (opcion) {
			case 1:
				String codigo= recogerLetras("Introduzca el código del ordenador: ");
				
				Puesto p= new Puesto(codigo);
				
				Puesto.getListaPc().add(p);
				
				break;
			case 2:
			
				String codigoeliminar= recogerLetras("Introduzca el código del ordenador que desea eliminar: ");
				
				boolean encontrado=false;
				/*
				 * for (int i=0; i<Puesto.getListaPc().size();i++) {
				 * if(Puesto.getListaPc().get(i).getCodigo().equals(codigoeliminar)) {
				 * Puesto.getListaPc().remove(Puesto.getListaPc().get(i)); encontrado=true;
				 * break; } }
				 */
					for(Puesto puesto : Puesto.getListaPc()) {
						if(puesto.getCodigo().equals(codigoeliminar)) {
							Puesto.getListaPc().remove(puesto);
							encontrado=true;
							System.out.println("El puesto "+puesto.getCodigo()+" ha sido eliminado.");
							break;
						}
					}
						
				if (!encontrado) {
					System.out.println("El puesto indicado no existe.");
				}
				
				
						break;
			case 3:
				// primero comprobar si hay algun puesto libre
				// el primer puesto que no este libre lo utilizamos
				//pedimos datos de la persona y le reservamos ese puesto
				boolean reservadoOK=false;
				
				for (Puesto puesto : Puesto.getListaPc()) {
					if(!puesto.isReservado()) {
						
						String nombre=recogerLetras("Introduzca su nombre:");
						String dni=recogerLetras("Introduzca su DNI:");
						Persona persona=new Persona(dni, nombre);
						
						puesto.setReservado(true);
						puesto.setUsuario(persona);
						
						System.out.println("Puesto "+puesto.getCodigo()+ " reservado por: "+persona.getNombre());
						reservadoOK=true;
					break; // para no seguir recorriendo la lista
					}
				}
				
				if (!reservadoOK) {
					System.out.println("No hay puestos libres. ");
				}
				
				break;
			case 4:
				// Listar ordenadores reservados
				boolean reservado1=false;
				for(Puesto puesto : Puesto.getListaPc()) {
					if(puesto.isReservado()) {
					System.out.println(puesto.toString());
					reservado1=true;
					
					}
				}
				if(!reservado1) {
					System.out.println("No hay ningún ordenador reservado. Todos están disponibles.");
				}
				break;
			case 5:
				// listar ordenadores no reservados
				boolean reservado2=true;
				for(Puesto puesto : Puesto.getListaPc()) {
					if(!puesto.isReservado()) {
					System.out.println(puesto.toString());
					reservado2=false;
					}
				}
				if(reservado2) {
					System.out.println("No hay ningún ordenador disponible.");
				}
				
				break;
			case 6:
				System.out.println("Salimos del programa.");
				break;
			default:
				System.err.println("Error! No ha introducido ninguno de los valores disponibles.");
				break;
			}
		
		}while (opcion!=6);
		}

}
