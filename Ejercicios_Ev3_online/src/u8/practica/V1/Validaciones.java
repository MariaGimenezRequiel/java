package u8.practica;

import javax.swing.JOptionPane;

public class Validaciones {
	public static boolean validarEntero(String valor, String campo) {
		try {
			Integer.parseInt(valor);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error! Debe introducir un número entero en el campo " + campo,
					"Error!!", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

}
