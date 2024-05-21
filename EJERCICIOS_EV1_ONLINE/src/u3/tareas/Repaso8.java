package u3.tareas;


import java.util.Scanner;

public class Repaso8 {
	/*
	 * Pide por teclado dos números y genera 10 números aleatorios entre esos
	 * números. Usa el método Math.random para generar un número entero aleatorio
	 * (recuerda el casting de double a int).
	 */
	public static void main(String[] args) {
		int numero1=0;
		int numero2=0;
		boolean correcto=true;
		Scanner numero= new Scanner(System.in);
		 do {
			 try {
			 System.out.println("Introduzca un número: ");
			numero1= numero.nextInt();
			correcto= true;
			
			 }catch(Exception f) {
				 System.err.println("Error!! Vuelva a intentarlo");
				 numero.next();
				 correcto=false;
			 }
		 }while(!correcto);
		
		
		 do {
			 try {
			 System.out.println("Introduzca un segundo número: ");
			numero2= numero.nextInt();
			correcto= true;
			
			 }catch(Exception f) {
				 System.err.println("Error!! Vuelva a intentarlo");
				 numero.next();
				 correcto=false;
			 }
		 }while(!correcto);
		
		
		if(numero1>numero2) {
			System.out.println("10 números aleatorios entre: "+numero2+" y "+numero1+" :");
			for(int i=0;i<10;i++) {
			double aleatorio=Math.random();
			double x = (numero1*aleatorio-numero2*aleatorio); // sacar valor aleatorio double
			int entero= (int)x; // pasarlo a int con el casting
			System.out.println(entero);
			}
		}else{
			System.out.println("10 números aleatorios entre: "+numero1+" y "+numero2+" :");
			for(int i=0;i<10;i++) {
			double aleatorio=Math.random();
			double x = (numero2*aleatorio-numero1*aleatorio); // sacar valor aleatorio double
			int entero= (int)x; // pasarlo a int con el casting
			System.out.println(entero);
			}
		}
	}

}
