package u8.tarea4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Crear un formulario con un campo "Producto" y un botón "Guardar" donde se
 * vayan recogiendo los productos que se desean comprar. Almacenar los productos
 * en un fichero "listaDeLaCompra.txt".
 * 
 * Añadir otro botón "Mostrar" que muestre todos los productos del fichero
 * "listaDeLaCompra.txt".
 */
public class Ventana extends JFrame implements ActionListener{
	private JLabel etiqueta;
	private JTextField campo;
	private JButton boton,mostrar;

	private static ArrayList<String>lista= new ArrayList();
	public Ventana() {
		
		this.setLayout(null);
		
		etiqueta= new JLabel("Nombre del producto: ");
		etiqueta.setBounds(20, 20, 150, 25);
		this.add(etiqueta);
		
		campo= new JTextField();
		campo.setBounds(160, 20,100, 25);
		this.add(campo);
		
		boton= new JButton("Guardar");
		boton.setBounds(20, 60, 100, 25);
		this.add(boton);
		boton.addActionListener(this);
		
		mostrar= new JButton("Mostrar");
		mostrar.setBounds(160, 60, 100, 25);
		this.add(mostrar);
		mostrar.addActionListener(this);
		this.setTitle("Formulario");
		this.setSize(300, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		Ventana prueba= new Ventana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String productos="";
		if(e.getSource()==boton) {
			if(campo.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Error! Debe introducir un valor en el campo producto", "Error",JOptionPane.ERROR_MESSAGE);
			}else {
				String p= campo.getText();
				int opcion=JOptionPane.showConfirmDialog(null, "¿Esta seguro de que desea guardar el producto: "+p+" ?");
				if(opcion==0) {// sí
					lista.add(p);
					
				}
				
				campo.setText("");
				
			}
		}
		if(e.getSource()==mostrar) {
			for (String p : lista) {
				productos= productos+p+"\n";
			}
			Fichero.escribir("C:/listaDeLaCompra.txt", productos);
			String txt=Fichero.leer("C:/listaDeLaCompra.txt");
			VSecundaria vs= new VSecundaria(txt);
		}
		
		
		
	}

}
