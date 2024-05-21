package u3.tareas;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Escriba su estación favorita del año:");
		String estacion= sc.nextLine().toLowerCase();
		
		switch (estacion) {
		case "verano":
			System.out.println("Esta es la mejor estación para irse a la playa y ponerse moreno.");
			break;
		case "invierno":
			System.out.println("Esta es la mejor estación para quedarse en casa y ver una película.");
			break;
		case "primavera":
			System.out.println("Esta es la mejor estación para hacer turismo, hace buen tiempo y temperaturas que nos son excesivamente altas");
			break;
		case "otoño":
			System.out.println( "Si vives en Murcia, no sabes lo que es el otoño, pero puedes disfrutar de las otras tres estaciones en un solo día");
			break;
		default:
			System.out.println("La estación introducida es incorrecta");
			break;
		}
		System.out.println("FIN");
	}

}
