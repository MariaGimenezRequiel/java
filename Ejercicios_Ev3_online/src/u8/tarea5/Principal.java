package u8.tarea5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
/**
 * Crear la clse Pelicula con titulo, director, anyo. Implementando la interfaz serializable
 * crear un menu que;
 * - Cree pelicula(inserte pelicula en un array)ç
 * -Descargue en un fichero las peliculas cargadas en el arraylist
 * -cargue de fichero las peliculas almacenadas en el fichero y muestre sus títulos.
 * -Salga del programa.
 * 
 */
	  
	public static void main(String[] args) {
		// creamos el fichero
		 ObjectOutputStream fichero= crearFichero("C:/MisPeliculas.dat");
		
		int opcion=0;
		String menu= "-------------Menú-------------\n"+
				"1) Crear película.\n"+
				"2) Descargar peliculas del arrayList en el fichero.\n"+
				"3)	Mostrar los títulos de las películas.\n"
				+ "4) Salir del programa.";

		System.out.println(menu);
		
		do {
		opcion= Validaciones.numeroEntero("Seleccione una de las opciones del menú.");
		
		switch (opcion) {
		case 1:
			Pelicula.crearPelicula();
			break;
		case 2:
				boolean guardado= guardarEnFichero(fichero);
				if(guardado) {
					System.out.println("Datos guardados correctamente.");
					Pelicula.getMiLista().clear(); //limpio la lista para volver a utilizarla
				}else {
					System.out.println("No se han podido guardar los datos en el ficher.");
				}
				
			break;
		case 3:
			ArrayList<Pelicula>listaLeer= leerFichero("C:/MisPeliculas.dat");
			if(!listaLeer.isEmpty()) {
				System.out.println("----Peliculas----");
				for (Pelicula p : listaLeer) {
					System.out.println(p.toString());
				}
			}else {
				System.out.println("La lista está vacía.");
			}
			break;
		case 4:
			System.out.println("Salimos de la aplicación.");
			// cerrarmos el fichero cuando acaba la aplicación
			try {
				fichero.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			break;
		default:
			System.err.println("La opción seleccionada no está dentro del menú.");
			break;
		}
		
		}while(opcion!=4);
		
		
		
		
		
		
	}

	public static ObjectOutputStream crearFichero(String nombre) {
		FileOutputStream ficheroSalida= null;
		ObjectOutputStream objetoSalida= null;
		try {
			ficheroSalida= new FileOutputStream(nombre); // creamos el fichero
			objetoSalida= new ObjectOutputStream(ficheroSalida); // convertimos el fichero para crear un objeto, que será con el que trabajemos
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return objetoSalida;
	}
	
	public static boolean guardarEnFichero(ObjectOutputStream fichero) {//introducimos el objeto de salida que habiamos creado
		boolean guardado= false;// con esto controlamos si se ha producido alguna excepcion, para saber si se ha guardado
		try {
			for (Pelicula p : Pelicula.getMiLista()) {
				fichero.writeObject(p); // por cada objeto pelicula escribo en el fichero con el metodo writeObject
			}
			guardado= true; 
			// fichero.close(); no cerramos hasta no acabar con la aplicacion, en la opcion 4
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			guardado= false;
		}catch(IOException e) {
			e.printStackTrace();
			guardado= false;
		}catch(Exception e) {
			e.printStackTrace();
			guardado= false;
		}
		return guardado;
	}
	
	
public static ArrayList<Pelicula> leerFichero(String nombreFichero) {
		
		ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
		ObjectInputStream objetoEntrada = null;
		
		try {
			FileInputStream ficheroEntrada = new FileInputStream(nombreFichero);//creo fichero
			objetoEntrada = new ObjectInputStream(ficheroEntrada);// creo un objeto inputstring porque es de entrada y no de salida
			
			while (true) { //va leyendo objetos y el objeto que lee lo va añadiendo a la lista
				Pelicula p = (Pelicula)objetoEntrada.readObject(); //casting para convertir los objetos en peliculas
				listaPeliculas.add(p);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("NO existe el fichero que quiere leer.");
		} catch (IOException e) { //esta excepcion se produce cuando ya no encuentre objetos para leer
			System.out.println("Fin lectura fichero...");
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (objetoEntrada != null) {
					objetoEntrada.close(); // una vez leido el fichero lo cierro
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return listaPeliculas;// me devuelve una lista
		
	}
	
	
	
}
