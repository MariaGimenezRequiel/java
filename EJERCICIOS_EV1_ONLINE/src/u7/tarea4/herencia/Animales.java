package u7.tarea4.herencia;

public class Animales extends SeresVivos{

	private boolean tienePatas;
	private String habitat;
	
	
	
	public Animales() {
		super();
	}


	public Animales(String nombre, int edad, String especie, boolean tienePatas, String habitat) {
		super(nombre, edad, especie);
		this.tienePatas = tienePatas;
		this.habitat = habitat;
	}




	public boolean isTienePatas() {
		return tienePatas;
	}


	public void setTienePatas(boolean tienePatas) {
		this.tienePatas = tienePatas;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	
	




	@Override
	public String toString() {
		return "Animal [tienePatas=" + tienePatas + ", habitat=" + habitat + super.toString() + "]";
	}


	@Override
	public void mostrarAlimentacion() {
		System.out.println("Los animales son seres heterótrofos, lo que quiere decir que necesitan"
				+ " alimentarse de materia orgánica ya elaborada (alimento), producida por los seres autótrofos."
				+ " Al tener que tomar sustancias orgánicas ya elaboradas, los animales deben \"hacerlas suyas\", "
				+ "es decir incorporarlas a su organismo para poder utilizarlas.");
	}
	public static void crearDatosFicticios () {
		Animales a1= new Animales("Lulu", 15, "caballo", true, "cuadras");
		SeresVivos.getListaSeresVivos().add(a1);
		
	}
	public static void crearAnimal(String nombre,int edad, String especie, int respuesta) {
		boolean tienePatas= ControlErrores.obtenerBoolean("¿Tiene patas?Sí o no:");
		String habitat= ControlErrores.obtenerLetras("Hábitat del animal: ", "^[a-zA-ZáéíóúñÑÁÉÍÓÚ\s]+$", "Error! El nombre introducido no es válido");
		if(respuesta==2) {
			Carnivoro.crearCarnivoro(nombre, edad, especie, tienePatas, habitat);
		}else if(respuesta==3) {
			Herbivoro.crearHerbivoro(nombre, edad, especie, tienePatas, habitat);
		}else {
			Animales a=new Animales(nombre, edad, especie, tienePatas, habitat);
			SeresVivos.getListaSeresVivos().add(a);
			System.out.println("El animal ha sido creado con éxito.");
		}
	}
}
