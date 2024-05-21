package u4.tareas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nombresarray {
	/*
	 * Crear una aplicación que solicite 5 nombres y los guarde en un array.
	 * 
	 * Una vez insertados todos los nombres vamos a crearnos un menú:
	 * 
	 * Insertar otro nombre al array 
	 * Borrar un elemento del array indicando la
	 * posición del elemento a borrar.
	 *  Borrar un elemento del array indicando el
	 * elemento a borrar. 
	 * Mostrar los elementos del array. 
	 * Salir. 
	 * Control de
	 * errores: Si no existe el elemento que se quiere borrar o la posición del
	 * elemento que se quiere borrar no es correcta mostrar mensaje indicándolo.
	 */
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>(); // Declara el arraylist de nombres para no tener que reservar memoria y poder añadir mas nombres sin límite
	     Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer los nombres
	     Scanner numero=new Scanner(System.in);
	     String nombre="";
	     String menu="1. Insertar otro nombre al array. \r\n"
	     		+ "2. Borrar un elemento del array indicando la posición del elemento a borrar.\r\n"
	     		+ "3. Borrar un elemento del array indicando el elemento a borrar.\r\n"
	     		+ "4. Mostrar los elementos del array.\r\n"
	     		+ "5. Salir";
	     int numeronombres=0;
	     int opcionmenu=0;
	     int opcionindice=0;
	     boolean correcto=true;
	     String nombreborrar="";
	     
	        // Solicita los nombres
	        for (int i = 0; i < 5; i++) {
	         
	        	System.out.print("Ingresa el nombre " + (i + 1) + ": ");
	            nombre = sc.nextLine().toUpperCase();
	            if(nombre.matches("[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+")){  // creo una expresión regular para hacer un control de errores recogiendo el string
	            	nombres.add(nombre);
	            	
	            	
	            }else {
	            	System.err.println("Error! El nombre introducido no es válido. ");
	            	i--;
	            	
	            }
	          
	        }
	        System.out.println("-------------------------------------------------------\n"+menu);
	        do {
	        	do {
			        try {
				        System.out.println("Seleccione la opción deseada del siguiente menú:");
				        opcionmenu=numero.nextInt();
				        correcto=true;
			        }catch(InputMismatchException e) {
			        	System.err.println("Error! Introduzca un número entero.");
			        	correcto=false;
			        	numero.next();
			        }
	        	}while(!correcto);
	        switch (opcionmenu) {
			case 1:
				   do {
				        System.out.print("Ingresa el nombre: ");
			            nombre = sc.nextLine();
				            if(nombre.matches("[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+")){  
				            	nombres.add(nombre);
				            	correcto=true;
				            }else {
				            	System.err.println("Error!! El nombre introducido no es válido.");
				            	correcto=false;
				            }
			        }while(!correcto);
				break;
			case 2:
				for(int i=0;i<nombres.size();i++) { 
					System.out.println(i+". "+nombres.get(i).toUpperCase()); 
					}
				do {
					try {
						 // control para comprobar que esta introduciendo alguno de los numeros del indice
							System.out.println("Indique la posición del elemento que desea borrar: \n");
							opcionindice=numero.nextInt();
							
							
						if(opcionindice >= 0 && opcionindice < nombres.size()){ 
							nombres.remove(opcionindice);
							correcto=true;	
						}else {
							System.err.println("Error! La posición escogida no existe.");
							correcto=false;	
							
						}
						
					}catch(InputMismatchException e) {
						System.err.println("Error! Introduzca un número entero.");
			        	correcto=false;
			        	numero.next();
					}
				}while(!correcto);
				
				
				System.out.println("La lista de nombres queda así: ");
				for(int i=0;i<nombres.size();i++) { 
					System.out.println(i+". "+nombres.get(i).toUpperCase()); 
					}
				break;
			case 3: // control para comprobar que esta introduciendo un string que coincide con alguno de los nombres
				
				for(int i=0;i<nombres.size();i++) { 
					System.out.println(i+". "+nombres.get(i).toUpperCase()); 
					}
				do {
				System.out.println("Escriba el nombre que desea borrar: \n");
				nombreborrar=sc.nextLine().toUpperCase();
					if(nombres.contains(nombreborrar)) {
						correcto=true;
						for(int i=0;i<nombres.size();i++) {
							if(nombreborrar.equalsIgnoreCase(nombres.get(i))) {
								nombres.remove(i);	
							}	
					}
					
					}else {
						System.out.println("Error! El nombre introducido no coincide con ninguno del arrayList.");
						correcto=false;
						
					}
				}while(!correcto);
				
				
				System.out.println("La lista de nombres queda así: ");
				for(int i=0;i<nombres.size();i++) { 
					System.out.println(i+". "+nombres.get(i).toUpperCase()); 
					}
				break;
			case 4:
				System.out.println("La lista de nombres queda así: ");
				for(int i=0;i<nombres.size();i++) { 
					System.out.println(i+". "+nombres.get(i).toUpperCase()); 
					}
				break;
			case 5:
				System.out.println("Salimos de la aplicación. FIN");
				break;
			default:
				break;
			}
	        }while(opcionmenu!=5);
	     
	        


	}

}
