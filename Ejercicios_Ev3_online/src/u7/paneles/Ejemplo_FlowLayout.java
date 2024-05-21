package u7.paneles;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo_FlowLayout extends JFrame {
	
	private JButton boton;
	
	public Ejemplo_FlowLayout() {
	//Damos distribucion flowLayout
		//setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		setLayout(new GridLayout(4,3,10,20));
	// Añadimos componentes
	for(int i=1; i<=10; i++) {
		boton= new JButton("Botón"+i);
		this.add(boton);
	}
	
	//setSize(500,500);
	pack();
	setLocationRelativeTo(null);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}

	public static void main(String[] args) {
		Ejemplo_FlowLayout prueba= new Ejemplo_FlowLayout();

	}

}
