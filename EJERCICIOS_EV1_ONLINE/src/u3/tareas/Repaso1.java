package u3.tareas;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso1 {
	// 1) Declara dos variables numéricas y recoge un valor por teclado para cada una de ellas. 
			//Muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división) de dichas variables.

	public static void main(String[] args) {
	double numero1=0;
	double numero2=0;
	boolean error=true;
	
	Scanner numero= new Scanner(System.in);
			do {
				try {
					System.out.println("Introduzca un número: ");
					numero1= numero.nextDouble();
					error=true;
				}catch (InputMismatchException e) {
					System.out.println("Error: no ha introducido un valor numérico. Por favor vuelva a intentaro:");
					numero.next();
					error=false;
				}
			}while(!error);
			
			do {
				try {
					System.out.println("Introduzca un segundo número: ");
					numero2= numero.nextDouble();
					error=true;
				}catch (InputMismatchException e) {
					System.out.println("Error: no ha introducido un valor numérico. Por favor vuelva a intentaro.");
					numero.next();
					error=false;
				}
			}while(!error);
			
		
			double suma= numero1 + numero2;
			double resta=numero1-numero2;
			double multiplicacion= numero1 * numero2;
			double division= numero1/numero2;
			int resto= (int) (numero1%numero2); // casting
	
			 
			 DecimalFormat df = new DecimalFormat("#.00"); // redondear el decimal a las centésimas
			 System.out.println(numero1+ " + "+ numero2+ " = "+df.format(suma));
			 System.out.println( numero1+ " - "+ numero2 +" = "+ df.format(resta));
			 System.out.println( numero1+" X "+numero2+" = "+ df.format(multiplicacion));
			 System.out.println(numero1+" : "+numero2+" = "+ df.format(division)+"\n Resto= "+resto);
			
			
				
	

	}
	}


