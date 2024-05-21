package u3.tareas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tarea9 {
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
	 * 
	 */
	
	public static void main(String[] args) {
				
			//creamos los lectores
		    Scanner sc= new Scanner(System.in);
		    Scanner numero= new Scanner(System.in);
		    int opcion=0;
		    boolean error= true;
		    String frase;
		  
		    // solicitar mensaje y leer
	 
		   System.out.println( "Introduzca una frase: ");
		   frase= sc.nextLine().trim();
		   
		    // Crear texto de menú
		    String txtmenu= "_______________\n\n MENÚ\n 1) Longitu de la frase\n 2) Frase en mayúsculas \n 3) Número de palabras de la frase \n 4) Salir de la aplicación \n 5) Mostrar la primera y última palabra de la frase \n 6)Mostrar el número de veces que aparece la letra \"a\" \n 7) Introduzca una palabra y compruebe si está contenida en la frase. \n 8)Cambiar la frase ";
		    System.out.println(txtmenu);
		    
		    // Leemos el resultado de la selección con el escaner para números enteros
		   do {
			   do {
					  try {   
					   System.out.println("Introduzca el número de la opción elegida:");
					   error= numero.hasNextInt();
					   opcion= numero.nextInt();
					  } catch (InputMismatchException e) {
						 System.out.println("Error no ha introducido un valor numérico. Por favor vuelva a intentarlo.");
						 numero.next();
					 }
			   }while (!error);
			   
			   if(opcion==8) {
				   System.out.println("Introduzca una nueva frase: ");
				   frase= sc.nextLine().trim();
				   String txtmenu2= "_______________\n\n MENÚ\n 1) Longitu de la frase\n 2) Frase en mayúsculas \n 3) Número de palabras de la frase \n 4) Salir de la aplicación \n 5) Mostrar la primera y última palabra de la frase \n 6)Mostrar el número de veces que aparece la letra \"a\" \n 7) Introduzca una palabra y compruebe si está contenida en la frase. \n 8)Cambiar la frase ";
				    System.out.println(txtmenu2);
				    do {
						  try {   
						   System.out.println("Introduzca el número de la opción elegida:");
						   error= numero.hasNextInt();
						   opcion= numero.nextInt();
						  } catch (InputMismatchException e) {
							 System.out.println("Error no ha introducido un valor numérico. Por favor vuelva a intentarlo.");
							 numero.next();
						 }
				   }while (!error);
			   }
			   //Creamos el menú con estructura case dentro del bucle para poder pedir distintas opciones
				   switch (opcion) {
				   
				   case 1:
					 int numcara= frase.length();
					  System.out.println("Longitud de la frase:  "+ numcara);
					
					break;
				   case 2:
					   String mayus= frase.toUpperCase();
					   System.out.println("Frase en mayúsculas: "+ mayus);
						
						break;
				   case 3:
					   StringTokenizer st = new StringTokenizer(frase);
					   System.out.println("Número de palabras que contiene la frase: "+ st.countTokens()); 
					   //StringTokenizer: Esta clase sirve para dividir un String en partes, según unos delimitadores. Uno de estos delimitadores
					   //es el espacio en blanco, por lo tanto podemos aplicar StringTokenizer al texto ya que las palabras en un texto están separadas por espacios en blanco. 
					   //El método countTokens() nos dirá cuantos elementos se han obtenido o lo que es lo mismo, cuantas palabras contiene el texto.
						
						break;
				   case 4:
					   System.out.println("Salimos de la aplicación.");
						break;
					
					 case 5:
						 StringTokenizer st1 = new StringTokenizer(frase);
						 int numeropalabras= st1.countTokens();
						 
						  if(numeropalabras>1) {
							  String txt1=frase;
								int pos1= txt1.indexOf(" ");  //Busca el primer espacio en la cadena de texto
								String primera= txt1.substring(0, pos1); // en este substring marcarmos el rango en el que se divide
								
								int pos2=txt1.lastIndexOf(" "); //Busca el ultimo espacio en la cadena de texto
								String ultima=txt1.substring(pos2); // en este substring es de la posicion que marcamos hasta el final
								System.out.println("La primera y la última palabra de la frase son: "+ primera+ " y "+ultima+ " respectivamente.");
						  }else if (numeropalabras==1) {
							   System.out.println("La frase introducida solo tiene una palabra, por lo que la primera y última palabra de la frase coinciden y es: "+ frase.toUpperCase());
						  }
						   	
							break;	
					
				  
				   case 6:
						  int posa; int contadora=0; String txta=frase.toLowerCase(); //lo paso todo a minúscula para buscar la a
						  
						  while(txta.indexOf("a")!=-1) { posa=txta.indexOf("a"); contadora ++; txta=
						  txta.substring(posa+1); }
						  System.out.println("La letra \"a\"aparece "+contadora+" veces.");
						 
						break;
				   case 7:
					
					   String frase2=frase.toUpperCase();
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
			   
			   		} while(opcion!=4);
		  
	}

}
