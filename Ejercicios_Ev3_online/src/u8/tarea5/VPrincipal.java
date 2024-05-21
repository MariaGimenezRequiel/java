package u8.tarea5;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VPrincipal extends JFrame implements ActionListener {
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 400;
	private static final String WINDOW_TITLE = "MENÚ";

	private static final String BUTTON_LABEL_CREAR = "Crear película";
	private static final String BUTTON_LABEL_CARGAR = "Cargar películas en fichero";
	private static final String BUTTON_LABEL_MOSTRAR = "Mostrar títulos";
	private static final String LABEL_ENUNCIADO = "Seleccione una de las siguientes opciones:";
	private static final String BUTTON_LABEL_SALIR = "Salir";
	
	private JPanel panel1, panel2;
	private JLabel txt;
	private JButton crear, cargar, mostrar, salir;
	public VPrincipal() {
		// PANEL 1,contenedor principal del frame, y distribucion

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(10, 10));
		this.setContentPane(panel1);
		
		// componentes del panel1
		txt = new JLabel(LABEL_ENUNCIADO);
		panel1.add(txt, BorderLayout.NORTH);

		salir = new JButton(BUTTON_LABEL_SALIR);
		panel1.add(salir, BorderLayout.SOUTH);
		salir.addActionListener(this);
		
		
		// panel y sus componentes
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3, 0, 30, 50));

		crear = new JButton(BUTTON_LABEL_CREAR);
		panel2.add(crear);
		crear.addActionListener(this);

		cargar = new JButton(BUTTON_LABEL_CARGAR);
		panel2.add(cargar);
		cargar.addActionListener(this);

		mostrar = new JButton(BUTTON_LABEL_MOSTRAR);
		panel2.add(mostrar);
		mostrar.addActionListener(this);
		
		// por último, añadimos el panel 2 al principal
		panel1.add(panel2, BorderLayout.CENTER);
		
		
		this.setTitle(WINDOW_TITLE);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		VPrincipal vp= new VPrincipal();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ObjectOutputStream fichero=null;
		if(e.getSource()==crear) {
			VCrear vc= new VCrear(this,true);
		}else if(e.getSource()==cargar) {
			//creamos el fichero
			 fichero= Fichero.crearFichero("C:/MisPeliculas.dat");
			 boolean guardado= Fichero.guardarEnFichero(fichero);
				if(guardado) {
					JOptionPane.showInternalMessageDialog(null, "Datos guardados correctamente.","Operación realizada",JOptionPane.INFORMATION_MESSAGE);
					
					Pelicula.getMiLista().clear(); //limpio la lista para volver a utilizarla
				}else {
					JOptionPane.showInternalMessageDialog(null, "No se han podido guardar los datos en el fichero.","Operación cancelada",JOptionPane.ERROR_MESSAGE);
				}
		}else if(e.getSource()==mostrar) {
			ArrayList<Pelicula>listaLeer= Fichero.leerFichero("C:/MisPeliculas.dat");
			String lista="";
			if(!listaLeer.isEmpty()) {
				for (Pelicula p : listaLeer) {
					lista=lista+p.toString()+"\n";
				}
				// creamos la ventana mostrar
				VMostrar vm= new VMostrar(lista);
			}else {// si no se ha cargaro nada en el array
				JOptionPane.showMessageDialog(null, "La lista está vacía.");				
			}
		}else if(e.getSource()==salir) {
			
			System.exit(0);
		}
		
		
	}

}
