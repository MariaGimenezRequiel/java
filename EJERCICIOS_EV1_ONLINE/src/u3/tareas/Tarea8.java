package u3.tareas;

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que tenga una constante declarada con el valor de una
		 * contraseña.
		 * 
		 * El programa tendrá que solicitar por teclado al usuario que introduzca la
		 * contraseña pero que cada vez que falles, te reste un intento.
		 * 
		 * Tienes un máximo de 3 intentos.
		 ** 
		 * Si introduces la contraseña correcta muestra un mensaje
		 * "Bienvenido, su contraseña introducida es correcta".
		 ** 
		 * Si introduces la contraseña mal 3 veces que muestre un mensaje indicando que
		 * se han acabado los intentos y no puede acceder.
		 */
		final String password= "Consuelo65";
		
		Scanner sc= new Scanner(System.in);
		String respuesta;
		 int i=3;
			
			       System.out.println("Introduzca contraseña: ");
			       respuesta=sc.nextLine();
			     
			 do {   
			       if (!(password.equals(respuesta))) {
			    	  
			    		  i--;
			    		   if (i==0) {
			    			   System.out.println("Contraseña incorrecta. Se agotaron el número de intentos y no puede acceder.");
			    		   }else {
			    			
			    				  System.out.println("Contraseña incorrecta. Le quedan "+ i+  " intentos. Introduzcala de nuevo:");
					    		   respuesta=sc.nextLine();  	  
			    		   }
			    		  
			    	   }else {
			    		   System.out.println("Bienvenido, su contraseña introducida es correcta.");
			    		   break;
			    	   }
			   }while(i>0) ;
		System.out.println("FIN");
	}

}
