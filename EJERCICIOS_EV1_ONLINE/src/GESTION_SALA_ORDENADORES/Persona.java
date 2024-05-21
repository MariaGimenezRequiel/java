package GESTION_SALA_ORDENADORES;

/**
 * @author MARIA REQUIEL
 *
 */
public class Persona {
	// Una persona tiene un DNI y un nombre.
	private String dni;
	private String nombre;
	
	// constructores
	public Persona() {
		
	}
	
	// getters and setters
	public Persona(String dni, String nombre) {
	
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// to string method
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
