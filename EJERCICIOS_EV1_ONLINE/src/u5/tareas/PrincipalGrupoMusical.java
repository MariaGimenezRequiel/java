package u5.tareas;

import java.util.Scanner;

/**
 * @author MARIA REQUIEL
 *
 */
public class PrincipalGrupoMusical {
	// crearse 2 grupos musicales con sus correspondientes componentes.
	
	public static String pedirletras(String msg,String expresion,String error) {
		Scanner sc=new Scanner(System.in);
		String dato="";
		boolean correcto=true;
		do {
		System.out.println(msg);
		dato=sc.nextLine();
			if (dato.matches(expresion)) {
				System.err.println(error);
				correcto=false;
				sc.next();
			}else {
				correcto=true;
				
			}
		}while(!correcto);
		return dato;
	}
	
	public static int pedirNumeroCondicion(String msg,boolean condicion,String error) { // pongo una condicion por si quiero controlar algo más en el control de errores
		Scanner scNum=new Scanner(System.in);
		int dato=0;
		boolean correcto=true;
		do {
			try {
				System.out.println(msg);
				dato=scNum.nextInt();
					if (condicion) {
						System.err.println(error);
						correcto=false;
						scNum.next();
					}else {
						correcto=true;
						
					}
			}catch (Exception e) {
				System.err.println(error);
				correcto=false;
			}
		}while(!correcto);
		return dato;
	}
	
	public static void main(String[] args) {
	
		for(int i=0; i<2; i++) {
			GrupoMusical m= GrupoMusical.crearGrupo(int dato);
			
		}

	}

}
