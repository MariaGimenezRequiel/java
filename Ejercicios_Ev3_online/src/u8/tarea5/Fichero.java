package u8.tarea5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fichero {
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
			JOptionPane.showInternalMessageDialog(null, "NO existe el fichero que quiere leer.","Operación cancelada",JOptionPane.ERROR_MESSAGE);
			System.err.println("NO existe el fichero que quiere leer.");
		} catch (IOException e) { //esta excepcion se produce cuando ya no encuentre objetos para leer
			
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
