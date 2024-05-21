package gestion.viajes;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear otra clase Reserva que tenga los campos código de la reserva, cliente y viaje.
Iremos almacenando las reservas que vayamos creando en un array “listaReservas”. 
Un mismo cliente puede reservar diferentes viajes.
Crear 6 reservas con datos ficticios e insertarlas en el array “listaReservas”.
Crear un método "crearReserva" que solicite los datos necesarios para crear un objeto Reserva.*/
public class Reserva {
	//atributos
	private String codigoReserva;
	private Cliente cliente;
	private Viaje viaje;
	
	private static ArrayList<Reserva>listaReservas=new ArrayList<>();
	// constructores
	public Reserva() {
		
	}
	public Reserva(String codigoReserva, Cliente cliente, Viaje viaje) {
		this.codigoReserva = codigoReserva;
		this.cliente = cliente;
		this.viaje = viaje;
	}
	
	// getters and setters
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Viaje getViaje() {
		return viaje;
	}
	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}
	public static ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	public static void setListaReservas(ArrayList<Reserva> listaReservas) {
		Reserva.listaReservas = listaReservas;
	}
	// to string method
	public String toString() {
		return "Reserva [codigoReserva=" + codigoReserva + ", cliente=" + cliente + ", viaje=" + viaje + "]";
	}
	
	// Crear 6 reservas con datos ficticios e insertarlas en el array “listaReservas”.
	
	public static void crearReservasFicticias() {
		Reserva r1=new Reserva("r1", Cliente.getMisClientes().get(1),Viaje.getViajes().get(0));
		listaReservas.add(r1);
		Reserva r2=new Reserva("r2", Cliente.getMisClientes().get(2),Viaje.getViajes().get(1));
		listaReservas.add(r2);
		Reserva r3=new Reserva("r3", Cliente.getMisClientes().get(3),Viaje.getViajes().get(2));
		listaReservas.add(r3);
		
		Reserva r4=new Reserva("r4", Cliente.getMisClientes().get(4),Viaje.getViajes().get(3));
		listaReservas.add(r4);
		Reserva r5=new Reserva("r5",Cliente.getMisClientes().get(5),Viaje.getViajes().get(4));
		listaReservas.add(r5);
		Reserva r6=new Reserva("r6", Cliente.getMisClientes().get(6),Viaje.getViajes().get(1));
		listaReservas.add(r6);
	}
	
	// Crear un método "crearReserva" que solicite los datos necesarios para crear un objeto Reserva.
	
	
	public static void crearReserva() {
		
		
		String dni= Validaciones.obtenerLetras("Introduzca su DNI: ", "^[0-9]{8}[A-Za-z]$", "Error! El formato de DNI no es válido.");
		Boolean encontrado2=false;
		Boolean encontrada3=false;
		String respuesta2="";
		Scanner sc= new Scanner (System.in);
		for (Cliente cliente : Cliente.getMisClientes()) {
			if(dni.equalsIgnoreCase(cliente.getDni())) {
				System.out.println("El cliente "+cliente.toString()+"ya existe.\n ¿Desea continuar con la reserva a este nombre?");
				respuesta2=sc.nextLine();
				encontrado2=true;
				if(respuesta2.equalsIgnoreCase("si")||respuesta2.equalsIgnoreCase("sí")) {
			
					String destino=Validaciones.obtenerLetras("Introduzca la ciudad a dónde quiere viajar: ", "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$", "Error! El nombre de destino introducido no es válido.");
					for (Viaje viaje : Viaje.getViajes()) {
						if(destino.equalsIgnoreCase(viaje.getDestino())) {
							System.out.println("¿Le vendría bien el siguiente viaje?"+viaje.toString());
							String respuesta3=sc.nextLine();
							encontrada3=true;
								if(respuesta3.equalsIgnoreCase("si")||respuesta3.equalsIgnoreCase("sí")) {
									
									int tamaño=Reserva.getListaReservas().size()+1;
									String codigo1="r"+tamaño;
									Reserva r= new Reserva(codigo1, cliente, viaje);
									Reserva.getListaReservas().add(r);
	
									System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
									
								}else {
									System.out.println("De acuerdo. En ese caso, vamos a crear un nuevo viaje para usted. Rellene los siguientes datos.");
									int tamaño=Reserva.getListaReservas().size()+1;
									String codigo1="r"+tamaño;
									Viaje viaje3=Viaje.crearViajes();
									Reserva r= new Reserva(codigo1, cliente, viaje3);
									Reserva.getListaReservas().add(r);
									System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
									
								}
							break;
						}
						break;
					}
					if(!encontrada3) {
						System.out.println(" Aún no tenemos viajes con ese destino. Por favor rellene los siguientes datos para crear uno para usted: ");
						
						int tamaño=Reserva.getListaReservas().size()+1;
						String codigo1="r"+tamaño;
						Viaje viaje=Viaje.crearViajes();
						Reserva r= new Reserva(codigo1, cliente, viaje);
						Reserva.getListaReservas().add(r);
						System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
						break;
					}
					
				}
			}
			
		}
		
		if(!encontrado2||respuesta2.equalsIgnoreCase("no")) {
			System.out.println("El cliente no existe o no quiere hacer reserva a ese nombre. Por favor. Rellene los datos del nuevo cliente. ");
			Cliente c=Cliente.crearCliente();
			
			
			System.out.println("Introduzca la ciudad a dónde quiere viajar:");
			String destino=sc.nextLine();
			for (Viaje viaje : Viaje.getViajes()) {
				if(destino.equalsIgnoreCase(viaje.getDestino())) {
					System.out.println("¿Le vendría bien el siguiente viaje?"+viaje.toString());
					String respuesta3=sc.nextLine();
					encontrada3=true;
					if(respuesta3.equalsIgnoreCase("si")||respuesta3.equalsIgnoreCase("sí")) {
						int tamaño=Reserva.getListaReservas().size()+1;
						String codigo1="r"+tamaño;
						Reserva r= new Reserva(codigo1, c, viaje);
						Reserva.getListaReservas().add(r);
						System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
						break;
					}else {
						System.out.println("De acuerdo. En ese caso, vamos a crear un nuevo viaje para usted. Rellene los siguientes datos.");
						int tamaño=Reserva.getListaReservas().size()+1;
						String codigo1="r"+tamaño;
						Viaje viaje2=Viaje.crearViajes();
						Reserva r= new Reserva(codigo1, c, viaje2);
						Reserva.getListaReservas().add(r);
						System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
						break;
						
					}
				}
			}
			if(!encontrada3) {
				System.out.println(" Aún no tenemos viajes con ese destino. Por favor rellene los siguientes datos para crear uno para usted: ");
				int tamaño=Reserva.getListaReservas().size()+1;
				String codigo1="r"+tamaño;
				Viaje viaje2=Viaje.crearViajes();
				Reserva r= new Reserva(codigo1, c, viaje2);
				Reserva.getListaReservas().add(r);
				System.out.println(" Se ha hecho la siguiente reserva: "+r.toString());
			
			}
		}
		
	}
	
	public static void eliminarReserva () {
		Scanner sc= new Scanner (System.in);
		String codigo= Validaciones.obtenerLetras("Introduzca el código de la reserva que desea eliminar: ", "^r[0-9]$", "Error! El formato introducido de la reserva no es válido.");
		boolean encontrada=false;
		for (Reserva reserva : Reserva.getListaReservas()) {
			if(reserva.getCodigoReserva().equalsIgnoreCase(codigo)) {
				System.out.println("Reserva encontrada. \n ¿Está segur@ de que desea eliminarla esta reserva? "+reserva.toString());
				String respuesta=sc.nextLine();
				encontrada=true;
				if(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("sí")) {
					Reserva.getListaReservas().remove(reserva);
					System.out.println("La reserva "+reserva.getCodigoReserva()+" ha sido eliminada.");
					break;
				}else {
					System.out.println(" La reserva no ha sido eliminada.");
					break;
				}
			}
		}
		if(!encontrada) {
			System.out.println("La reserva no ha sido encontrada.");
		}
	}
	
	
}
