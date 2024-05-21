package u7.tarea4.herencia;

import java.util.ArrayList;


public abstract class SeresVivos {

	private String nombre;
	private int edad;
	private String especie;
	
	private static ArrayList <SeresVivos>listaSeresVivos= new ArrayList <>();
	
	public SeresVivos() {
	
	}


	public SeresVivos(String nombre, int edad, String especie) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
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


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}
	

	public static ArrayList<SeresVivos> getListaSeresVivos() {
		return listaSeresVivos;
	}


	public static void setListaSeresVivos(ArrayList<SeresVivos> listaSeresVivos) {
		SeresVivos.listaSeresVivos = listaSeresVivos;
	}


	@Override
	public String toString() {
		return ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie;
	}
	
	public abstract void mostrarAlimentacion();
	
	public static void crearDatosFicticios() {
		Planta.crearDatosFicticios();
		Animales.crearDatosFicticios();
		Carnivoro.crearDatosFicticios();
		Herbivoro.crearDatosFicticios();
	}
	
	public static void mostrarSeresVivos() {
		System.out.println("--------PLANTAS--------");
		for (SeresVivos s1 : listaSeresVivos) {
			if(s1 instanceof Planta ) {
				System.out.println(s1.toString());
			}
		}
		System.out.println("--------ANIMALES CARNÍVOROS--------");
		for (SeresVivos s1 : listaSeresVivos) {
			if(s1 instanceof Carnivoro ) {
				System.out.println(s1.toString());
			}		
		}
		System.out.println("--------ANIMALES HERBÍVOROS--------");
		for (SeresVivos s1 : listaSeresVivos) {
			if(s1 instanceof Herbivoro ) {
				System.out.println(s1.toString());
			}		
		}
		System.out.println("--------RESTO DE ANIMALES--------");
		for (SeresVivos s1 : listaSeresVivos) {
			if(s1 instanceof Animales ) {
				if(!(s1 instanceof Carnivoro || s1 instanceof Herbivoro)) {
					System.out.println(s1.toString());
				}
			}		
		}
	}
	
	public static void crearSeresVivos(int respuesta) {
		String nombre=ControlErrores.obtenerLetras("Introduzca el nombre del ser vivo:", "^[a-zA-ZáéíóúñÑÁÉÍÓÚ\s]+$", "Error! El nombre introducido no es válido.");
		int edad=ControlErrores.obtenerNumer("Introduzca la edad del ser vivo:", 0, 300, "Error!La edad introducida no es adecuada.");
		String especie=ControlErrores.obtenerLetras("Introduzca la especie del ser vivo:", "^[a-zA-ZáéíóúñÑÁÉÍÓÚ\s]+$", "Error! La especie introducido no es válido.");
		if (respuesta==1) {
			Planta.crearPlanta(nombre, edad, especie);
		}else  {
			Animales.crearAnimal(nombre, edad, especie, respuesta);
		}
			
		}
		
	
	
}
