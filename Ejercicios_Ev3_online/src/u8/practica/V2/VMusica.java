package u8.practica.V2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VMusica extends JDialog implements ActionListener {

	private static final int WINDOW_WIDTH = 300;
	private static final int WINDOW_HEIGHT = 300;
	private static final String WINDOW_TITLE = "Opción crear música.";

	private static final String LABEL_COD = "Código:";
	private static final String LABEL_TITULO = "Título:";
	private static final String LABEL_NUM = "Número de ejemplares:";
	private static final String LABEL_NGROUP = "Nombre del grupo:";
	private static final String LABEL_YEAR = "Año:";
	private static final String BUTTON_LABEL_GUARDAR = "Guardar";

	private JPanel panelMusica;
	private JLabel eCod, eTitulo, eNum, eNGroup, eYear;
	private JTextField cod, titulo, num, nGroup, year;
	private JButton boton;

	public VMusica(VSecundaria parent, boolean modal) {
		super(parent, modal);
		panelMusica = new JPanel();
		panelMusica.setLayout(null);
		this.setContentPane(panelMusica);

		eCod = new JLabel(LABEL_COD);
		eCod.setBounds(20, 10, 100, 25);
		panelMusica.add(eCod);

		cod = new JTextField();
		cod.setBounds(130, 10, 100, 25);
		panelMusica.add(cod);

		eTitulo = new JLabel(LABEL_TITULO);
		eTitulo.setBounds(20, 50, 100, 25);
		panelMusica.add(eTitulo);

		titulo = new JTextField();
		titulo.setBounds(130, 50, 100, 25);
		panelMusica.add(titulo);

		eNum = new JLabel(LABEL_NUM);
		eNum.setBounds(20, 90, 150, 25);
		panelMusica.add(eNum);

		num = new JTextField();
		num.setBounds(170, 90, 60, 25);
		panelMusica.add(num);

		eNGroup = new JLabel(LABEL_NGROUP);
		eNGroup.setBounds(20, 130, 150, 25);
		panelMusica.add(eNGroup);

		nGroup = new JTextField();
		nGroup.setBounds(160, 130, 65, 25);
		panelMusica.add(nGroup);

		eYear = new JLabel(LABEL_YEAR);
		eYear.setBounds(20, 170, 50, 25);
		panelMusica.add(eYear);

		year = new JTextField();
		year.setBounds(130, 170, 100, 25);
		panelMusica.add(year);

		boton = new JButton(BUTTON_LABEL_GUARDAR);
		boton.setBounds(100, 210, 100, 25);
		panelMusica.add(boton);
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
		String nombreGrupo = nGroup.getText();
		String year2 = year.getText();

		if (e.getSource() == boton) {
			if (!txtcodigo.isEmpty() && !titulo2.isEmpty() && !txtnum.isEmpty() && !nombreGrupo.isEmpty()
					&& !year2.isEmpty()) {
				boolean codCorrecto = Validaciones.validarEntero(txtcodigo, "código");
				boolean numCorrecto = Validaciones.validarEntero(txtnum, "número de ejemplares");
				boolean numYearCorrecto = Validaciones.validarEntero(year2, "año");

				if (codCorrecto && numCorrecto && numYearCorrecto) {

					int codigo = Integer.parseInt(txtcodigo);
					int numEjemplares = Integer.parseInt(txtnum);
					int numYear = Integer.parseInt(year2);
						if(Musica.validarYear(numYear)) {
								if (!ProductoVideoclub.codigoExiste(codigo)) {
									ProductoVideoclub pv = new Musica(codigo, titulo2, numEjemplares, nombreGrupo, numYear);
									ProductoVideoclub.getListaProductos().add(pv);
									JOptionPane.showMessageDialog(null, "Nueva música creada", "Producto añadido",
											JOptionPane.INFORMATION_MESSAGE);
			
									limpiarCampos();
								}
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
		nGroup.setText("");
		year.setText("");

	}

}
