package u8.tarea1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Area extends JFrame {
	JTextArea area;
	JScrollPane scpanel;
	public Area() {
		super("Mi primer TextArea");
		this.setLayout(null); // importante pa que salgan bien todos los componentes
		// componente
		area= new JTextArea();
		area.setLineWrap(true);
		
		scpanel= new JScrollPane(area);
		scpanel.setBounds(20, 20, 250, 200);
		this.add(scpanel);
		
		
		
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Area a= new Area();

	}

}
