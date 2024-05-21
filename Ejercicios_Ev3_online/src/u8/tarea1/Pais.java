package u8.tarea1;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pais extends JFrame{
	JLabel etiquetaNombre, etiquetaPais;
	JTextField nombre;
	JComboBox lista;
	public Pais() {
		this.setLayout(null);
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		
		etiquetaNombre= new JLabel("Nombre y apellidos: ");
		etiquetaNombre.setBounds(20, 20, 200, 25);
		this.add(etiquetaNombre);
		
		nombre= new JTextField();
		nombre.setBounds(20, 60, 200, 25);
		this.add(nombre);
		
		
		etiquetaPais= new JLabel("Indique su país de origen:");
		etiquetaPais.setBounds(20, 100, 200, 25);
		this.add(etiquetaPais);
		
		lista= new JComboBox<>();
		lista.setBounds(20, 140, 200, 25);
		lista.addItem("Alemania");
		lista.addItem("España");
		lista.addItem("Francia");
		lista.addItem("Italia");
		lista.addItem("Reino Unido");
		this.add(lista);
		
		this.setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		Pais p= new Pais();

	}

}
