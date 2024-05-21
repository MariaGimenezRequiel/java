package u8.tarea5;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Validaciones {
	
	

	public static boolean palbras(String txt, String expresion, String campo) {	
		boolean correcto= true;
		String msgError= "Error! El "+campo+ " introducido no tiene el formato adecuado.";
		
			if(txt.matches(expresion)) {
				correcto=true;
			}else {
				JOptionPane.showMessageDialog(null, msgError, "Error "+campo, JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}

		return correcto;
		
	}
	public static boolean validarNum(String txt,String campo,int min, int max) {
		int num=0;
		boolean correcto= true;
		String msgError= "Error! Debe introducir un número entero en el campo "+campo;
		String msgError2="Error en el campo "+campo+"! Debe introducir valores entre los números: "+min+" y "+max+".";
		
			try {
				num= Integer.parseInt(txt);
				correcto=true;
				if(num<min || num>max) {
					JOptionPane.showMessageDialog(null, msgError2,"Error "+campo,JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, msgError,"Error "+campo,JOptionPane.ERROR_MESSAGE);
				
				correcto=false;
				
			}
		
		return correcto;
		
	}
}
