package Fomulario;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import u8.ejemplos1.ejemplo2;
public class VPrincipal extends JFrame implements ActionListener{
private JLabel eNombre,eApellidos, eEdad, eComunidad, eGenero, eObservaciones ;
private JTextField tNombre, tApellidos, tEdad;
private JComboBox lista;
private JRadioButton radio1, radio2;
private JTextArea area;
private JScrollPane scpanel;
private JButton jb, jb2;
private JCheckBox check1;
private ButtonGroup grupoBotones;
private String nombre;
private String apellidos;
private int edad;
private String comunidad;
private char sexo;
	public VPrincipal() {
		super("Formulario Alumno");
		JPanel jp= new JPanel();
		setContentPane(jp);
		//setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		this.setLayout(new GroupLayout(jp));
		// componentes, tamaño, distribucion y añadir a la ventana
		eNombre= new JLabel("Nombre: ");
		eNombre.setBounds(40,40, 100, 25);
		jp.add(eNombre);
		
		eApellidos= new JLabel("Apellidos: ");
		eApellidos.setBounds(40,80, 100, 25);
		jp.add(eApellidos);
		
		eEdad= new JLabel("Edad: ");
		eEdad.setBounds(40,120, 100, 25);
		jp.add(eEdad);
		
		
		tNombre= new JTextField();
		tNombre.setBounds(100, 40, 200, 25);
		jp.add(tNombre);
		
		tApellidos= new JTextField();
		tApellidos.setBounds(100, 80, 200, 25);
		jp.add(tApellidos);
		
		tEdad= new JTextField();
		tEdad.setBounds(100, 120, 50, 25);
		jp.add(tEdad);
		
		eComunidad= new JLabel("Indique su Comunidad Autónoma: ");
		eComunidad.setBounds(40, 160, 200, 25);
		jp.add(eComunidad);
		
		lista= new JComboBox<>();
		lista.setBounds(40, 190, 200, 25);
		lista.addItem("-");
		lista.addItem("Murcia");
		lista.addItem("Andalucía");
		lista.addItem("Valencia");
		lista.addItem("Castilla la Mancha");
		lista.addItem("Castilla y León");
		lista.addItem("Extremadura");
		lista.addItem("Madrid");
		lista.addItem("Navarra");
		lista.addItem("La Rioja");
		lista.addItem("Cataluña");
		lista.addItem("País Vasco");
		lista.addItem("Cantábria");
		lista.addItem("Asturias");
		lista.addItem("Galicia");
		lista.addItem("Islas Baleares");
		lista.addItem("Canarias");
		lista.addItem("Aragón");
		jp.add(lista);
		
		eGenero= new JLabel("Género: ");
		eGenero.setBounds(500, 40, 200, 25);
		jp.add(eGenero);
		
		grupoBotones= new ButtonGroup();
		
		radio1= new JRadioButton("Hombre");
		radio1.setBounds(650, 40, 200, 25);
		grupoBotones.add(radio1);
		jp.add(radio1);
		
		radio2= new JRadioButton("Mujer");
		radio2.setBounds(650, 80, 200, 25);
		grupoBotones.add(radio2);
		jp.add(radio2);
		
		
		
		eObservaciones= new JLabel("Otras observaiones:");
		eObservaciones.setBounds(500, 160, 200, 25);
		jp.add(eObservaciones);
		
		area= new JTextArea();
		area.setLineWrap(true);
		
		scpanel= new JScrollPane(area);
		scpanel.setBounds(650, 160, 250, 200);
		jp.add(scpanel);
		
		check1= new JCheckBox("Acepto requisitos");
		check1.setBounds(400, 400, 150, 25);
		jp.add(check1);
		
		jb= new JButton("Finalizar");
		jb.setBounds(300,440,100,30);
		jp.add(jb);
		jb.addActionListener(this);
		
		jb2= new JButton("Mostrar");
		jb2.setBounds(500,440,100,30);
		jp.add(jb2);
		jb2.addActionListener(this);
		// configuraion de la ventana
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		VPrincipal v= new VPrincipal();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {
			if(tNombre.getText().matches("^[a-zA-ZáéíóúñÁÉÍÓÚÑüÜ\s]+$")) {
				 nombre= tNombre.getText();
			}else {
				JOptionPane.showMessageDialog(null, "El campo nombre no es correcto.");
			}
	
			if(tApellidos.getText().matches("^[a-zA-ZáéíóúñÁÉÍÓÚÑüÜ\s]+$")) {
				 apellidos= tApellidos.getText();
			}else {
				JOptionPane.showMessageDialog(null, "El campo apellidos no es correcto.");
			}
			
			if(tEdad.getText().matches("^\\d+$")) {
				try {
				 edad= Integer.parseInt(tEdad.getText()); // integer.parseInt metodo para convertir en entero un string
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "El campo edad no es correcto. Introduzca un número.");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El campo edad no es correcto. Introduzca un número.");
			}
			if(lista.getSelectedItem().equals("-")) {
				JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una Comunidad Autónoma.");
			}else {
				 comunidad= lista.getSelectedItem().toString();
			}
			if(grupoBotones.getSelection()==null) {
				JOptionPane.showMessageDialog(null, "Error! Debe seleccionar un género.");
			}else {
				if(radio1.isSelected()) {
					sexo='H';
				}else {
					sexo='M';
				}
			}
			if(!check1.isSelected()) {
				JOptionPane.showMessageDialog(null, "Error! Debe aceptar los requisitos");
			}else {
				Alumno a= new Alumno(nombre, apellidos, edad, comunidad, sexo);
				Alumno.getLista().add(a);
				
			}
		}
			if(e.getSource()==jb2) {
				String listatxt="";
				for (Alumno a : Alumno.getLista()) {
					 listatxt = listatxt +  a.toString()+"\n";
				}
				VentanaSecundaria vs= new VentanaSecundaria(listatxt);
			}
		
	
		
		
		
	
	

}
}