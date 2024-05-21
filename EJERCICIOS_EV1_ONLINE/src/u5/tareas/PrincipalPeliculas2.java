package u5.tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPeliculas2 {

	public static void main(String[] args) {
	String txt= new String("Hola");
	// ArrayList<Peliculas2> listaPeliculas= new ArrayList<>(); Ahora en lugar de declarar el array dentro del metodo main lo voy a hacer a nivel de clase
	String titulo="";
	String nombreDirector= "";
	String apellidoDirector="";
	int edadDirector=0;
	int anyo=0;
	/*
	 * Peliculas2 p1= new Peliculas2(); // hemos creadi un objeto pelicula con el
	 * constructor por defecto Peliculas2 p2= new
	 * Peliculas2("Lo que el viento se llevo", "Pepe", 1999); // creamos el objeto
	 * con el segundo constructor Peliculas2 p3=new
	 * Peliculas2("Lo que el viento se llevo");
	 * System.out.println(p1.getAnyo()+" - "+p1.getDirector()+" - "+p1.getTitulo());
	 */
	
	Scanner sc=new Scanner(System.in);
	Scanner scNum=new Scanner(System.in);
	
	System.out.println("Introduzca un número de peliculas: ");
	int numero= scNum.nextInt();
	for (int i=0; i<numero;i++) {
		System.out.println("Introduzca el título de la película: ");
		titulo=sc.nextLine();
		
		System.out.println("Introduzca el nombre del director de la película: ");
		nombreDirector= sc.nextLine();
		
		System.out.println("Introduzca el apellido del director de la película: ");
		apellidoDirector= sc.nextLine();
		System.out.println("Introduzca la edad del director de la película: ");
		edadDirector=scNum.nextInt();
		
		Director dir= new Director(nombreDirector, apellidoDirector, edadDirector);
		
		System.out.println("Introduzca el año de la película");
		anyo=scNum.nextInt();
		Peliculas2 p= new Peliculas2(titulo, dir, anyo);
		Peliculas2.getMisPeliculas().add(p);
		
		
	}
	for (int i=0; i<Peliculas2.getMisPeliculas().size();i++) {
		System.out.println(Peliculas2.getMisPeliculas().get(i).getTitulo()+" - "+Peliculas2.getMisPeliculas().get(i).getDirector().getNombre()+" - "+Peliculas2.getMisPeliculas().get(i).getDirector().getApellido()+" - "+Peliculas2.getMisPeliculas().get(i).getDirector().getEdad()+" - "+Peliculas2.getMisPeliculas().get(i).getAnyo());
	}
	
	for (int i=0; i<Peliculas2.getMisPeliculas().size();i++) {
		System.out.println(Peliculas2.getMisPeliculas().get(i).toString());
	}
	for (Peliculas2 p : Peliculas2.getMisPeliculas()) { //tipo de dato - objeto: nombre_array
		System.out.println(p.getTitulo()+" - "+p.getDirector().getNombre()+" - "+p.getDirector().getApellido()+" - "+p.getDirector().getEdad()+" - "+p.getAnyo());
	}
	for (Peliculas2 p : Peliculas2.getMisPeliculas()) { 
		System.out.println(p.toString());
	}
	}
	
	
	

}
