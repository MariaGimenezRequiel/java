package u7.tarea2.herencia;

import java.util.ArrayList;
import java.util.Scanner;


public class Vehiculo {
	// attributes
	private double km;
	private String color;
	private int numSerie;
	private String descripcion;
	
	// variable de clase
	private static ArrayList<Vehiculo>listaVehiculos=new ArrayList<>();
	
	// constructors
	
	public Vehiculo() {
		
	}

	public Vehiculo(double km, String color, int numSerie, String descripcion) {
		
		this.km = km;
		this.color = color;
		this.numSerie = numSerie;
		this.descripcion = descripcion;
	}


	// getters and setters
	public double getKm() {
		return km;
	}



	public void setKm(double km) {
		this.km = km;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getNumSerie() {
		return numSerie;
	}



	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public static ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public static void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		Vehiculo.listaVehiculos = listaVehiculos;
	}

	// to string
	public String toString() {
		return "Vehiculo [km=" + km + ", color=" + color + ", numSerie=" + numSerie + ", descripcion=" + descripcion
				+ "]";
	}
	
	public static void crearVehiculo(String respuesta) {
		
		Scanner sc=new Scanner (System.in);
		double km=ControlErrores.obtenerNumeroDecimal("Introduzca los Kilómetros del vehículo:", "Error!Debe introducir un número.");
		System.out.println("Introduzca el color del vehículo: ");
		String color= sc.nextLine();
		int numSerie=ControlErrores.obtenerNumero("Introduzca el número de serie del vehículo: ", "Error! Debe introducir un número entero.");
		System.out.println("Escriba la descripción del vehículo: ");
		String descripcion= sc.nextLine();
		
		if(respuesta.equalsIgnoreCase("A")) {
			Coche.crearCoches(km, color, numSerie, descripcion);
		}else if(respuesta.equalsIgnoreCase("B")) {
			Avion.crearAvion(km, color, numSerie, descripcion);
		}else if(respuesta.equalsIgnoreCase("C")) {
			Barco.crearBarco(km, color, numSerie, descripcion);
		}else{
			Vehiculo v= new Vehiculo(km, color, numSerie, descripcion);
			listaVehiculos.add(v);
		}
		
		
	}
	
	public static void mostrarVehiculo() {
		int numSerie=ControlErrores.obtenerNumero("Introduzca el número de serie del vehículo: ", "Error! Debe introducir un número entero.");
		boolean encontrado=false;
		for (Vehiculo v : listaVehiculos) {
			if(v.getNumSerie()==numSerie) {
				System.out.println(v.toString());
				encontrado=true;
			}
		}
		if(!encontrado) {
			System.out.println("El vehículo con el número de serio: "+numSerie+" no existe.");
		}
		
		
	}
	
	


	
}
