package u7.tarea4.herencia;

public class Carnivoro extends Animales{
	private int numPresasPordia;
	private boolean tieneColmillos;
	
	
	public Carnivoro() {
		super();
	}

	public Carnivoro(String nombre, int edad, String especie, boolean tienePatas, String habitat, int numPresasPordia,
			boolean tieneColmillos) {
		super(nombre, edad, especie, tienePatas, habitat);
		this.numPresasPordia = numPresasPordia;
		this.tieneColmillos = tieneColmillos;
	}

	
	public int getNumPresasPordia() {
		return numPresasPordia;
	}

	public void setNumPresasPordia(int numPresasPordia) {
		this.numPresasPordia = numPresasPordia;
	}

	public boolean isTieneColmillos() {
		return tieneColmillos;
	}

	public void setTieneColmillos(boolean tieneColmillos) {
		this.tieneColmillos = tieneColmillos;
	}

	
	

	@Override
	public String toString() {
		return "Carnivoro [numPresasPordia=" + numPresasPordia + ", tieneColmillos=" + tieneColmillos
				+ ", TienePatas()=" + isTienePatas() + ", Habitat=" + getHabitat() + ", Nombre="
				+ getNombre() + ", Edad=" + getEdad() + ", Especie=" + getEspecie() + "]";
	}

	@Override
	public void mostrarAlimentacion() {
		System.out.println("Los animales carnívoros, también conocidos como zoófagos, "
				+ "son los que se alimentan mayormente del tejido orgánico de otros animales, "
				+ "incluyendo su carne, órganos y huesos");
	}
	
	
	
	public static void crearDatosFicticios () {
		Carnivoro c1= new Carnivoro("Mufasa", 5, "León", true, "Sabana", 1, true);	
		SeresVivos.getListaSeresVivos().add(c1);
		
	}
	public static void crearCarnivoro(String nombre, int edad,String especie,boolean tienePatas, String habitat) {
		int numeroPresas= ControlErrores.obtenerNumer("Introduzca el número de presas por día: ", 0, 400, "Error. Introduzca un número entero.");
		boolean tieneColmillos= ControlErrores.obtenerBoolean("¿Tiene colmillos? Responda sí o no:");
		Carnivoro c=new Carnivoro(nombre, edad, especie, tienePatas, habitat, numeroPresas, tieneColmillos);
		SeresVivos.getListaSeresVivos().add(c);
		System.out.println("El carnívoro ha sido creado con éxito.");
		
	}


}
