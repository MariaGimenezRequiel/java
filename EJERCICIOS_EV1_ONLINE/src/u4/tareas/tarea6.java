package u4.tareas;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tarea6 {
	/*
	 * Crear un ArrayList agenda que contenga en cada una de sus posiciones un array
	 * de dos elementos donde el primer elemento será el nombre y el segundo será el
	 * teléfono.
	 * 
	 * String[] persona = new String[2]; // [nombre][telefono]
	 * 
	 * ArrayList<String[]> agenda = new ArrayList<>();
	 * 
	 * Crear un menú que nos permita:
	 * 
	 * 1) Insertar contactos (personas) en la agenda.
	 * 
	 * 2) Buscar un contacto por nombre en la agenda.
	 * 
	 * 3) Eliminar contacto de la agenda.
	 * 
	 * 4) Mostrar todos los contactos de la agenda.
	 * 
	 * 5) Salir.
	 */
	public static void main(String[] args) {
		 
		 ArrayList<String[]> agenda = new ArrayList<>();
		 int opcion=0;
		 boolean correcto=true;
		 String nombre="";
		 String numerotelefono="";
		 Scanner numero=new Scanner(System.in);
		 Scanner sc=new Scanner(System.in);
		 String menu= "----------------------MENÚ----------------------\n"+"1) Insertar contactos (personas) en la agenda.\n"
		 		
		 		+ "2) Buscar un contacto por nombre en la agenda.\n"
		 		
		 		+ "3) Eliminar contacto de la agenda.\n"
		 		
		 		+ "4) Mostrar todos los contactos de la agenda.\n"
		 		
		 		+ "5) Salir.";
		 
		 System.out.println(menu);
		
		 do {
			 do {
				try {
					System.out.println("Seleccione una opción del menú: ");
					opcion= numero.nextInt();
					correcto=true;
				}catch(InputMismatchException e) {
					System.err.println("Error!! Introduzca un número entero.");
					correcto=false;
					numero.next();
				}
			 }while(!correcto);
			 
		switch (opcion) {
			case 1:
				/*
				 * String[] persona = new String[2]; // [nombre][telefono]
				 * System.out.println("Introduzca el nombre del contacto: "); persona
				 * [0]=sc.nextLine();
				 * System.out.println("Introduzca el número de teléfono del contacto: ");
				 * persona [1]=sc.nextLine();
				 * 
				 * agenda.add(persona);
				 */
				
			do {	
					System.out.println("Introduzca el nombre del contacto: ");
					nombre =sc.nextLine();
					correcto=true;
					if(!nombre.matches("[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+")) {
						System.err.println("Error!! El nombre introducido no es válido.");
		            	correcto=false;
					}
			}while(!correcto);
			
			do {
					System.out.println("Introduzca el número de teléfono del contacto: ");
					numerotelefono =sc.nextLine();
					correcto=true;
					if(!numerotelefono.matches("[0-9]{9}")) {
						System.err.println("Error!! El número de teléfono introducido no es válido.");
		            	correcto=false;
					}
			}while(!correcto);
				String [] persona = {nombre,numerotelefono};
				agenda.add(persona);
				break;
			case 2:
				System.out.println("Introduzca el nombre que quiere buscar: ");
				String nombrebuscar=sc.nextLine();
				boolean encontrado= false;
			
				for (String []contacto : agenda) {
					if(contacto[0].equalsIgnoreCase(nombrebuscar)) {
						System.out.println(contacto[0]+" - Teléfono: "+contacto[1]);
						encontrado=true;
					}
				}
				if(!encontrado) {
					System.out.println("En la lista de contactos no existe el nombre "+nombrebuscar);
				}
				break;
			case 3:
				System.out.println("Introduzca el nombre del contacto que quiere borrar: ");
				String nombreborrar=sc.nextLine();
				boolean encontrado2= false;
			
				for (String []contacto : agenda) {
					if(contacto[0].equalsIgnoreCase(nombreborrar)) {
						System.out.println(contacto[0]+" - Teléfono: "+contacto[1]+" ----> Ha sido borrado.");
						agenda.remove(contacto);
						encontrado2=true;
						break; //importante
					}
				}
				if(!encontrado2) {
					System.out.println("En la lista de contactos no existe el contacto "+nombreborrar);
				}	
				break;
			case 4:
				for(String []contacto:agenda) {
					System.out.println(contacto[0]+" - Teléfono: "+contacto[1]);
				}	
				
				/*
				 * for(int i=0; i<agenda.size();i++) { for(int j=0;j<agenda.get(i).length;j++) {
				 * System.out.print(agenda.get(i)[j]); } System.out.println(" \n"); }
				 */	
				
				break;
			case 5:
					System.out.println("Salimos de la aplicación!!");
				break;
				// lo mismo que el case 4 pero con un for normal
			case 6:
				for(int i=0; i<agenda.size();i++) {
					System.out.println(agenda.get(i)[0]+" - Teléfono: "+agenda.get(i)[1]);
				}
			break;
				
			default:
				System.err.println("Error! La opción escogida no está dentro del menú.");
				break;
			}
			 	
		 }while(opcion!=5);
		 
	}

}
