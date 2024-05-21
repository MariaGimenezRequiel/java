package u8.tarea4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VSecundaria extends JDialog {

	// variables
		private JTextArea txt;
		private JButton volver;
		// constructor
		public VSecundaria(String listatxt) {
			JPanel panel= new JPanel();
			panel.setLayout(new BorderLayout());
			//componentes
			txt= new JTextArea(listatxt);
			txt.setEditable(false);
			panel.add(txt, BorderLayout.CENTER);
			
		
			setContentPane(panel);
			setSize(500,200);
			setLocationRelativeTo(null);
			setVisible(true);
			
		}
	
	
}
