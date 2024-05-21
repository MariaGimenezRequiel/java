package u7.tarea1;

public class Masajista extends SeleccionFutbol {
	//attributes
	private String titulation;
	private int experienceYears;
	
	// constructors
	
	public Masajista(String titulation, int experienceYears) {
		super();
		this.titulation = titulation;
		this.experienceYears = experienceYears;
	}



	public Masajista(int id, String nombre, String apellidos, int edad, String titulation, int experienceYears) {
		super(id, nombre, apellidos, edad);
		this.titulation = titulation;
		this.experienceYears = experienceYears;
	}


	// getters and setters
	public String getTitulation() {
		return titulation;
	}



	public void setTitulation(String titulation) {
		this.titulation = titulation;
	}



	public int getYear() {
		return experienceYears;
	}



	public void setYear(int year) {
		this.experienceYears = year;
	}


	// to string
	@Override
	public String toString() {
		return "Masajista [titulación=" + titulation + "- año=" + experienceYears + "- Id=" + getId()
		+ "- Nombre=" + getNombre() + "- Apellidos=" + getApellidos() + "- Edad=" + getEdad()
		+ "]";
	}
	
	@Override // very important
	public void concentrarse () {
	// overwrite the method that is already in the main class
		System.out.println("Concentración del masajista");
	}
	// specific method
	public void darMasaje() {
		System.out.println("Dar masaje.");
		
	}
	

}
