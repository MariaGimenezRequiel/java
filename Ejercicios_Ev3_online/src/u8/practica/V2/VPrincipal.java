package u8.practica.V2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




/*
 * Crear un menú con las siguientes opciones: 
 * 1. Añadir recursos automáticamente.
 * Se crearán varios recursos de ejemplo y se añadirán a la lista de recursos.
 * Sólo se pueden añadir una vez a la lista.
 * 
 *  2. Añadir un nuevo recurso. Se debe
 * escoger el tipo de recurso que se desea crear y solicitar los datos
 * necesarios para crear dicho recurso. Independientemente del recurso que sea,
 * se debe guardar en una lista de recursos. 
 * 
 * 3. Mostrar recursos. Solicitar el tipo
 * de recursos que se quiere mostrar (películas, juegos o música) y dependiendo
 * lo que indique el usuario mostrar todos los recursos de ese tipo con toda la
 * información bien formateada. 
 * 
 * 4. Dar de baja un recurso. Que solicite el código
 * del recurso que se desea eliminar y borre de la lista el recurso indicado.
 * 
 * 5. Alquilar un recurso. Se preguntará el recurso que se quiere alquilar y se
 * restará 1 al número de ejemplares de dicho recurso. Controlar el número de
 * ejemplares debe ser mayor de 0 para poder alquilar. 
 * 
 * 6. Devolver un recurso. Se preguntará el recurso que se quiere devolver y se sumará 1 al número de
 * ejemplares de dicho recurso.
 * 
 *  7. Salir.
 *  
 *
 */
public class VPrincipal extends JFrame implements ActionListener {
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 500;
	private static final String WINDOW_TITLE = "VIDEOCLUB";

	private static final String BUTTON_LABEL_CREAR = "Crear recursos automáticamente";
	private static final String BUTTON_LABEL_NUEVO = "Crear un nuevo producto";
	private static final String BUTTON_LABEL_MOSTRAR = "Mostrar productos";
	private static final String BUTTON_LABEL_BAJA = "Baja producto";
	private static final String BUTTON_LABEL_ALQUILAR = "Alquilar producto";
	private static final String BUTTON_LABEL_DEVOLVER = "Devolver";
	private static final String LABEL_ENUNCIADO = "Seleccione una de las siguientes opciones:";
	private static final String BUTTON_LABEL_SALIR = "Salir";

	private JLabel txt;
	private JButton crearRecursos, nuevoRecurso, mostrar, baja, alquilar, devolver, salir;
	boolean introducidos = false;

	public VPrincipal() {
		// PANEL 1,contenedor principal del frame, y distribucion

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(10, 10));
		this.setContentPane(panel1);

		// panel 2 y sus componentes
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 0, 30, 50));

		crearRecursos = new JButton(BUTTON_LABEL_CREAR);
		panel2.add(crearRecursos);
		crearRecursos.addActionListener(this);

		nuevoRecurso = new JButton(BUTTON_LABEL_NUEVO);
		panel2.add(nuevoRecurso);
		nuevoRecurso.addActionListener(this);

		mostrar = new JButton(BUTTON_LABEL_MOSTRAR);
		panel2.add(mostrar);
		mostrar.addActionListener(this);

		baja = new JButton(BUTTON_LABEL_BAJA);
		panel2.add(baja);
		baja.addActionListener(this);

		alquilar = new JButton(BUTTON_LABEL_ALQUILAR);
		panel2.add(alquilar);
		alquilar.addActionListener(this);

		devolver = new JButton(BUTTON_LABEL_DEVOLVER);
		panel2.add(devolver);
		devolver.addActionListener(this);

		// resto de componentes y se añade al panel1, el principal
		txt = new JLabel(LABEL_ENUNCIADO);
		panel1.add(txt, BorderLayout.NORTH);

		salir = new JButton(BUTTON_LABEL_SALIR);
		panel1.add(salir, BorderLayout.SOUTH);
		salir.addActionListener(this);

		// por último, añadimos el panel 2 al principal
		panel1.add(panel2, BorderLayout.CENTER);

		this.setTitle(WINDOW_TITLE);

		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		VPrincipal v = new VPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == crearRecursos) {

			if (introducidos == false) {
				
				u8.practica.V2.ProductoVideoclub.crearProductoFicticio();
				introducidos = true; // importante para cuando se vuelva a pulsar el botón detecte que ya se ha introducito
				// por lo tanto este boton solo puede funcionar una vez cada vez que se inicie la ejecución
				JOptionPane.showMessageDialog(null, "Recursos introducidos correctamente.", "Operación realizada",
						JOptionPane.INFORMATION_MESSAGE);

			} else {

				JOptionPane.showMessageDialog(null, "Error! Los valores fueron introducidos anteriormente.", "Error!",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource() == nuevoRecurso) {
			VSecundaria vs = new VSecundaria(this, true);
		} else if (e.getSource() == mostrar) {
			VMostrar vm = new VMostrar(this, true);
		} else if (e.getSource() == baja) {
			String txtcodigo="";
			int codigo=0;
			txtcodigo=JOptionPane.showInputDialog(null, "Introduzca el código del producto que desea dar de baja:");
			try {
			if(!txtcodigo.isEmpty()) {
				boolean codigoCorrecto= u8.practica.V2.Validaciones.validarEntero(txtcodigo, "código");
				if(codigoCorrecto) {
					codigo = Integer.parseInt(txtcodigo);
					u8.practica.V2.ProductoVideoclub.darBaja(codigo);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Operación cancelada. Debe introducir un código.");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Operación cancelada.");
			}
			
			//VBaja vb = new VBaja(this, true);
		} else if (e.getSource() == alquilar) {
			String txtcodigo="";
			int codigo=0;
			txtcodigo=JOptionPane.showInputDialog(null, "Introduzca el código del producto que desea alquilar:");
			try {
			if(!txtcodigo.isEmpty()) {
				boolean codigoCorrecto= u8.practica.V2.Validaciones.validarEntero(txtcodigo, "código");
				if(codigoCorrecto) {
					codigo = Integer.parseInt(txtcodigo);
					u8.practica.V2.ProductoVideoclub.alquilar(codigo);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Operación cancelada. Debe introducir un código.");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Operación cancelada.");
			}
			//VAlquiler va = new VAlquiler(this, true);
		} else if (e.getSource() == devolver) {
			String txtcodigo="";
			int codigo=0;
			txtcodigo=JOptionPane.showInputDialog(null, "Introduzca el código del producto que desea devolver:");
			try {
			if(!txtcodigo.isEmpty()) {
				boolean codigoCorrecto= u8.practica.V2.Validaciones.validarEntero(txtcodigo, "código");
				if(codigoCorrecto) {
					codigo = Integer.parseInt(txtcodigo);
					u8.practica.V2.ProductoVideoclub.devolver(codigo);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Operación cancelada. Debe introducir un código.");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Operación cancelada.");
			}
			//VDevolver vd = new VDevolver(this, true);
		} else if (e.getSource() == salir) {
			System.exit(0);
		}

	}

}
