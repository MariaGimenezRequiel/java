package u8.tarea3;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class VentanasEmergentes {
	/*
	 * Crear un programa que muestre una ventana (JOptionPane) con un mensaje de
	 * confirmación (showConfirmDialog) y los botones de Sí y No. Si se selecciona
	 * Sí mostrar una ventana de dialogo de Input (showInputDialog) que recoja un
	 * valor. Si se selecciona que no mostrar una ventana de dialogo de mensaje
	 * (showMessageDialog) con el texto "De acuerdo".
	 ** 
	 * Mejora: Solicitar valores hasta que conteste NO.
	 */
	
	
	public static void main(String[] args) {
		int nombre2=0;
		do {
		nombre2= JOptionPane.showConfirmDialog(null, "Desea introducir su nombre?", "confirmación", JOptionPane.YES_NO_OPTION);
		System.out.println(nombre2);
		if(nombre2==0) {// sí
			String nombre= JOptionPane.showInputDialog("Escriba su nombre: ");
		}else {
		JOptionPane.showMessageDialog(null, "De acuerdo.");
			
		}
		}while(nombre2==0);
	}

}
