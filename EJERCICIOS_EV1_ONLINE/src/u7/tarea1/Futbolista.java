package u7.tarea1;

public class Futbolista extends SeleccionFutbol {

	// attributes
	private int dorsal;
	private String demarcacion;
	
	// constructors
	public Futbolista() {
		super();
	}


	public Futbolista(int dorsal, String demarcacion) {
		super();
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}


	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// getters and setters
	public int getDorsal() {
		return dorsal;
	}


	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}


	public String getDemarcacion() {
		return demarcacion;
	}


	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// to string
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + "- demarcacion=" + demarcacion + "- Id=" + getId()
				+ "- Nombre=" + getNombre() + "- Apellidos=" + getApellidos() + "- Edad=" + getEdad()
				+ "]";
	}
	// specific methods
	public void jugarPartido() {
		System.out.println("Jugar partido.");
		
	}
	
	
	public void entrenar() {
		System.out.println("Entrenar.");
		
	}
	
	
	
}
