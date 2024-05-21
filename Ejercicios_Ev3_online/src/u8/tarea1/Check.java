package u8.tarea1;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Check extends JFrame{
	JCheckBox check1, check2;
	public Check() {
		super("Mi primer JChek");
		this.setLayout(null); // importante para que salgan los componentes dentron de la ventana
		// componente
		check1= new JCheckBox("Acepto");
		check1.setBounds(60, 20, 150, 25); // importante
		
		check2= new JCheckBox("No acepto");
		check2.setBounds(250, 20, 150, 25); // importante
		this.add(check1);
		this.add(check2);
		
		this.setSize(400, 100);	
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Check c1= new Check();

	}

}
