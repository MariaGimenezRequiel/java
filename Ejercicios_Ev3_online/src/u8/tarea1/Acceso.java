package u8.tarea1;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Acceso extends JFrame {
	JLabel eUsuario, eContra;
	JTextField tUsuario;
	JPasswordField tContra;
	JCheckBox recordatorio;
	JButton boton;
	public Acceso() {
		super("Formulario de acceso");
		this.setLayout(null);
		
		// componentes
		eUsuario= new JLabel("Usuario:");
		eUsuario.setBounds(40, 20, 100, 25);
		this.add(eUsuario);
		
		eContra= new JLabel("Contraseña:");
		eContra.setBounds(40, 60, 100, 25);
		this.add(eContra);
		
		tUsuario= new JTextField();
		tUsuario.setBounds(160, 20, 200, 25);
		this.add(tUsuario);
		
		tContra= new JPasswordField();
		tContra.setBounds(160, 60, 200, 25);
		this.add(tContra);
		
		recordatorio= new JCheckBox("Recordatorio de usuario");
		recordatorio.setBounds(160,100, 200 ,25);
		this.add(recordatorio);
		
		boton= new JButton("Aceptar");
		boton.setBounds(200, 140, 100, 30);
		this.add(boton);
		
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		Acceso a= new Acceso();
	}

}
