package Ejemplos.bloque3;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RadioBoton extends JFrame implements ChangeListener{
	private JRadioButton rojo, azul, verde, amarillo;
	private JLabel resultado;
	private JPanel panel;
	private ButtonGroup grupoBotones; // si no los meto en el grupo no me deselecciona los botones cuando marco otro
	public RadioBoton() {
		setLayout(new FlowLayout(FlowLayout.LEFT,40,20));
		panel= new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(0,1,15,15));
		
		
		
		rojo= new JRadioButton("Rojo");
		rojo.addChangeListener(this);
		panel.add(rojo);
		
		azul= new JRadioButton("Azul");
		azul.addChangeListener(this);
		panel.add(azul);
		
		verde= new JRadioButton("Verde");
		verde.addChangeListener(this);
		panel.add(verde);
		
		amarillo= new JRadioButton("Amarillo");
		amarillo.addChangeListener(this);
		panel.add(amarillo);
		
		resultado= new JLabel();
		panel.add(resultado);
		
		grupoBotones= new ButtonGroup();
		grupoBotones.add(rojo);
		grupoBotones.add(azul);
		grupoBotones.add(verde);
		grupoBotones.add(amarillo);
		
		
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		String cad= "Color elegido: ";
		if(rojo.isSelected()) {
			cad= cad+" rojo";
		}else if(azul.isSelected()) {
			cad=cad+" azul";
		}else if(verde.isSelected()) {
			cad= cad+" verde";
		}else if(amarillo.isSelected()) {
			cad=cad+" amarillo";
		}
		resultado.setText(cad);
	}
	public static void main(String[] args) {
		RadioBoton prueba= new RadioBoton();

	}
	

}
