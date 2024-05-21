package u8.tarea1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Etiqueta extends JFrame{
	JLabel nombre, nombre2;	
	public Etiqueta() {
	
	super("Mi primer JLabel");
	// creo componente
	nombre= new JLabel("María Giménez",JLabel.LEFT);
	this.add(nombre);
	this.setSize(300, 100);
	this.setLocationRelativeTo(null);
	this.setVisible(true);

		
	}
	
	
	
	public static void main(String[] args) {
	
		Etiqueta e1= new Etiqueta();
	}

}
