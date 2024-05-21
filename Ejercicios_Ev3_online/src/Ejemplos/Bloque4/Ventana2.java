package Ejemplos.Bloque4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana2 extends JFrame{
	private JPanel panel1, panel2;
	private JLabel operadores, resultado, operaciones;
	private JTextField op1,op2,res;
	private JRadioButton suma, resta, multiplicacion, division, resto;
	private ButtonGroup grupoBotones;
	public Ventana2() {
	
	// Creamos los paneles y los añadimos a la ventana
	panel1= new JPanel();
	panel2= new JPanel();
	add(panel1);
	add(panel2);
	// organizamos los dos paneles en la ventana, de izquierda a derecha
	setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
	
	// los componentes en cada uno de los paneles se distribuyen en una única columna
	
		panel1.setLayout(new GridLayout(0,1,15,15));
		panel2.setLayout(new GridLayout(0,1,5,5));
	
		// creamos los componentes y los añadimos al panel correspondiente
		operadores= new JLabel("Operadores:");
		panel1.add(operadores);
		
		op1= new JTextField();
		panel1.add(op1);
		
		
		op2= new JTextField();
		panel1.add(op2);
		
		
		resultado= new JLabel("Resultado:");
		panel1.add(resultado);
		
		res= new JTextField();
		panel1.add(res);
		
		
		
		operaciones= new JLabel("Operaciones: ");
		panel2.add(operaciones);
		
		suma= new JRadioButton("Sumar");
		panel2.add(suma);
		
		resta= new JRadioButton("Restar");
		panel2.add(resta);
		
		multiplicacion= new JRadioButton("Multiplicar");
		panel2.add(multiplicacion);
		division= new JRadioButton("Dividir");
		panel2.add(division);
		resto= new JRadioButton("Resto");
		panel2.add(resto);
		
		grupoBotones= new ButtonGroup();
		grupoBotones.add(suma);
		grupoBotones.add(resta);
		grupoBotones.add(multiplicacion);
		grupoBotones.add(division);
		grupoBotones.add(resto);

	
		
		
	}
	
	
	public static void main(String[] args) {
		Ventana2 prueba= new Ventana2();
		prueba.pack();
		prueba.setLocationRelativeTo(null);
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
	}

}
