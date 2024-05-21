package u8.practica.V2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VMostrar extends JDialog implements ActionListener {
	private static final int WINDOW_WIDTH = 550;
	private static final int WINDOW_HEIGHT = 600;
	private static final String WINDOW_TITLE = "Opción mostrar productos";

	private static final String LABEL_ENUNCIADO = "Indique el tipo de producto:";
	private static final String LABEL_PELICULA = "Película";
	private static final String LABEL_JUEGO = "Videojuego";
	private static final String LABEL_MUSICA = "Música";
	private static final String BUTTON_LABEL_ACEPTAR = "Aceptar";
	private JPanel panel1;
	private JLabel enunciado;
	private JComboBox productos;
	private JButton boton;
	private JTextArea txt;

	public VMostrar(VPrincipal parent, boolean modal) {
		super(parent, modal);
		// panel y elementos
		this.setLayout(null);
		panel1 = new JPanel();
		panel1.setLayout(null);
		setContentPane(panel1);

		enunciado = new JLabel(LABEL_ENUNCIADO);
		enunciado.setBounds(70, 20, 200, 25);
		panel1.add(enunciado);

		productos = new JComboBox();
		productos.setBounds(250, 20, 200, 25);
		productos.addItem("-");
		productos.addItem(LABEL_PELICULA);
		productos.addItem(LABEL_MUSICA);
		productos.addItem(LABEL_JUEGO);
		panel1.add(productos);

		boton = new JButton(BUTTON_LABEL_ACEPTAR);
		boton.setBounds(200, 60, 100, 25);
		panel1.add(boton);
		boton.addActionListener(this);

		txt = new JTextArea();
		txt.setEditable(false);

		JScrollPane scpanel = new JScrollPane(txt);
		scpanel.setBounds(20, 100, 500, 400);
		panel1.add(scpanel);

		// configuracion ventana
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String txtmensaje = "";
		String seleccionado = (String) productos.getSelectedItem();
		if (seleccionado.equalsIgnoreCase(LABEL_PELICULA)) {

			for (ProductoVideoclub p : ProductoVideoclub.getListaProductos()) {
				if (p instanceof Pelicula) {
					txtmensaje = txtmensaje + p.toString() + "\n";
				}
			}
			txt.setText(txtmensaje);

		}
		if (seleccionado.equalsIgnoreCase(LABEL_MUSICA)) {
			for (ProductoVideoclub p : ProductoVideoclub.getListaProductos()) {
				if (p instanceof Musica) {
					txtmensaje = txtmensaje + p.toString() + "\n";
				}
			}
			txt.setText(txtmensaje);
		}
		if (seleccionado.equalsIgnoreCase(LABEL_JUEGO)) {
			for (ProductoVideoclub p : ProductoVideoclub.getListaProductos()) {
				if (p instanceof Juego) {
					txtmensaje = txtmensaje + p.toString() + "\n";
				}
			}
			txt.setText(txtmensaje);
		}
		if (seleccionado.equalsIgnoreCase("-")) {
			JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una opción", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
