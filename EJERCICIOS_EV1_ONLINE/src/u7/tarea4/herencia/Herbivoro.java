package u7.tarea4.herencia;

public class Herbivoro extends Animales {

	private String plantasFavoritas;

	public Herbivoro() {
		super();
	}

	public Herbivoro(String nombre, int edad, String especie, boolean tienePatas, String habitat,
			String plantasFavoritas) {
		super(nombre, edad, especie, tienePatas, habitat);
		this.plantasFavoritas = plantasFavoritas;
	}

	public String getPlantasFavoritas() {
		return plantasFavoritas;
	}

	public void setPlantasFavoritas(String plantasFavoritas) {
		this.plantasFavoritas = plantasFavoritas;
	}

	
	@Override
	public String toString() {
		return "Herbivoro [plantasFavoritas=" + plantasFavoritas + ", TienePatas=" + isTienePatas()
				+ ", Habitat=" + getHabitat() + ", Nombre=" + getNombre() + ", Edad=" + getEdad()
				+ ", Especie()=" + getEspecie() + "]";
	}

	@Override
	public void mostrarAlimentacion() {
		System.out.println("Algunos herbívoros comen sólo hierba, otros consumen hojas, corteza, savia, "
				+ "raíces, semillas, frutos, flores, néctar o polen.");
	}
	
	public static void crearDatosFicticios () {
		Herbivoro h1= new Herbivoro("Cuello largo",8 , "Jirafa", true, "Sabana", "acacia");
		SeresVivos.getListaSeresVivos().add(h1);
		
	}
	public static void crearHerbivoro(String nombre,int edad, String especie,boolean tienePatas, String habitat) {
		String plantaFavorita= ControlErrores.obtenerLetras("Introduzca el nombre de la planta favorita del animal: ", "^[a-zA-ZáéíóúñÑÁÉÍÓÚ\s]+$", "Error! El nombre introducido no es válido");
		Herbivoro h=new Herbivoro(nombre, edad, especie, tienePatas, habitat, plantaFavorita);
		SeresVivos.getListaSeresVivos().add(h);
		System.out.println("El herbívoro ha sido creado con éxito.");
	}
	
}
