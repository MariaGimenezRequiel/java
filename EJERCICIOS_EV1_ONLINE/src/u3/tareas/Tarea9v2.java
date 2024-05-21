package u3.tareas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Tarea9v2 {

		/*
		 * Solicitar una frase y crear un menú:
		 * 
		 * 1) Muestre la longitud de la frase. 2) Muestre la frase en mayúsculas. 3)
		 * Muestre el número de palabras que contiene la frase. 4) Salir.
		 * 
		 * Añadirle las opciones:
		 * 
		 * 5) Mostrar la primera y última palabra de la frase. 6) Mostrar el número de
		 * veces que aparece la letra "a". 7) Solicitar una palabra y decir si dicha
		 * palabra está contenida en la frase o no.
		 */
		public static void main(String[] args) {
					
				//creamos los lectores
			    Scanner sc= new Scanner(System.in);
			    Scanner numero= new Scanner(System.in);
			    int opcion=0;
			    boolean respuesta;
			    String frase;
			   
			    // solicitar mensaje y leer
			    
			   System.out.println( "Introduzca una frase: ");
			   frase= sc.nextLine();
			    
			    // Crear texto de menú
			    String txtmenu = "_______________\n\n MENÚ\n 1) Longitu de la frase\n 2) Frase en mayúsculas \n 3) Número de palabras de la frase \n 4) Salir de la aplicación \n 5) Mostrar la primera y última palabra de la frase \n 6)Mostrar el número de veces que aparece la letra \"a\" \n 7) Introduzca una palabra y compruebe si está contenida en la frase \n 8)Cambiar la frase.";
			    System.out.println(txtmenu);
			    
			    // Leemos el resultado de la selección con el escaner para números enteros
			    do {
			    	do {
			    	 System.out.println("Introduzca el número de la opción elegida:");
			    	   
				  respuesta= numero.hasNextInt();
			    	
				   if (respuesta==false) {
					   
					   System.out.println("El valor introducido es incorrecto. Por favor, vuelva a intentarlo.");
					   numero.next();
				   }
				   else {
				   opcion= numero.nextInt();
					    if (opcion==8) {
					    	 System.out.println("Introduzca la nueva frase: ");
					    	 String frase2= sc.nextLine().trim();
					    	 frase=frase2;
					    	 System.out.println(txtmenu);
					    	}else {
				   //Creamos el menú con estructura case dentro del bucle para poder pedir distintas opciones
					   switch (opcion) {
					   
					   case 1:
						 int numcara= frase.trim().length();
						 System.out.println("Longitud de la frase:  "+ numcara);
						
						break;
					   case 2:
						   String mayus= frase.toUpperCase();
						   System.out.println("Frase en mayúsculas: "+ mayus);
							
							break;
					   case 3:
						int posicion;  
						int contador=0;
						String txt= frase.trim();  // Hola esto es una prueba //el .trim limpia los espacios por delante y detrás de la cadena
						while (txt.indexOf(" ") !=-1) {  //indexof da un valor entero con la posicion del espacio // -1=a la ultima posicion
							 posicion= txt.indexOf(" ");	 
							 contador++;  // incremento el contador porque cuando encuentro un espacio es porque he encontrado una palabra
							 txt=txt.substring(posicion+1).trim();// esto es una prueba //tengo que sumarle uno porque si no me qedaría en el espacio entre las dos primeras palabras //trim otra vez para limpiar espacios por si el usuario ha metido más de un espacio entre palabra y palabra
						 };
						 
						System.out.println("Número de palabras: "+(contador+1)); //le sumo uno porque cuando llega al -1 o posiciion final ya no entra al bucle y no le suma 1 al contador
						
							break;
					   case 4:
						   System.out.println("Salimos de la aplicación.");
							break;
					   case 5:
						   int posicion3;  
							int contador3=0;
							String txt3= frase.trim();  // Hola esto es una prueba //el .trim limpia los espacios por delante y detrás de la cadena
							while (txt3.indexOf(" ") !=-1) {  //indexof da un valor entero con la posicion del espacio // -1=a la ultima posicion
								 posicion= txt3.indexOf(" ");	 
								 contador3++;  // incremento el contador porque cuando encuentro un espacio es porque he encontrado una palabra
								 txt3=txt3.substring(posicion+1).trim();// esto es una prueba //tengo que sumarle uno porque si no me qedaría en el espacio entre las dos primeras palabras //trim otra vez para limpiar espacios por si el usuario ha metido más de un espacio entre palabra y palabra
							 };
							 int numpalabras=contador3+1;
						   if(numpalabras>1) {
								  String txt1=frase;
									int pos1= txt1.indexOf(" ");  //Busca el primer espacio en la cadena de texto
									String primera= txt1.substring(0, pos1); // en este substring marcarmos el rango en el que se divide
									
									int pos2=txt1.lastIndexOf(" "); //Busca el ultimo espacio en la cadena de texto
									String ultima=txt1.substring(pos2); // en este substring es de la posicion que marcamos hasta el final
									System.out.println("La primera y la última palabra de la frase son: "+ primera+ " y "+ultima+ " respectivamente.");
							  }else if (numpalabras==1) {
								   System.out.println("La frase introducida solo tiene una palabra, por lo que la primera y última palabra de la frase coinciden y es: "+ frase.toUpperCase());
							  }
							   	
								break;	
						
					   case 6:
							
						   int contadora=0;
						   frase=frase.toLowerCase();
						   for(int i=0;i<frase.length();i++) {
							 if(frase.charAt(i)=='a') {
								contadora++;
							 } 
						   }
					   		System.out.println("La letra \"a\"aparece "+contadora+" veces.");
					   
							break;
					   case 7:
						   String frase2=frase.toUpperCase().trim();
						   System.out.println("Introduzca una palabra para comprobar si está contenida en la frase:");
						   String respuesta2=sc.nextLine().toUpperCase().trim();
						   if (frase2.contains(respuesta2)) {
							   System.out.println("La palabra SÍ está contenida en la frase");
						   }else {
							   System.out.println("La palabra NO está contenida en la frase");
						   }
						  
						  
							break;
					default:
							System.out.println("El valor introducido no existe para el menú.");
						break;
					}
				   }
				   }
			    	}while (respuesta==false||opcion==8);
			   } while(opcion!=4);	

	}

}
