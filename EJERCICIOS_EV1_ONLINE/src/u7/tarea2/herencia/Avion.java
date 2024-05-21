package u7.tarea2.herencia;

public class Avion extends Vehiculo{
	
	private int numAsientos;

	
	// constructors
	public Avion() {
		super();
	}
	
	public Avion(double km, String color, int numSerie, String descripcion, int numAsientos) {
		super(km, color, numSerie, descripcion);
		this.numAsientos = numAsientos;
	}

	// getters and setters
	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	// to string

	@Override
	public String toString() {
		return "Avion [numAsientos=" + numAsientos + ", Km=" + getKm()
		+ ", color=" + getColor() + ", número de serie=" + getNumSerie() + ", descripcion="
		+ getDescripcion() + "]";
	}
	
	
	public static void crearAvionesFicticios() {
		Avion a1= new Avion(1500, "Blanco", 65, "Aire", 400);
		 Vehiculo.getListaVehiculos().add(a1);
		 Avion a2= new Avion(1000, "Blanco", 66, "Aire", 500);
		Vehiculo.getListaVehiculos().add(a2);
		Avion a3= new Avion(2000, "Blanco", 67, "Aire", 600);
		Vehiculo.getListaVehiculos().add(a3);
	}
	
	public static void crearAvion(double km, String color, int numSerie,String descripcion) {
		int numAsientos=ControlErrores.obtenerNumero("Introduzca el número de asientos del avión.", "Error! Debe introducir un número entero.");
		Avion a= new Avion(km, color, numSerie, descripcion, numAsientos);
		Vehiculo.getListaVehiculos().add(a);
		
		
	}
	

}
