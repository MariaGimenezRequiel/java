package Fomulario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaSecundaria extends JDialog implements ActionListener{
	// variables
	private JTextArea txt;
	private JButton volver;
	// constructor
	public VentanaSecundaria(String listatxt) {
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		//componentes
		txt= new JTextArea(listatxt);
		txt.setEditable(false);
		panel.add(txt, BorderLayout.CENTER);
		
		volver= new JButton("Volver");
		panel.add(volver, BorderLayout.SOUTH);
		volver.addActionListener(this);
		setTitle("Datos Alumnos");
		setContentPane(panel);
		
		setSize(500,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==volver) {
			setVisible(false);
		}
		
		
	}
	
}
