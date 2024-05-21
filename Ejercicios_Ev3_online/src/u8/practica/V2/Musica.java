package u8.practica.V2;

import java.time.LocalDate;

import javax.swing.JOptionPane;



/**
 * @author MARIA REQUIEL
 *
 */
public class Musica extends ProductoVideoclub {

	private String nombreGrupo;
	private int year;

	public Musica() {
		super();
	}

	public Musica(int codigo, String titulo, int numEjemplares, String nombreGrupo, int year) {
		super(codigo, titulo, numEjemplares);
		this.nombreGrupo = nombreGrupo;
		this.year = year;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Musica [nombreGrupo=" + nombreGrupo + ", year=" + year + ", código=" + getCodigo() + ", título="
				+ getTitulo() + ", número de ejemplares=" + getNumEjemplares() + "]";
	}

	public static void crearMusicaFicticia() {
		Musica m1 = new Musica(7, "Anunciado en televisión", 8, "Pignoise", 2006);
		ProductoVideoclub.getListaProductos().add(m1);
		Musica m2 = new Musica(8, "Estopa", 2, "Estopa", 2001);
		ProductoVideoclub.getListaProductos().add(m2);
		Musica m3 = new Musica(9, "Vivir al revés", 7, "Despistaos", 2007);
		ProductoVideoclub.getListaProductos().add(m3);

	}
	public static boolean validarYear(int num) {

		int actualYear=obtenerAnioActual();
		String msgError="Error! En el campo año, debe introducir valores entre los números: "+1900+" y "+actualYear+".";
		boolean correcto= false;
				 if(num<1900 || num>actualYear) {
					 JOptionPane.showMessageDialog(null, msgError,"Error!!", JOptionPane.ERROR_MESSAGE);
					 correcto=false;
					}else {
						correcto=true;	
					}
				 return correcto;
	}
	
	public static int obtenerAnioActual() {
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        return anioActual;
    }
}
