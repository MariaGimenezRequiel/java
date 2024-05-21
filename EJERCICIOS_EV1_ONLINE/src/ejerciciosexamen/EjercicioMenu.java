package ejerciciosexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioMenu{
	/**
	 * @author Mar�a Gim�nez Requiel 49169385P
	 *
	 *Crear una clase �EjercicioMenu.java� con su m�todo main.
Comenzar declarando las siguientes variables y constantes:
a) Variable �numero� de tipo entero inicializada a 122.
b)Variable �saludo� de tipo String inicializada con el valor <<Hola Mundo>>.
c) Variable �precio� de tipo float con el valor 35,14.
d)Variable �letraA� de tipo char con el valor A.
e) Constante �dolar� de tipo char con el valor del dolar << $ >>.
f) Constante �mensaje_salida� de tipo String con el valor <<El programa ha finalizado. Hasta la pr�xima>>.
Crear un men�:
1) Mostrar variables. (Que muestre por consola el nombre y valor de todas las variables declaradas arriba)
2) Mostrar constantes. (Que muestre por consola el nombre y valor de las constantes declaradas arriba).
3) Crear PrecioEntero. (Casting) Crear una variable de tipo entero que llamaremos �PrecioEntero� y le
asignaremos el valor de la variable de tipo float �Precio� declarada arriba (c). Mostrar el resultado al
convertir una variable de tipo float a una de tipo entero (puede haber p�rdida de precisi�n).
4) Crear letra. (Casting) Crear una variable de tipo char que llamaremos �letra� y le vamos a asignar el valor de
la variable �numero� declarada arriba (a). Mostrar el resultado al convertir una variable de tipo int a una de
tipo char.
5) Salir. ( Mostrar� el valor de la constante �mensaje_salida� declarada arriba y finalizar� el programa)
Crear la l�gica necesaria para que el men� se ejecute hasta que el usuario seleccione la opci�n 5 (salir)
	 */
	public static void main(String[] args) {

		int numero= 122;
		String saludo= "Hola Mundo";
		float precio= 35.14f;
		char letraA= 'A';
		final char DOLAR= '$';
		final String MENSAJE_SALIDA= "<<El programa ha finalizado. Hasta la pr�xima.>>";
		Scanner sc= new Scanner (System.in); 
		boolean correcto= true;
		int opcion=0;
		String menu= "1) Mostrar variables.\n" + 
				"2) Mostrar constantes.\n" + 
				"3)Precio Entero\n" + 
				"4) Crear letra\n"+
		
				"5) Salir.";
		System.out.println("MEN�______________ \n"+ menu );
		do {
		do{
		try {
		System.out.println("Escriba el n�mero de la opci�n escogida:");
		opcion= sc.nextInt();
		correcto=true;
		}catch(InputMismatchException e){
			System.out.println("Error: introduzca un n�mero entero");
			correcto= false;
			sc.next();
		}
		} while(!correcto);
		
		switch (opcion) {
		case 1:
			System.out.println("VARIABLES:"+"\nNumero ="+numero+"\nSaludo= "+saludo+"\nPrecio= "+precio+"\nLetraA= "+letraA);
			correcto=true;
			break;
		case 2:
			System.out.println("CONSTANTES:"+"\nDolar= "+DOLAR+"\nMensaje salida= "+ MENSAJE_SALIDA);
			correcto=true;
			break;
		case 3:
			int precioentero = (int) (precio); 
			System.out.println("Precio entero= "+precioentero);
			correcto=true;
			break;
		case 4:
			char letra= (char) (numero);
			System.out.println("Casting Char= "+letra);
			correcto=true;
			break;
		case 5:
			System.out.println(MENSAJE_SALIDA);
			correcto=true;
			break;
		default:
			System.out.println("La opci�n escogida no est� dentro del men�. Por favor, vuelva a intentarlo.");
			break;
		}
		}while(opcion!=5);
		
	}

}
