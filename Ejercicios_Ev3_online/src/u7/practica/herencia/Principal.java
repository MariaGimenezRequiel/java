package u7.practica.herencia;

import u8.practica.ProductoVideoclub;

/**
 * @author MARIA REQUIEL
 *
 */
public class Principal {
	/*
	 * Crear un menú con las siguientes opciones: 
	 * 1. Añadir recursos automáticamente.
	 * Se crearán varios recursos de ejemplo y se añadirán a la lista de recursos.
	 * Sólo se pueden añadir una vez a la lista.
	 * 
	 *  2. Añadir un nuevo recurso. Se debe
	 * escoger el tipo de recurso que se desea crear y solicitar los datos
	 * necesarios para crear dicho recurso. Independientemente del recurso que sea,
	 * se debe guardar en una lista de recursos. 
	 * 
	 * 3. Mostrar recursos. Solicitar el tipo
	 * de recursos que se quiere mostrar (películas, juegos o música) y dependiendo
	 * lo que indique el usuario mostrar todos los recursos de ese tipo con toda la
	 * información bien formateada. 
	 * 
	 * 4. Dar de baja un recurso. Que solicite el código
	 * del recurso que se desea eliminar y borre de la lista el recurso indicado.
	 * 
	 * 5. Alquilar un recurso. Se preguntará el recurso que se quiere alquilar y se
	 * restará 1 al número de ejemplares de dicho recurso. Controlar el número de
	 * ejemplares debe ser mayor de 0 para poder alquilar. 
	 * 
	 * 6. Devolver un recurso. Se preguntará el recurso que se quiere devolver y se sumará 1 al número de
	 * ejemplares de dicho recurso.
	 * 
	 *  7. Salir.
	 *  
	 *
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		final String txtmenu="Seleccione una opción: "
				+ "\n1) Añadir recursos automáticamente."
				+ "\n2) Añadir nuevo recurso."
				+ "\n3) Mostrar recursos."
				+ "\n4) Dar de baja un recurso."
				+ "\n5) Alquilar recurso."
				+ "\n6) Devolver un recurso."
				+ "\n7) Salir.";
		
		final String txtmenu2="Seleccione el tipo de producto:"
				+ "\nA - Película"
				+ "\nB - Música"
				+ "\nC - Videojuego"
				+ "\nD - Otro";
		final String errorNum="Error! Debe introducir un número entero.";
		final String errorLetra= "Error! Debe introducir una letra de las que se especifican en el menú.";
		int opcion = 0;
		boolean introducidos=false;
		do {
		opcion=Validaciones.obtenerNumero(txtmenu, errorNum);
		switch (opcion) {
		case 1://cargar recursos ficticios una sola vez
			if(introducidos==false){
				ProductoVideoclub.crearProductoFicticio();
				introducidos=true;
				System.out.println("Valores introducidos correctamente.");
			}else {
				System.err.println("Error! Los valores fueron introducidos anteriormente.");	
			}
			
			break;
		case 2: // introducir recursos según el tipo de producto
			String opcion2=Validaciones.obtenerLetras(txtmenu2, "[A-Da-d]", errorLetra);
			int codigoInt= Validaciones.obtenerNumero("Introduzca el código del recurso que desea introducir: ", errorNum);
			
			ProductoVideoclub.crearProducto(codigoInt, opcion2);
			break;
		case 3: //mostrar productos
			String opcion3=Validaciones.obtenerLetras(txtmenu2, "[A-Da-d]", errorLetra);	
			ProductoVideoclub.mostrarProductos(opcion3);
			break;
		case 4:
			// eliminar un recuros "remove"
			int codigo= Validaciones.obtenerNumero("Introduzca el código del recurso que desea eliminar: ", errorNum);
			ProductoVideoclub.darBaja(codigo);
			break;
		case 5:
			// alquilar un recurso "setNumEjemplares"
			int codigoAlq= Validaciones.obtenerNumero("Introduzca el código del recurso que desea alquilar: ", errorNum);
			ProductoVideoclub.darBaja(codigoAlq);
			break;
		case 6:
			// Devolver un recurso."setNumEjemplares"
			int codigoDev= Validaciones.obtenerNumero("Introduzca el código del recurso que desea devolver: ", errorNum);
			ProductoVideoclub.devolver(codigoDev);
			break;
		case 7:
			System.out.println("Salimos de la aplicación.");
			break;

		default:
			System.err.println("Error! La opción escogida no está dentro del menú.");
			break;
		}
		
		}while(opcion!=7);

	}

}
