package u7.paneles;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo_Border extends JFrame{
	private JButton uno,dos, tres, cuatro, cinco;
	public Ejemplo_Border() {
		setTitle("Ejemplo BorderLayout");
		setLayout(new BorderLayout(5,10));
		
		uno=new JButton("uno");
		add(uno,BorderLayout.CENTER);
		dos=new JButton("dos");
		add(dos,BorderLayout.SOUTH);
		tres=new JButton("tres");
		add(tres,BorderLayout.NORTH);
		cuatro=new JButton("cuatro");
		add(cuatro, BorderLayout.EAST);
		cinco=new JButton("cinco");
		add(cinco,BorderLayout.WEST);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Ejemplo_Border prueba= new Ejemplo_Border();
	}

}
