package u8.practica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VJuego extends JDialog implements ActionListener {

	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 300;
	private static final String WINDOW_TITLE = "Opción crear juego.";

	private static final String LABEL_COD = "Código:";
	private static final String LABEL_TITULO = "Título:";
	private static final String LABEL_NUM = "Número de ejemplares:";
	private static final String LABEL_AUTOR = "Autor:";
	private static final String BUTTON_LABEL_GUARDAR = "Guardar";

	private JLabel eAutor, eCod, eTitulo, eNum;
	private JTextField autor, cod, titulo, num;
	private JRadioButton multi, noMulti;
	private ButtonGroup grupoBotones;
	private JPanel panelJuego;
	private JButton boton;

	public VJuego(VSecundaria parent, boolean modal) {
		super(parent, modal);
		panelJuego = new JPanel();
		panelJuego.setLayout(null);
		this.setContentPane(panelJuego);

		eCod = new JLabel(LABEL_COD);
		eCod.setBounds(20, 10, 100, 25);
		panelJuego.add(eCod);

		cod = new JTextField();
		cod.setBounds(70, 10, 100, 25);
		panelJuego.add(cod);

		eTitulo = new JLabel(LABEL_TITULO);
		eTitulo.setBounds(20, 50, 100, 25);
		panelJuego.add(eTitulo);

		titulo = new JTextField();
		titulo.setBounds(70, 50, 100, 25);
		panelJuego.add(titulo);

		eNum = new JLabel(LABEL_NUM);
		eNum.setBounds(20, 90, 150, 25);
		panelJuego.add(eNum);

		num = new JTextField();
		num.setBounds(170, 90, 60, 25);
		panelJuego.add(num);

		multi = new JRadioButton("MULTIJUGADOR");
		multi.setBounds(20, 170, 200, 25);
		panelJuego.add(multi);

		noMulti = new JRadioButton("NO MULTIJUGADOR");
		noMulti.setBounds(230, 170, 200, 25);
		panelJuego.add(noMulti);

		grupoBotones = new ButtonGroup();
		grupoBotones.add(multi);
		grupoBotones.add(noMulti);

		eAutor = new JLabel(LABEL_AUTOR);
		eAutor.setBounds(20, 130, 100, 25);
		panelJuego.add(eAutor);

		autor = new JTextField();
		autor.setBounds(70, 130, 100, 25);
		panelJuego.add(autor);

		boton = new JButton(BUTTON_LABEL_GUARDAR);
		boton.setBounds(110, 210, 100, 25);
		panelJuego.add(boton);
		boton.addActionListener(this);

		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Pasamos los datos recogidos a String para tratarlos
		String txtcodigo = cod.getText();
		String titulo2 = titulo.getText();
		String txtnum = num.getText();
		String txtautor = autor.getText();

		if (e.getSource() == boton) {
			if (!txtcodigo.isEmpty() && !titulo2.isEmpty() && !txtnum.isEmpty() && !txtautor.isEmpty()
					&& (multi.isSelected() || noMulti.isSelected())) {
				boolean codCorrecto = Validaciones.validarEntero(txtcodigo, "código");
				boolean numCorrecto = Validaciones.validarEntero(txtnum, "número de ejemplares");

				if (codCorrecto && numCorrecto) {
					int codigo = Integer.parseInt(txtcodigo);
					int numEjemplares = Integer.parseInt(txtnum);

					// trato el dato de multijugador con un booleano
					boolean multijugador = true;

					if (multi.isSelected()) {
						multijugador = true;
					} else if (noMulti.isSelected()) {
						multijugador = false;
					}
					// solo creamos el juego si el codigo no existe ya en la lista, ya que dicho
					// valor debe ser único

					if (!ProductoVideoclub.codigoExiste(codigo)) {
						ProductoVideoclub pv = new Juego(codigo, titulo2, numEjemplares, multijugador, txtautor);
						ProductoVideoclub.getListaProductos().add(pv);
						JOptionPane.showMessageDialog(null, "Nuevo juego creado", "Producto añadido",
								JOptionPane.INFORMATION_MESSAGE);

						limpiarCampos();

					}
				}

			} else {
				JOptionPane.showMessageDialog(null, "Error!Campos incompletos.", "", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void limpiarCampos() {
		cod.setText("");
		titulo.setText("");
		num.setText("");
		autor.setText("");
	}

}
