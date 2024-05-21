package u4.tareas;



import java.util.Scanner;

public class Tareadniv1 {

	public static void main(String[] args) {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		String numero="";
		int numero1=0;
		String letra="";
		char letra2='d';
		boolean correcto=true;
		Scanner sc=new Scanner(System.in);

				//1º Recojo el número entero con control de errores y teniendo en cuenta el formato de 8 dígitos de 0-9
		
				do {
					System.out.println("Introduzca el número de su DNI: ");
					numero=sc.nextLine();
					//recojo como string y no como int para poder utilizar el método matches
		
					if(numero.matches("[0-9]{8}")) {
						//Paso el string a int con Integer.parseINt para poder dividir despues
						numero1=Integer.parseInt(numero);
						correcto=true;
					}else {
						System.err.println("Error!! Valor numérico de DNI incorrecto.");
						correcto=false;
					}
				}while(!correcto);
		
				//2º Recojo la letra con control de errores
		
				do {
					//recojo con string
					System.out.println("Introduzca la letra de su DNI");
					letra=sc.nextLine().toUpperCase();
					//compruebo con el método matches que cumple el formato que quiero
					if(letra.matches("[A-Z]{1}")) {
						//convierto a char, sabiendo que solo tengo una letra
						letra2=letra.charAt(0);
						correcto=true;
					}else {
						System.err.println("Error!! Introduzca una letra:");
						correcto=false;
					}
				}while(!correcto);
		
				//3º compruebo que el dni es válido
				int posicion=numero1%23;
				if(letras[posicion]==letra2) {
					System.out.println("DNI válido");
				}else {
					System.err.println("DNI inválido");
				}

	}

}
