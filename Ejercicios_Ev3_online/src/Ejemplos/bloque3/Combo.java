package Ejemplos.bloque3;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combo extends JFrame implements ItemListener{

	private JComboBox<String> lista;
	public Combo() {
		setLayout(null);
		lista= new JComboBox<String>();
		lista.setBounds(40, 20, 200, 25);
		lista.addItem("España");
		lista.addItem("Francia");
		lista.addItem("Italia");
		lista.addItem("Portugal");
		add(lista);
		lista.addItemListener(this);
		
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	
		Combo prueba= new Combo();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==lista) {
			String seleccionado= (String)lista.getSelectedItem();
			setTitle(seleccionado);
		}
		
	}

}
