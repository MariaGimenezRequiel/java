package Ejemplos.Bloque2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana3 extends JFrame implements ActionListener {
	private JLabel simbolo1, simbolo2;
	private JTextField campo1, campo2, resultado;
	private JButton boton;
	
	
	public Ventana3() {
		setLayout(null);
		
		campo1= new JTextField ();
		campo1.setBounds(50, 20, 50, 25);
		add(campo1);
		
		simbolo1= new JLabel(" x ");
		simbolo1.setBounds(110, 20, 25, 25);
		add(simbolo1);
		
		campo2= new JTextField();
		campo2.setBounds(130, 20, 50, 25);
		add(campo2);
		
		simbolo2= new JLabel(" = ");
		simbolo2.setBounds(190, 20, 25, 25);
		add(simbolo2);
		
		resultado= new JTextField();
		resultado.setBounds(210, 20, 150, 25);
		resultado.setEnabled(false);
		add(resultado);
		
		boton= new JButton("Multiplicar");
		boton.setBounds(130, 80 ,100, 30);
		boton.addActionListener(this);
		add(boton);
		
		
		setSize(400, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				int n1= Integer.parseInt(campo1.getText()); // integer.parseInt metodo para convertir en entero un string
				int n2= Integer.parseInt(campo2.getText());
				int multi= n1*n2;
				resultado.setText(String.valueOf(multi));// String.ValueOf(int) metodo para convertir a string un valor
			}catch(Exception ex) {
				setTitle("Error");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Ventana3 prueba= new Ventana3();
	}


	

}
