package GESTION_SALA_ORDENADORES;


import java.util.ArrayList;

/**
 * @author MARIA REQUIEL
 *
 */
public class Puesto {
	/*
	 * cada puesto tiene las siguientes características: código de pc de tipo
	 * String, reservado de tipo booleano y persona de tipo persona que es por quien
	 * está reservado.
	 */
	// atributos
	private String codigo;
	private boolean reservado;
	private Persona usuario;
	
	private static ArrayList<Puesto>listaPc= new ArrayList<>();
	
	// constructores
	public Puesto () {
		
	}
	
	public Puesto(String codigo) {
		
		this.codigo = codigo;
	}


	public Puesto(String codigo, boolean reservado, Persona persona) {
		
		this.codigo = codigo;
		this.reservado = reservado;
		this.usuario = persona;
	}
	


	// getters and setters
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo() {
		return codigo;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Persona getUsuario() {
		return usuario;
	}

	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

	public static ArrayList<Puesto> getListaPc() {
		return listaPc;
	}

	public static void setListaPc(ArrayList<Puesto> listaPc) {
		Puesto.listaPc = listaPc;
	}

	public String toString() {
		return "Puesto [codigo=" + codigo + ", reservado=" + reservado + ", usuario=" + usuario + "]";
	}
	

	
	
	
}
