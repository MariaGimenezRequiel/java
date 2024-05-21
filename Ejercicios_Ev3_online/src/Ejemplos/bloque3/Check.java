package Ejemplos.bloque3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Check extends JFrame implements ActionListener, ChangeListener{
	private JCheckBox check;
	private JButton boton;
	private boolean aceptado;
	public Check() {
		setLayout(null);
		check= new JCheckBox("Acepta antes de salir");
		check.setBounds(80,20,200,25);
		add(check);
		check.addChangeListener(this);
		
		boton= new JButton("Salir");
		boton.setBounds(110, 60, 100, 25);
		add(boton);
		boton.addActionListener(this);
		
		setSize(360, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		Check prueba= new Check();
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		
		if(check.isSelected()) {
			aceptado=true;
			setTitle("");
		}else {
			aceptado=false;
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			if(aceptado) {
				System.exit(0);
			}else {
				setTitle("Debes aceptar antes de salir");
			}
		}
		
	}

}
