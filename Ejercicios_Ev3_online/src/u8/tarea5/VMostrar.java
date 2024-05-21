package u8.tarea5;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import u8.practica.VPrincipal;

public class VMostrar extends JDialog{
	private static final int WINDOW_WIDTH = 550;
	private static final int WINDOW_HEIGHT = 600;
	private static final String WINDOW_TITLE = "Opción mostrar productos";


	private JPanel panel1;
	private JTextArea txt;

	public VMostrar(String lista) {
		
		// panel y elementos
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		setContentPane(panel1);

		txt = new JTextArea(lista);
		txt.setEditable(false);

		JScrollPane scpanel = new JScrollPane(txt);
		scpanel.setBounds(20, 20, 500, 400);
		panel1.add(scpanel);

		// configuracion ventana
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
	
}
