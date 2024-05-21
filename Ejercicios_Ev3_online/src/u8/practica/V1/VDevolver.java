package u8.practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VDevolver extends JDialog implements ActionListener {
	private static final int WINDOW_WIDTH = 300;
	private static final int WINDOW_HEIGHT = 150;
	private static final String WINDOW_TITLE = "Opción devolución de producto.";

	private static final String LABEL_COD = "Código del producto:";
	private static final String BUTTON_LABEL_ACEPTAR = "Aceptar";

	private JPanel panel1;
	private JLabel enunciado;
	private JTextField campoCodigo;
	private JButton boton;

	public VDevolver(VPrincipal parent, boolean modal) {
		super(parent, modal);

		this.setLayout(null);
		panel1 = new JPanel();
		panel1.setLayout(null);
		setContentPane(panel1);

		enunciado = new JLabel(LABEL_COD);
		enunciado.setBounds(20, 10, 150, 25);
		panel1.add(enunciado);

		campoCodigo = new JTextField();
		campoCodigo.setBounds(150, 10, 100, 25);
		panel1.add(campoCodigo);

		boton = new JButton(BUTTON_LABEL_ACEPTAR);
		boton.setBounds(100, 50, 100, 25);
		panel1.add(boton);
		boton.addActionListener(this);

		// configuracion ventana
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int codigo = 0;
		String txtcodigo = campoCodigo.getText();
		boolean codigoCorrecto = false;
		try {
			codigo = Integer.parseInt(txtcodigo);
			codigoCorrecto = true;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Debe introducir un valor numérico en el campo código.", "Error",
					JOptionPane.ERROR_MESSAGE);
			codigoCorrecto = false;
			campoCodigo.setText("");
		}
		if (codigoCorrecto) {
			ProductoVideoclub.devolver(codigo);
			;
			campoCodigo.setText("");
		}

	}

}
