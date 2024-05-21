package u6.tarea1;

public class Musico {

	//nombre (string), edad (int) y puesto (string).
	private String nombre;
	private int edad;
	private String puesto;
	
	
	
	public Musico() {
		
	}
	
	public Musico(String nombre) {
		this.nombre = nombre;
	}
	
	public Musico(String nombre, int edad, String puesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Musico [nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + "]";
	}
	
	
	
}
