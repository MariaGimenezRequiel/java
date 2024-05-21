package u7.tarea2.herencia;

public class Coche extends Vehiculo {
	// attributes
	private int numeroPuertas;
	private int cilindrada;
	
	//constructors
	public Coche() {
		super();
	}

	public Coche(double km, String color, int numSerie, String descripcion, int numeroPuertas, int cilindrada) {
		super(km, color, numSerie, descripcion);
		this.numeroPuertas = numeroPuertas;
		this.cilindrada = cilindrada;
	}

	// getters and setters
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", cilindrada=" + cilindrada + ", Km=" + getKm()
				+ ", color=" + getColor() + ", número de serie=" + getNumSerie() + ", descripcion="
				+ getDescripcion() + "]";
	}
	
	public static void crearCochesFicticios() {
		Coche c1= new Coche(800, "Negro", 6, "Tierra", 5, 900);
		 Vehiculo.getListaVehiculos().add(c1);
		Coche c2= new Coche(450, "Blanco", 10, "Tierra", 5, 900);
		Vehiculo.getListaVehiculos().add(c2);
		Coche c3= new Coche(1000, "Rojo", 14, "Tierra", 3, 800);
		Vehiculo.getListaVehiculos().add(c3);
		
	}
	
	public static void mostrarCoches() {
		boolean encontrado= false;
		for (Vehiculo v : Vehiculo.getListaVehiculos()) {
			if(v instanceof Coche) {
				System.out.println(v.toString());
				encontrado=true;
			}
			
		}
		if(!encontrado) {
			System.out.println("Actualmente, no hay coches guardados en la lista de vehículos.");
		}
	}
	
	public static void crearCoches(double km, String color, int numSerie,String descripcion) {
		int puertas=ControlErrores.obtenerNumero("Introduzca el número de puertas de su coche.", "Error! Debe introducir un número entero.");
		int cilandrada=ControlErrores.obtenerNumero("Introduzca la cilindrada de su coche.", "Error! Debe introducir un número entero.");
		Coche c = new Coche(km, color, numSerie, descripcion, puertas, cilandrada);
		Vehiculo.getListaVehiculos().add(c);
		
		
	}	
	
}
