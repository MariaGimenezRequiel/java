package u3.tareas;

import java.text.Normalizer;
import java.util.Scanner;

public class Repaso5 {
	// Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
	 public static String cleanString(String texto) {
	        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
	        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	        return texto;
	        }
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String dia= "";
		boolean correcto= true;
		
		do {
					System.out.println("Introduzca un día de la semana: ");
					dia=sc.nextLine().toUpperCase();
					dia=cleanString(dia);;//clase para quitar acentos
					
						switch (dia) {
						case "LUNES":
							System.out.println("Lunes es un día laboral");
							correcto=true;
							break;
						case "MARTES":
							System.out.println("Martes es un día laboral");
							correcto=true;
							break;
						case "MIERCOLES":
							System.out.println("Miércoles es un día laboral");
							correcto=true;
							break;
						case "JUEVES":
							System.out.println("Jueves es un día laboral");
							correcto=true;
							break;
						case "VIERNES":
							System.out.println("Viernes es un día laboral");
							correcto=true;
							break;
						case "SABADO":
							System.out.println("Sábado es un día no laboral");
							correcto=true;
							break;
						case "DOMINGO":
							System.out.println("Domingo es un día no laboral");
							correcto=true;
							break;
						default:
							System.err.println("ERROR.NO HA INTRODUCIDO UN DÍA DE LA SEMANA");
							correcto=false;
							break;
						}
		}while(!correcto);	
		System.out.println("Fin");
	}

}
