package u8.practica.V2;



/**
 * @author MARIA REQUIEL
 *
 */
public class Juego extends ProductoVideoclub {

	private boolean multijugador;
	private String autor;

	public Juego() {
		super();
	}

	public Juego(int codigo, String titulo, int numEjemplares, boolean multijugador, String autor) {
		super(codigo, titulo, numEjemplares);
		this.multijugador = multijugador;
		this.autor = autor;
	}

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Juego [multijugador=" + multijugador + ", autor=" + autor + ", código =" + getCodigo() + ", título ="
				+ getTitulo() + ", número de ejemplares=" + getNumEjemplares() + "]";
	}

	public static void crearJuegosFicticios() {
		Juego j1 = new Juego(1, "TOM WILSON", 2, false, "ERIC SAVIER");
		ProductoVideoclub.getListaProductos().add(j1);
		Juego j2 = new Juego(2, "Spiderman", 10, true, "STEVEN ZACK");
		ProductoVideoclub.getListaProductos().add(j2);
		Juego j3 = new Juego(3, "RACE FIGTH", 8, true, "GUILLERMO RIQUELME");
		ProductoVideoclub.getListaProductos().add(j3);
	}

}
