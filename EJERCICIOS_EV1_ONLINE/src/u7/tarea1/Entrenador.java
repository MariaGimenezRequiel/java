package u7.tarea1;

public class Entrenador extends SeleccionFutbol{
	// attribute
	private String idFederation;

	// constructors
	public Entrenador(String idFederation) {
		super();
		this.idFederation = idFederation;
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederation) {
		super(id, nombre, apellidos, edad);
		this.idFederation = idFederation;
	}
	// getters and setters
	public String getIdFederation() {
		return idFederation;
	}

	public void setIdFederation(String idFederation) {
		this.idFederation = idFederation;
	} 
	
	// to string
	@Override
	public String toString() {
		return "Entrenador [idFederación=" + idFederation + "- Id=" + getId()
				+ "- Nombre=" + getNombre() + "- Apellidos=" + getApellidos() + "- Edad=" + getEdad()
				+ "]";
	}
	
	// specific methods
	public void dirigirPartido() {
		System.out.println("Dirirgir Partido.");
		
	}
	
	public void dirigirEntrenamiento() {
		System.out.println("Dirigir Entrenamiento.");
		
	}

}
