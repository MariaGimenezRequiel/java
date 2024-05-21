package u5.tareas;

/**
 * @author MARIA REQUIEL
 *
 */
public class Musico {
/*	CREAR CLASE GRUPO MUSICAL con los atributos:

		nombreGrupo (String), componentes (Array de musicos), web (String), AnyoCreacion (int).

		CREAR LA CLASE MUSICO con los atributos:

		nombre (string), edad (int) y puesto (string).

		crear los constructores necesarios de ambas clases.

		crearse 2 grupos musicales con sus correspondientes componentes.*/
	
	// music atributes
	private String nombre;
	private int edad;
	private String puesto;
	
	// constructors
	public Musico () {
		
	}
	public Musico (String nombre) {
		this.nombre=nombre;
	}
	public Musico(String nombre, int edad, String puesto) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.puesto = puesto;
	}
	
	// Getters and setters methods
	
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
	// Generate to string method
	
	public String toString() {
		
		return "Musico [nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + "]";
	}
	
	public static Musico crearMusico(int dato) {
		String nombre= PrincipalGrupoMusical.pedirletras("Introduzca el nombre del músico: ", "[A-Za-zñÑáéíóúÁÉÍÓÚ\s]+", "Error, no ha introducido un nombre válido.");
		
		int edad= PrincipalGrupoMusical.pedirNumeroCondicion("Introduzca la edad del múscio: ", dato<=0, "Error!! Debe introducir un número entero mayor que 0");
	
		// me da un error cuando meto esta condicion supongo que habrá que declarar algo con la variable, cómo lo hago?¿
		String puesto= PrincipalGrupoMusical.pedirletras("Introduzca el puesto del artista en el grupo","^[a-zA-Z]+(?: [a-zA-Z]+)*$", "Error, no ha introducido un nombre válido de puesto.");
		Musico m= new Musico(nombre, edad, puesto);
		return m;
	}
	
	
	
	
	
	
}
