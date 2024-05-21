package u3.tareas;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso2 {
	/*
	 * Lee un número por teclado que pida el precio de un producto (puede tener
	 * decimales) y calcule el precio final con IVA. El IVA será una constante que
	 * será del 21%. Mostrar el resultado del precio final con dos decimales.
	 */
	
	public static void main(String[] args) {
		 final double IVA = 0.21;
		 boolean correcto= true;
		 Scanner numero= new Scanner(System.in);
		 double precio=0;
		 DecimalFormat df = new DecimalFormat("#.00");
		 	
		 do {
					 try {
					 System.out.println("Introduzca el precio del producto deseado: ");
					precio= numero.nextDouble();
					correcto= true;
					 }catch(InputMismatchException e) {
						 System.out.println("Error!! INTRODUZCA UN VALOR NUMÉRICO"); 
						 numero.next();
						 correcto=false;
					 
					 }catch(Exception f) {
						 System.out.println("Error inesperado!! Vuelva a intentarlo");
						 numero.next();
						 correcto=false;
					 }
		 }while(!correcto);
		 
		 double ivaproducto= precio*IVA; 
		 double preciofinal= precio + ivaproducto;
		 System.out.println("EL precio final de este producto con el IVA es de :"+ df.format(preciofinal));
		 
		 }
	}


