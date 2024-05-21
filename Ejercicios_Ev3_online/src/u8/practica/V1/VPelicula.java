package u8.practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VPelicula extends JDialog implements ActionListener {
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 300;
	private static final String WINDOW_TITLE = "Opción crear película.";

	private static final String LABEL_COD = "Código:";
	private static final String LABEL_TITULO = "Título:";
	private static final String LABEL_NUM = "Número de ejemplares:";
	private static final String LABEL_DIRECTOR = "Director:";
	private static final String LABEL_INTER = "Intérpretes:";
	private static final String LABEL_GEN = "Género:";
	private static final String BUTTON_LABEL_GUARDAR = "Guardar";

	private JLabel eCod, eTitulo, eNum, eDirector, eInterpretes, eGenero;
	private JTextField cod, titulo, num, director, interpretes, genero;
	private JPanel panelPeliculas;
	private JButton boton;

	public VPelicula(VSecundaria parent, boolean modal) {
		super(parent, modal);

		panelPeliculas = new JPanel();
		panelPeliculas.setLayout(null);
		this.setContentPane(panelPeliculas);

		eCod = new JLabel(LABEL_COD);
		eCod.setBounds(20, 60, 100, 25);
		panelPeliculas.add(eCod);

		cod = new JTextField();
		cod.setBounds(130, 60, 100, 25);
		panelPeliculas.add(cod);

		eTitulo = new JLabel(LABEL_TITULO);
		eTitulo.setBounds(20, 100, 100, 25);
		panelPeliculas.add(eTitulo);

		titulo = new JTextField();
		titulo.setBounds(130, 100, 100, 25);
		panelPeliculas.add(titulo);

		eNum = new JLabel(LABEL_NUM);
		eNum.setBounds(20, 140, 150, 25);
		panelPeliculas.add(eNum);

		num = new JTextField();
		num.setBounds(170, 140, 60, 25);
		panelPeliculas.add(num);

		eDirector = new JLabel(LABEL_DIRECTOR);
		eDirector.setBounds(20, 180, 100, 25);
		panelPeliculas.add(eDirector);

		director = new JTextField();
		director.setBounds(130, 180, 100, 25);
		panelPeliculas.add(director);

		eInterpretes = new JLabel(LABEL_INTER);
		eInterpretes.setBounds(20, 220, 100, 25);
		panelPeliculas.add(eInterpretes);

		interpretes = new JTextField();
		interpretes.setBounds(130, 220, 100, 25);
		panelPeliculas.add(interpretes);

		eGenero = new JLabel(LABEL_GEN);
		eGenero.setBounds(20, 260, 100, 25);
		panelPeliculas.add(eGenero);

		genero = new JTextField();
		genero.setBounds(130, 260, 100, 25);
		panelPeliculas.add(genero);

		boton = new JButton(BUTTON_LABEL_GUARDAR);
		boton.setBounds(100, 300, 100, 25);
		panelPeliculas.add(boton);
		boton.addActionListener(this);

		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String txtcodigo = cod.getText();
		String titulo2 = titulo.getText();
		String txtnum = num.getText();
		String director2 = director.getText();
		String interpretes2 = interpretes.getText();
		String genero2 = genero.getText();

		if (e.getSource() == boton) {
			if (!txtcodigo.isEmpty() && !titulo2.isEmpty() && !txtnum.isEmpty() && !director2.isEmpty()
					&& !interpretes2.isEmpty() && !genero2.isEmpty()) {
				boolean codCorrecto = Validaciones.validarEntero(txtcodigo, "código");
				boolean numCorrecto = Validaciones.validarEntero(txtnum, "número de ejemplares");

				if (codCorrecto && numCorrecto) {
					int codigo = Integer.parseInt(txtcodigo);
					int numEjemplares = Integer.parseInt(txtnum);

					// solo creamos la pelicula si el codigo no existe ya en la lista, ya que dicho
					// valor debe ser único
					if (!ProductoVideoclub.codigoExiste(codigo)) {
						ProductoVideoclub pv = new Pelicula(codigo, titulo2, numEjemplares, director2, interpretes2,
								genero2);
						ProductoVideoclub.getListaProductos().add(pv);
						JOptionPane.showMessageDialog(null, "Nueva película creada", "Producto añadido",
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
		director.setText("");
		interpretes.setText("");
		genero.setText("");
	}

}
