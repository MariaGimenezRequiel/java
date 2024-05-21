package u4.tareas;

import java.util.Scanner;

/*Leer valores por teclado y almacenarlos en un array (números enteros).
Mostrarlos por pantalla en el mismo orden en que fueron introducidos, y en orden inverso.*/
public class Arrayrecoger {

	public static int obtenernumero(String msg, String msgerror) {
		boolean correcto=true;
		Scanner numero= new Scanner(System.in);
		
		int dato=0;
		do {
			try {
				System.out.println(msg);
				dato=numero.nextInt();
				correcto=true;
			}catch(Exception e){
				System.out.println(msgerror);
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
	public static void main(String[] args) {
	Integer [] numeros= {};
		
	}

}
