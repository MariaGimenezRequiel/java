package gestion.viajes;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	// atributos
	private String nombre;
	private String dni;
	private String telefono;
	
	private static ArrayList<Cliente>misClientes=new ArrayList<>();
	
	// constructores

	public Cliente() {
	
	}
	
	
	public Cliente(String dni) {
		this.dni = dni;
	}


	public Cliente(String nombre, String dni, String telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}


	
	// getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}


	public static void setMisClientes(ArrayList<Cliente> misClientes) {
		Cliente.misClientes = misClientes;
	}
	// to string method
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}
	
	
	public static void crearClientesFicticios() {
		
		Cliente c1= new Cliente("Pepe", "78945612L", "668921369");
		misClientes.add(c1);
		Cliente c2= new Cliente("María", "92945572P", "668921555");
		misClientes.add(c2);
		Cliente c3= new Cliente("Javier", "33345692L", "668921269");
		misClientes.add(c3);
		
		Cliente c4= new Cliente("Lucia", "68945689K", "668928869");
		misClientes.add(c4);
		Cliente c5= new Cliente("Victoria", "56945572M", "667721555");
		misClientes.add(c5);
		Cliente c6= new Cliente("Isa", "23328692O", "668996269");
		misClientes.add(c6);
		
		
		Cliente c7= new Cliente("Jaime", "68945635G", "668933369");
		misClientes.add(c7);
		Cliente c8= new Cliente("Victor", "65945572H", "667561555");
		misClientes.add(c8);
		Cliente c9= new Cliente("Óscar", "42328692L", "665556269");
		misClientes.add(c9);
		Cliente c10= new Cliente("Alfonso", "57728692U", "665556583");
		misClientes.add(c10);
	}
	
	public static Cliente crearCliente() {
		Scanner sc =new Scanner (System.in);
		
		
		String nombre=Validaciones.obtenerLetras("Introduzca el nombre del cliente: ", "^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]+$", "El formato del nombre no es correcto.");
		
		String dni= Validaciones.obtenerLetras("Introduzca el DNI: ", "^[0-9]{8}[A-Za-z]$", "Error! El formato de DNI no es válido.");
		
		
		String telefono= Validaciones.obtenerLetras("Introduzca el número de teléfono: ", "^[679]{1}[0-9]{8}$", "El formato del número de teléfono no es correcto. ");
		
		Cliente c= new Cliente(nombre, dni, telefono);
		misClientes.add(c);
		return c;
	}


	
	
	
	
}
