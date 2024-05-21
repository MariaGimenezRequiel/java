package u8.tarea1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class RadioBoton extends JFrame {
	JRadioButton radio1, radio2;
	ButtonGroup grupoBotones;
	
	public RadioBoton() {
		super("Formulario");
		this.setLayout(null);
		
		radio1= new JRadioButton("Mayor de edad");
		radio1.setBounds(20,20,200,25);
		radio2= new JRadioButton("Menor de edad");
		radio2.setBounds(300,20,200,25);
		
		grupoBotones= new ButtonGroup();
		grupoBotones.add(radio1);
		grupoBotones.add(radio2);
		
		this.add(radio1);
		this.add(radio2);

		this.setSize(500, 100);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		RadioBoton rB= new RadioBoton();

	}

}
