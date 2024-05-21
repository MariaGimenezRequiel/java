 package u6.tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupoMusical {
	// nombreGrupo (String), componentes (Array de musicos), web (String), Año Creación (int).
	
	private String nombre;
	private ArrayList<Musico> componentes;
	private String web;
	private int anyoCreacion;
	
	private static ArrayList<GrupoMusical> misGruposMusicales = new ArrayList<>();
	
		
	public GrupoMusical() {
		
	}
	
	public GrupoMusical(String nombre) {
		this.nombre = nombre;
	}

	public GrupoMusical(String nombre, ArrayList<Musico> componentes, String web, int anyoCreacion) {
		
		this.nombre = nombre;
		this.componentes = componentes;
		this.web = web;
		this.anyoCreacion = anyoCreacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Musico> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Musico> componentes) {
		this.componentes = componentes;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getAnyoCreacion() {
		return anyoCreacion;
	}
	public void setAnyoCreacion(int anyoCreacion) {
		this.anyoCreacion = anyoCreacion;
	}
	

	public static ArrayList<GrupoMusical> getMisGruposMusicales() {
		return misGruposMusicales;
	}

	public static void setMisGruposMusicales(ArrayList<GrupoMusical> misGruposMusicales) {
		GrupoMusical.misGruposMusicales = misGruposMusicales;
	}

	@Override
	public String toString() {
		return "GrupoMusical [nombre=" + nombre + ", componentes=" + componentes + ", web=" + web + ", anyoCreacion="
				+ anyoCreacion + "]";
	}
	
	
	public static GrupoMusical crearGrupoMusical() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del grupo: ");
		String nombre = sc.nextLine();
		/// recoger todos los datos....
		//// RECOGER LOS DATOS POR TECLADO Y CREAR UN GRUPO CON DATOS
		GrupoMusical grupo = new GrupoMusical(nombre);
		
		return grupo;
	} 
	
	
}
