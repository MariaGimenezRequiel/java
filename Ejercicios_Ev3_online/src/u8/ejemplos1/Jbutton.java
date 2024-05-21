package u8.ejemplos1;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Jbutton extends JFrame{
	private JButton jb;
	private JLabel etiqueta;
	private JTextField campoTexto;
	private JCheckBox check1, check2, check3;
	private JTextArea  area;
	private JScrollPane scpanel;
	
	
	public Jbutton(String titulo, Color color) {
	super (titulo);
	// panel
	JPanel jp= new JPanel();
	jp.setLayout(new FlowLayout());
	jp.setBackground(color);
	//componentes
	jb= new JButton("PULSAME");
	jb.setBounds(100, 40, 80, 25);//le damos ubicacion dentro del panel (100,40) y un tamaño de 80x25
	jp.add(jb);
	
	etiqueta= new JLabel("Usuario");
	etiqueta.setBounds(20, 100, 100, 25);
	jp.add(etiqueta);
	
	campoTexto= new JTextField(10);
	jp.add(campoTexto);
	
	area= new JTextArea("Hola, adiós, partido, sudadera");
	area.setLineWrap(true);// para que salte de linea
	
	
	
	scpanel= new JScrollPane(area);
	jp.add(scpanel);
	
	check1= new JCheckBox("COnejo");
	check2= new JCheckBox("serpiente", true);
	jp.add(check1);
	jp.add(check2);
	
	
	//frame
	this.setContentPane(jp);//relacionamos el panel con las configuraciones anteriores con el marco
	this.setSize(300, 200);
	this.setLocationRelativeTo(null);//posicionamos ventana en el centro
	this.setVisible(true);	
		
	}
	public static void main(String[] args) {
		Jbutton prueba= new Jbutton("prueba1", Color.green);

	}

}
