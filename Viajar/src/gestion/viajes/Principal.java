package gestion.viajes;

import java.util.Scanner;

public class Principal {
	/*
	 * Crear un menú con las siguientes opciones:
	 *  1) Mostrar todos los Clientes. Que
	 * muestre la información de todos los clientes. 
	 * 2) Mostrar todos los Viajes.  Que muestre la información de todos los viajes.
	 * 
	 *  3) Mostrar todas las Reservas. Que muestre el código de reserva, el nombre del cliente y el
	 * destino de todas las reservas de la lista.
	 * 
	 *  4) Eliminar. Solicitar el código de la reserva que se desea cancelar y borrarla de la lista listaReservas.
	 *  5) Reservar. Que llame al método crearReserva e inserte la reserva creada en el
	 * array listaReservas. 
	 * 6) Salir.
	 */
	public static void main(String[] args) {
	
	// Primero voy a meter los clientes en el array misClientes para que no esté vacío
	Cliente.crearClientesFicticios();
	
	// Metemos tb los viajes ficticios en el array viajes para que no esté vacío
	Viaje.crearViajesFicticios();
	
	// hacemos lo mismo con las reservas
	Reserva.crearReservasFicticias();
	Scanner sc= new Scanner (System.in);
	final String MENU="-----Menú-----\n1) Mostrar todos los clientes.\n2) Mostrar todos los viajes.\n"
			+ "3) Mostrar todas las reservas.\n4) Elimnar reserva.\n5) Reservar.\n6) Salir";
	
	System.out.println(MENU);
	int opcion=0;
	do {
		
	 opcion=Validaciones.obtenerNumero("Seleccione la opción que desea: ", "Error! Debe introducir un número entero.");	
		
		switch (opcion) {
		case 1:
			for(Cliente cliente : Cliente.getMisClientes()) {
				System.out.println(cliente.toString());
			}
			
			break;
		case 2:
			for (Viaje viaje : Viaje.getViajes()) {
				System.out.println(viaje.toString());
			}	
			break;
		case 3:
			//3) Mostrar todas las Reservas. Que muestre el código de reserva, el nombre del cliente y el
		 // destino de todas las reservas de la lista.

			for (Reserva reserva : Reserva.getListaReservas()) {
				System.out.println("Código de reserva= "+reserva.getCodigoReserva()+" - Nombre del cliente: "+reserva.getCliente().getNombre()+" - Destino: "+reserva.getViaje().getDestino());
			}
			break;
		case 4:
	
		Reserva.eliminarReserva();
			
			
			break;
		case 5:
			
			Reserva.crearReserva();
			
			break;
		case 6:
			System.out.println("Salimos");
			break;
		default:
			System.out.println("La opción señalada no está dentro del menú.");
			break;
		}
		
	}while(opcion!=6);

	}

}
