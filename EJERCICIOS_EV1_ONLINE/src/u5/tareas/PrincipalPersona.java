/**
 * 
 */
package u5.tareas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MARIA REQUIEL
 *
 */
public class PrincipalPersona {
	/*
	 * Crear una clase Principal donde se solicitarán los datos de 5 personas y se
	 * irán insertando en un array "listaPersonas".
	 * 
	 * Por último, recorrer el array creado anteriormente e id mostrando el nombre y
	 * edad de todas las personas del array.
	 */
	
	// los siguientes métodos están en la clase principal porque son genéricos
	public static int obtenerNumero (String msg, String msgerror) {
		 Scanner numero= new Scanner(System.in);
		 int dato=0;
		 boolean correcto=true;
		do {
				try {
					System.out.println(msg);
					dato= numero.nextInt();
					correcto=true;
				
				}catch(InputMismatchException e) {
					System.err.println(msgerror);
					correcto=false;
					numero.next();
				}
			 }while(!correcto);
		return dato;
		}
	public static double obtenerDecimal (String msg, String msgerror) {
		 Scanner numero= new Scanner(System.in);
		 double dato=0;
		 boolean correcto=true;
		do {
				try {
					System.out.println(msg);
					dato= numero.nextDouble();
					correcto=true;
				}catch(InputMismatchException e) {
					System.err.println(msgerror);
					correcto=false;
					numero.next();
				}
			 }while(!correcto);
		return dato;
	}
	public static String obtenerLetras (String msg,String expresion, String msgerror) {
		Scanner sc= new Scanner(System.in);
		String dato="";
		 boolean correcto=true;
		do {	
			System.out.println(msg);
			dato =sc.nextLine();
			correcto=true;
			if(!dato.matches(expresion)) {
				System.err.println(msgerror);
            	correcto=false;
			}
	}while(!correcto);
		return dato;
	}
	
	
	
	public static void main(String[] args) {
		
	
		ArrayList<Persona> personas = new ArrayList<Persona>();
		for (int i = 0; i < 5 ; i++) {
	         
	        	Persona p= Persona.solicitarDatos();
	        	
	        	personas.add(p);
	        }
		for(int i=0;i<personas.size();i++) { 
			System.out.println(i+1+". "+personas.get(i)); 
			
			Persona p= personas.get(i);
			
			boolean mayorEdad=p.esMayorDeEdad();
        	if(mayorEdad) {
        		System.out.println("Es mayor de edad. Su edad es: "+p.getEdad());
        	}else {
        		System.out.println("Es menor de edad. Su edad es: "+p.getEdad());
        	}
        	
        	String comprobarSex = p.comprobarSexo();
        	System.out.println(comprobarSex);
			}
        	
        }
		
	}


