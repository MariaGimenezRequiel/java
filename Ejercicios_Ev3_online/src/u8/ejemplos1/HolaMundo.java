package u8.ejemplos1;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class HolaMundo extends JFrame{
	private JLabel etiqueta;

	public HolaMundo(String titulo,Color color) {
		super(titulo);
		
		JPanel pl =new JPanel(); //creo un panel
		// creamos la etiqueta y la añadimos
		etiqueta=new JLabel("Hola Mundo");
		pl.add(etiqueta);
		pl.setBackground(color); // dar un color
		pl.setLayout(new FlowLayout());// establecemos el esquema del lienzo
		this.setContentPane(pl);//relacionamos el panel con las configuraciones anteriores con el marco
		this.setSize(300, 200);
		/*
		 * El método setSize establece el tamaño del frame. Con este método podemos
		 * indicar el ancho y el alto (en pixeles) de la ventana. Otras otros métodos
		 * para indicar el tamaño de la ventana son:
		 *   pack(). Hace que la ventana coja el tamaño más pequeño posible que permita ver todos sus componentes.
		 *  setBounds (x,y,an,al). Con este método se puede establecer la posición de la
		 * ventana en la pantalla y su tamaño en pixeles.
		 */
		this.setLocationRelativeTo(null);//posicionamos ventana en el centro
		this.setVisible(true);// hacemos visible la ventana. Otra forma de hacer visible la ventana es utilizar el método show.
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		/*
		 * Muestra lo que hará la aplicación cuando se pulse el botón de cerrar. La
		 * operación EXIT_ON_CLOSE hace que el programa termine cuando el usuario cierra
		 * la venta. En este caso, como el programa tiene solo un frame, el cierre del
		 * mismo terminará el programa.
		 */
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		HolaMundo hm=new HolaMundo("Prueba1", Color.CYAN);

	}

}
