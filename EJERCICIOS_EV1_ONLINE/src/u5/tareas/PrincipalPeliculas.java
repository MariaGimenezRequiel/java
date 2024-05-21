package u5.tareas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalPeliculas {

	public static void main(String[] args) {
		int numeroPeliculas=0;
		
		ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		String msgNumero="Introduzca el número de películas que desea introducir: ";
		String msgError="Error. Introduzca un valor entero y mayor que cero";
		
		do {
		 numeroPeliculas= PrincipalPersona.obtenerNumero(msgNumero, msgError);
		 	if(numeroPeliculas<=0) {
		 		System.out.println("Error. Introduzca un número mayor que 0. ");
		 	}
		}while (numeroPeliculas<=0);
		// extraigo el método obtenerNumero de otra clase
		
		
		
		for(int i=0; i<numeroPeliculas;i++) {
		Peliculas p= Peliculas.crearPelicula();
		listaPeliculas.add(p);
		}
		for(int i=0;i< listaPeliculas.size();i++) {
			System.out.println( i+1+". "+ listaPeliculas.get(i).toString());
		}

	}

}
