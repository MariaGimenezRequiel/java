package u3.tareas;

import java.util.Scanner;

public class Ejemploswitch {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
		
	System.out.println("Introduzca su horoscopo: ");
	String horoscopo= sc.nextLine();// sc.nextLine().toLowerCase(); en el caso de querer convertir a minusculas en el escaner
	
	switch (horoscopo.toLowerCase()) {  //En este caso solo lo aplico aqui y se convierte solo dentro de la estructura
	case "piscis":
		System.out.println("Es usted una buena persona pero triste"); // si no escribo break me ejecuta todo lo que viene después
		break;
	case "libra":
		System.out.println("Es usted una buena persona y feliz");
		break;
	default:
		System.out.println("Su horozcopo no ha sido encontrado");
		break;
	}
	System.out.println("Su horoscopo es " + horoscopo);
	}

}
