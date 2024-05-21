package u8.practica.V2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VSecundaria extends JDialog implements ActionListener {
// ventana para mostrar los datos
	private static final int WINDOW_WIDTH = 450;
	private static final int WINDOW_HEIGHT = 150;
	private static final String WINDOW_TITLE = "Opción crear productos";
	private static final String BUTTON_LABEL_ACEPTAR = "Aceptar";
	private static final String LABEL_ENUNCIADO = "Indique el tipo de producto:";
	private static final String LABEL_PELICULA = "Película";
	private static final String LABEL_JUEGO = "Videojuego";
	private static final String LABEL_MUSICA = "Música";
	private JLabel enunciado;
	private JComboBox productos;
	private JPanel panel1;
	private JButton boton;

	public VSecundaria(VPrincipal parent, boolean modal) {
		super(parent, modal);
		// panel y elementos

		panel1 = new JPanel();
		panel1.setLayout(null);
		this.setContentPane(panel1);
		
		this.setLayout(new GroupLayout(panel1));
		enunciado = new JLabel(LABEL_ENUNCIADO);
		enunciado.setBounds(20, 20, 200, 25);
		panel1.add(enunciado);

		productos = new JComboBox();
		productos.setBounds(200, 20, 200, 25);
		productos.addItem("-");
		productos.addItem(LABEL_PELICULA);
		productos.addItem(LABEL_MUSICA);
		productos.addItem(LABEL_JUEGO);
		panel1.add(productos);

		boton = new JButton(BUTTON_LABEL_ACEPTAR);
		boton.setBounds(150, 60, 100, 25);
		panel1.add(boton);
		boton.addActionListener(this);

		// configuracion ventana
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	// solo para probar la ventana secundaria
	/*
	 * public static void main(String[] args) { VSecundaria v= new VSecundaria(); }
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		String seleccionado = "";
		if (e.getSource() == boton) {
			seleccionado = (String) productos.getSelectedItem();
			if (seleccionado.equalsIgnoreCase("Película")) {
				VPelicula v1 = new VPelicula(this, true);
			}
			if (seleccionado.equalsIgnoreCase("Música")) {
				VMusica v2 = new VMusica(this, true);
			}
			if (seleccionado.equalsIgnoreCase("Videojuego")) {
				VJuego v3 = new VJuego(this, true);
			}
			if (seleccionado.equalsIgnoreCase("-")) {
				JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una opción", "Error",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

}
