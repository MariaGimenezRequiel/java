package u7.tarea2.herencia;

import java.util.Scanner;

public class Barco extends Vehiculo {
	// attributes
	private String flota;

	
	// constructors
	public Barco() {
		super();
	}

	public Barco(double km, String color, int numSerie, String descripcion, String flota) {
		super(km, color, numSerie, descripcion);
		this.flota = flota;
	}

	
	// getters and setters
	public String getFlota() {
		return flota;
	}

	public void setFlota(String flota) {
		this.flota = flota;
	}

	// to string
	@Override
	public String toString() {
		return "Barco [flota=" + flota + ", Km=" + getKm()
		+ ", color=" + getColor() + ", número de serie=" + getNumSerie() + ", descripcion="
		+ getDescripcion() + "]";
	}
	
	
	public static void crearBarcosFicticios() {
		Barco b1= new Barco(2000, "Gris", 30, "Agua", "Flota española");
		Vehiculo.getListaVehiculos().add(b1);
		Barco b2= new Barco(1500, "Gris", 31, "Agua", "Flota americana");
		Vehiculo.getListaVehiculos().add(b2);
		Barco b3= new Barco(3000.60, "Gris", 32, "Agua", "Flota italiana");
		Vehiculo.getListaVehiculos().add(b3);
	}
	
	public static void crearBarco(double km, String color, int numSerie,String descripcion) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca la flota a la que pertenece el barco: ");
		String flota= sc.nextLine();
		
		Barco b= new Barco(km, color, numSerie, descripcion, flota);
		Vehiculo.getListaVehiculos().add(b);
		
	}
	
	
}
