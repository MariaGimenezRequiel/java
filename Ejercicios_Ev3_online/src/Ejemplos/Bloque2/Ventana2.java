package Ejemplos.Bloque2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana2 extends JFrame implements ActionListener{
	private JLabel etiqueta;
	private JTextField campo;
	private JButton boton;
	
	public Ventana2() {
		this.setLayout(null);
		
		etiqueta= new JLabel("Introduzca un nº entero:");
		etiqueta.setBounds(50, 20, 150, 25);
		this.add(etiqueta);
		
		campo= new JTextField(10);
		campo.setBounds(60, 50, 100, 25);
		this.add(campo);
		
		boton= new JButton("Par o impar");
		boton.setBounds(60, 90, 100, 30);
		this.add(boton);
		boton.addActionListener(this);
		
		
		
		this.setSize(250, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(e.getSource()==boton) {
			String numero= campo.getText();
			int n= Integer.parseInt(numero);
			if(n%2==0) {
				setTitle("Par");
			}else {
				setTitle("Impar");
			}
		}
		}catch(Exception ex) {
			setTitle("Error");
		}
		
	}
	public static void main(String[] args) {
		Ventana2 prueba= new Ventana2();

	}
	

}
