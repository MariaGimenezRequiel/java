package u8.tarea5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VCrear extends JDialog implements ActionListener {
	private static final int WINDOW_WIDTH = 300;
	private static final int WINDOW_HEIGHT = 250;
	private static final String WINDOW_TITLE = "FORMULARIO PELÍCULAS";
	private static final String LABEL_TITULO = "TÍTULO:";
	private static final String LABEL_DIRECTOR = "DIRECTOR:";
	private static final String LABEL_YEAR = "AÑO:";
	private static final String BUTTON_LABEL_GUARDAR = "Guardar";
	
	private JLabel eTitulo, eDirector, eYear;
	private JTextField  titulo, director, year;
	private JPanel jp;
	private JButton boton;
	
	
	public VCrear (VPrincipal parent, boolean modal) {
		
		super(parent, modal);
		 jp= new JPanel();
		setContentPane(jp);
		this.setLayout(new GroupLayout(jp));
		
		eTitulo = new JLabel(LABEL_TITULO);
		eTitulo.setBounds(20, 20, 100, 25);
		jp.add(eTitulo);

		titulo = new JTextField();
		titulo.setBounds(130, 20, 100, 25);
		jp.add(titulo);
		
		eDirector = new JLabel(LABEL_DIRECTOR);
		eDirector.setBounds(20, 60, 100, 25);
		jp.add(eDirector);

		director = new JTextField();
		director.setBounds(130, 60, 100, 25);
		jp.add(director);
		
		eYear = new JLabel(LABEL_YEAR);
		eYear.setBounds(20, 100, 100, 25);
		jp.add(eYear);

		year = new JTextField();
		year.setBounds(130, 100, 100, 25);
		jp.add(year);
		
		boton = new JButton(BUTTON_LABEL_GUARDAR);
		boton.setBounds(100, 140, 100, 25);
		jp.add(boton);
		boton.addActionListener(this);
		
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String txtTitulo= titulo.getText();
		String txtDirector=director.getText();
		String txtYear= year.getText();
		boolean datosCorrectos=true;
		if(!txtTitulo.isEmpty()&&!txtDirector.isEmpty()&&!txtYear.isEmpty()) {
			datosCorrectos=Pelicula.validarDatosPelicula(txtTitulo, txtDirector, txtYear);
			if(datosCorrectos) {
				int yearNum= Integer.parseInt(txtYear);
				Pelicula p= new Pelicula(txtTitulo, txtDirector, yearNum);
				Pelicula.getMiLista().add(p);
				limpiarCampos();
				JOptionPane.showMessageDialog(null, "Película creada correctamente", "OPERACIÓN REALIZADA", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "La película no fue creada", "OPERACIÓN CANCELADA", JOptionPane.ERROR_MESSAGE);
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Datos incompletos","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	public  void limpiarCampos() {
		titulo.setText("");
		director.setText("");
		year.setText("");
	}

}
