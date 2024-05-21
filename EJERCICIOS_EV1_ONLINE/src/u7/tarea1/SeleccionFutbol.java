package u7.tarea1;

/*

Crear las clases SeleccionFutbol, Futbolista, Entrenador y Masajista con los atributos
 y métodos que se indican en el ejemplo.

** Los métodos simplemente deberán pintar por pantalla un mensaje indicando 
*la acción "Entrenar", "Jugar Partido", .... o lo que sea*/
public class SeleccionFutbol {

	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	//constructors, getters and setters 
	

	public SeleccionFutbol() {
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "SeleccionFutbol [id=" + id + "- nombre=" + nombre + "- apellidos=" + apellidos + "- edad=" + edad + "]";
	}
	
	
	// generic methods
	
	public void concentrarse () {
		System.out.println("Concentrarse");
	}
	
	public void viajar() {
		System.out.println("Viajar");
		
	}

	
	
	
	
	
	
}
