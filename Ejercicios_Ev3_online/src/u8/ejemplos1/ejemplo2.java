package u8.ejemplos1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ejemplo2 extends JFrame implements ActionListener{
	private JTextField campoNombre; // como tengo declarado a nivel de clase puedo usar esa variable en otros métodos de la clase
	private JButton jb;
	
	public ejemplo2(String titulo, Color color) {
		super(titulo);
		JPanel jp= new JPanel();
		jp.setBackground(color);// establecemos color del lienzo
		
		jp.setLayout(new FlowLayout());//establecemos esquema
		
		campoNombre= new JTextField(10);
		jp.add(campoNombre);
		//JLabel etiqueta= new JLabel("Texto inicial");
		//jp.add(etiqueta);
		
		jb= new JButton("Pulsar");
		jb.setName("btnMostrar"); // con el método set name le da un nombre sobre el componente
 		
		jb.addActionListener(this); //this porque el método está implementado en esta misma clase
									// con esto he puesto un escuchador y cuando se pulse el boton va a llamar al método actionListener
									// para que se ejecute lo que hay dentro del método actionPerformend
		jp.add(jb);
		
		this.setContentPane(jp);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {  // este método es invocado cuando se produzca un evento y el escuchador de java estará atento para cuando se produzca
													//una acción sobre el objeto al que le vamos añadir el escuchador, se ejecute este metodo actionPermformed
		System.out.println("Se ha pulsado el botón!!");
		System.out.println(campoNombre.getText());
		campoNombre.setEnabled(false); // una vez pulsado el boton el campo nombre se desactiva
	}
	
	public static void main(String[] args) {
		ejemplo2 v= new ejemplo2("Mi ventana",Color.BLUE );
	}

}
