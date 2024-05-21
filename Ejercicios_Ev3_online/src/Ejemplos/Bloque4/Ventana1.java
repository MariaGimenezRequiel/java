package Ejemplos.Bloque4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana1 extends JFrame implements ActionListener{
	private JButton uno, dos, tres;
	public Ventana1() {
		setLayout(new GridLayout(1,0,5,5));
		uno= new JButton("1");
		uno.addActionListener(this);
		add(uno);
		dos= new JButton("2");
		dos.addActionListener(this);
		add(dos);
		tres= new JButton("3");
		tres.addActionListener(this);
		add(tres);
		
		
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ventana1 prueba= new Ventana1();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==uno) {
			setTitle("Uno");
		}else if(e.getSource()==dos) {
			setTitle("Dos");
		}else if(e.getSource()==tres) {
			setTitle("tres");
		}
		
	}

}
