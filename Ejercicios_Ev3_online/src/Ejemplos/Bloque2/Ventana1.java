package Ejemplos.Bloque2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ventana1 extends JFrame implements ActionListener{
	private JTextField nombre;
	private JLabel etiqueta;
	private JButton boton;
	
	public Ventana1() {
	this.setLayout(null);
	
	// componentes
	etiqueta= new JLabel("Nombre: ");
	etiqueta.setBounds(20, 20, 60, 25);
	this.add(etiqueta);
	
	nombre = new JTextField(20);
	nombre.setBounds(100, 20, 200, 25);
	this.add(nombre);
	
	boton= new JButton("Aceptar");
	boton.setBounds(100, 60,100, 25);
	this.add(boton);
	boton.addActionListener(this);
	
	this.setSize(350, 150);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== boton) { // significa que si le damos al boton ocurre lo siguiente
			String cadena= nombre.getText();
			this.setTitle(cadena);
		}
		
	}
	
	
	public static void main(String[] args) {
		Ventana1 prueba= new Ventana1();

	}



	

}
