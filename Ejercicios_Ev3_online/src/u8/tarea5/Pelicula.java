package u8.tarea5;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pelicula implements Serializable {
	public static String EXP_DIRECTOR="[A-Za-zÁÉÍÓÚÑáéíóúñ\s'-]+$";
	public static String EXP_TITULO="[A-Za-z0-9\s':!&.,-ÁÉÍÓÚÑáéíóúñ]+$";
	
	private String titulo;
	private String director;
	private int anyo;
	
	private static ArrayList <Pelicula> miLista= new ArrayList();
	
	public Pelicula() {

	}


	

	public Pelicula(String titulo, String director, int anyo) {
		
		this.titulo = titulo;
		this.director = director;
		this.anyo = anyo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public static ArrayList<Pelicula> getMiLista() {
		return miLista;
	}


	public static void setMiLista(ArrayList<Pelicula> miLista) {
		Pelicula.miLista = miLista;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", anyo=" + anyo + "]";
	}
	
	public static boolean validarDatosPelicula(String titulo, String director, String year) {
		boolean tituloCorrecto=Validaciones.palbras(titulo, EXP_TITULO, "título");
		boolean directorCorrecto= Validaciones.palbras(director, EXP_DIRECTOR, "director");
		boolean yearCorrecto=Validaciones.validarNum(year, "año", 1900, obtenerAnioActual());
			if(tituloCorrecto && directorCorrecto && yearCorrecto) {
				return true;
			}else {
				return false;
			}
		
	}
	public static int obtenerAnioActual() {
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        return anioActual;
    }
	
	
}
