package u7.paneles;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelCompuesto extends JFrame{

	
	public PanelCompuesto() {
		JPanel panel1= new JPanel();
		panel1.setLayout(new GridLayout(0,3));
		add(panel1);
		for(int i=1;i<=9;i++) {
			panel1.add(new JButton(""+i));
		}
		
		JPanel panel2= new JPanel();
		panel2.setLayout(new BorderLayout());
		
		panel2.add(new JButton("Cancelar"),BorderLayout.SOUTH);
		panel2.add(panel1, BorderLayout.CENTER);
		add(panel2);
		
		setLayout(new BorderLayout());
		add(panel2,BorderLayout.EAST);
		add(new JButton("Cancelar"),BorderLayout.CENTER);
		
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String[] args) {
		PanelCompuesto prueba= new PanelCompuesto();

	}

}
