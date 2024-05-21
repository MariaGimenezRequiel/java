package gestion.viajes;

import java.util.ArrayList;
import java.util.Scanner;

public class Viaje {
	
// atributos
	private String id;
	private String salida;
	private String destino;
	private String fechaIncio;
	private String fechaFin;
	private int plazas;
	
	private static ArrayList<Viaje>viajes=new ArrayList<>();
	
 // constructors
	public Viaje() {
		
	}

	
	public Viaje(String id) {
		
		this.id = id;
	}



	public Viaje(String id, String salida, String destino, String fechaIncio, String fechaFin, int plazas) {
	
		this.id = id;
		this.salida = salida;
		this.destino = destino;
		this.fechaIncio = fechaIncio;
		this.fechaFin = fechaFin;
		this.plazas = plazas;
	}

// getters and setters
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSalida() {
		return salida;
	}


	public void setSalida(String salida) {
		this.salida = salida;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getFechaIncio() {
		return fechaIncio;
	}


	public void setFechaIncio(String fechaIncio) {
		this.fechaIncio = fechaIncio;
	}


	public String getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}


	public int getPlazas() {
		return plazas;
	}


	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}


	public static ArrayList<Viaje> getViajes() {
		return viajes;
	}


	public static void setViajes(ArrayList<Viaje> viajes) {
		Viaje.viajes = viajes;
	}


	// to string method
	public String toString() {
		return "Viaje [id=" + id + ", salida=" + salida + ", destino=" + destino + ", fechaIncio=" + fechaIncio
				+ ", fechaFin=" + fechaFin + ", plazas=" + plazas + "]";
	}
	
	public static void crearViajesFicticios() {
		
		Viaje v1= new Viaje("v1", "Murcia", "Madird", "01/08/2022", "10/08/1022", 2);
		viajes.add(v1);
		Viaje v2= new Viaje("v2", "Bilbao", "Cádiz", "15/09/2020", "28/09/1020", 1);
		viajes.add(v2);
		Viaje v3= new Viaje("v3", "Santiago de Compostela", "Barcelona", "01/01/2023", "15/01/1023", 5);
		viajes.add(v3);
		Viaje v4= new Viaje("v4", "Madrid", "Sevilla", "01/04/2022", "10/04/1022", 3);
		viajes.add(v4);
		Viaje v5= new Viaje("v5", "Murcia", "Madrid", "02/03/2022", "28/03/2022", 4);
		viajes.add(v5);
	}
	
	public static Viaje crearViajes() {
		
		
		int tamaño= viajes.size()+1;
		String id ="v"+tamaño;
		
		
		String salida= Validaciones.obtenerLetras("Introduzca la ciudad de salida: ", "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$", "Error! El nombre de salida introducido no es válido.");
		
	
		String destino= Validaciones.obtenerLetras("Introduzca la ciudad de destino: ", "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$", "Error! El nombre de destino introducido no es válido.");
		
	
		String fechaInicio= Validaciones.obtenerLetras("Introduzca la fecha de inicio del viaje: ", "^(0?[1-9]|[1-2][0-9]|3[0-1])\\/(0?[1-9]|1[0-2])\\/\\d{4}$", "Error! El formato de la fecha debe ser: dd/mm/aaaa.");
		
		
		String fechaFin= Validaciones.obtenerLetras("Introduzca la fecha de fin del viaje: ", "^(0?[1-9]|[1-2][0-9]|3[0-1])\\/(0?[1-9]|1[0-2])\\/\\d{4}$", "Error! El formato de la fecha debe ser: dd/mm/aaaa.");
		
		
		int plazas= Validaciones.obtenerNumer("Introduzca el número de plazas a reservar: ", 0, 100, "Error! Debe introducir un número entero.");
		
		Viaje v= new Viaje(id, salida,destino, fechaInicio, fechaFin, plazas);
		viajes.add(v);
		return v;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
