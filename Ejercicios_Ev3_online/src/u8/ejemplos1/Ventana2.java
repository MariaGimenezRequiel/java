package u8.ejemplos1;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author MARIA REQUIEL
 *si yo sé que mi clase va a ser una ventana, puedo hacer que herede de JFrame directamente
 */
public class Ventana2 extends JFrame{
	
// en este caso no creo el objeto marco en el constrcutor
	public Ventana2(String titulo, Color color) {
		
		super(titulo);
			JPanel jp =new JPanel();
			
			jp.setBackground(color); // dar un color
			jp.setLayout(new FlowLayout());// establecemos el esquema del lienzo
			
			JButton boton= new JButton ("Pulsar"); // creamos un botón
			jp.add(boton); //añadimos el componenete boton al panel
			
		this.setContentPane(jp);//relacionamos el panel con las configuraciones anteriores con el marco
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);//posicionamos ventana en el centro
		this.setVisible(true);// hacemos visible la ventana
		
	}
	// otro constructor puede ser...
	
	public Ventana2(String titulo) {
		super(titulo);
		
		JPanel jp=new JPanel();
		jp.setBackground(Color.GRAY);// le doy un color por defecto
		
		this.setContentPane(jp);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	// 3º constructor donde no paso ningún valor por parámetro
	
	public Ventana2() {
		super("Por defecto");
		JPanel jp= new JPanel();
		jp.setBackground(Color.BLUE);
		this.setContentPane(jp);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	public static void main(String[]args) {
		Ventana2 v= new Ventana2("Título1");
		Color colorv= Color.GREEN;
		Ventana2 v2= new Ventana2("Título2", colorv);
		Ventana2 v3= new Ventana2();
	}
	
}

