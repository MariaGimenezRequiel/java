package u5.tareas;

import java.util.ArrayList;

public class Peliculas2 {
	private String titulo;
	private Director director;
	private int anyo;
	// Al meterle static no es un atributo propio de pelicula, pero no es generico ES UNA VARIABLE A NIVEL DE CLASE
	private static ArrayList <Peliculas2> misPeliculas=new ArrayList<>(); // static porque cada pelicula es única
	// si lo declaro a nivel de clase puedo acceder desde otras clases
	// como es private necesito los metodos get y set para acceder a él
	// pero es statico y no necesito un objeto
	public Peliculas2 () {
		this.titulo= "Sin especificar";
	}
	public Peliculas2(String titulo, Director director, int anyo) {
		
		this.titulo = titulo;
		this.director = director;
		this.anyo = anyo;
	}
public Peliculas2(String titulo) {
		
		this.titulo = titulo;
			
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public static ArrayList<Peliculas2> getMisPeliculas() {
		return misPeliculas;
	}
	public static void setMisPeliculas(ArrayList<Peliculas2> misPeliculas) {
		Peliculas2.misPeliculas = misPeliculas;
	}
	@Override
	public String toString() {
		return "Peliculas2 [titulo=" + titulo + ", director=" + director + ", anyo=" + anyo + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
