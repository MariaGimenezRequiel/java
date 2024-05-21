package u8.ejemplos1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana1 { //tenemos una clase ventana

	// constructor de la ventana, en la que solo le paso el título por parametro
	// el resto de los componenentes los creo dentro del constructor (panel, marco,dimensiones)
	public Ventana1(String titulo) {
		JFrame jf= new JFrame(titulo); // creo un objeto marco
		JPanel jp= new JPanel();  // creo un objeto panel
		
		jf.setContentPane(jp); // relaciono ambos objetos con el metodo content	
		jf.setSize(300, 200); // le doy un tamaño a la ventana
		
		jf.setLocationRelativeTo(null); //así la ventana sale centrada, de lo contrario se posiciona en (0,0) es decir, esquina superior izquierda
		jf.setVisible(true);// importante para que se visualice, si no se ejecuta el código pero no se visualiza 
	}
	
	
	public static void main(String[] args) {
		// me creo tantas ventanas como quiera con la clase ventana 1
	
		Ventana1 v= new Ventana1("Título 1");
		Ventana1 v2= new Ventana1("Título2");
	}

}
