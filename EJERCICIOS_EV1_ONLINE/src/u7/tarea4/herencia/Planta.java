package u7.tarea4.herencia;

public class Planta extends SeresVivos{

	private String color;
	private boolean tieneFlores;
	
	
	
	public Planta() {
		super();
	}


	public Planta(String nombre, int edad, String especie, String color, boolean tieneFlores) {
		super(nombre, edad, especie);
		this.color = color;
		this.tieneFlores = tieneFlores;
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isTieneFlores() {
		return tieneFlores;
	}


	public void setTieneFlores(boolean tieneFlores) {
		this.tieneFlores = tieneFlores;
	}


	@Override
	public String toString() {
		return "Planta [color=" + color + ", tieneFlores=" + tieneFlores + super.toString() + "]";
	}


	@Override
	public void mostrarAlimentacion() {
		System.out.println("A diferencia de los animales,"
				+ " las plantas no toman alimentos del medio, "
				+ "sino que los fabrican ellas mismas. "
				+ "Para fabricar sus alimentos toman agua, sales minerales y dióxido de carbono. "
				+ "También necesitan la luz solar. Las plantas toman el agua del suelo por la raíz través de los pelos absorbentes.");
		
	}
	public static void crearDatosFicticios () {
		Planta p1= new Planta("Margarita", 2, "Flor", "lila", true);
		SeresVivos.getListaSeresVivos().add(p1);
	}
	
	public static void crearPlanta(String nombre, int edad, String especie) {
		String color=ControlErrores.obtenerLetras("Introduzca el color de la planta:", "^[a-zA-ZáéíóúñÑÁÉÍÓÚ\s]+$", "Error! El color introducido no es válido.");
		boolean tieneFlores= ControlErrores.obtenerBoolean("¿La planta tiene flores?. Conteste \"sí\" o \"no\".");
		Planta p=new Planta(nombre, edad, especie, color, tieneFlores);
		SeresVivos.getListaSeresVivos().add(p);
		System.out.println("La planta ha sido introducido con éxito.");
	}
}
