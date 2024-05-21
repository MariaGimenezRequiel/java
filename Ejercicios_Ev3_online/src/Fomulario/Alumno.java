package Fomulario;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private String comunidad;
	private char sexo;
	
	private static ArrayList<Alumno>lista= new ArrayList();

	
	public Alumno() {
	
	}


	public Alumno(String nombre, String apellidos, int edad, String comunidad, char sexo) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.comunidad = comunidad;
		this.sexo = sexo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getComunidad() {
		return comunidad;
	}


	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public static ArrayList<Alumno> getLista() {
		return lista;
	}


	public static void setLista(ArrayList<Alumno> lista) {
		Alumno.lista = lista;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", comunidad=" + comunidad
				+ ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
}
