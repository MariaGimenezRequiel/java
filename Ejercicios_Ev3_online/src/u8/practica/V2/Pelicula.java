package u8.practica.V2;



/**
 * @author MARIA REQUIEL
 *
 */
public class Pelicula extends ProductoVideoclub {

	private String director;
	private String interpretes;
	private String genero;

	public Pelicula() {
		super();
	}

	public Pelicula(int codigo, String titulo, int numEjemplares, String director, String interpretes, String genero) {
		super(codigo, titulo, numEjemplares);
		this.director = director;
		this.interpretes = interpretes;
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getInterpretes() {
		return interpretes;
	}

	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula [director=" + director + ", interpretes=" + interpretes + ", género=" + genero + ", código ="
				+ getCodigo() + ", título=" + getTitulo() + ", número de ejemplares=" + getNumEjemplares() + "]";
	}

	public static void crearPeliculasFicticias() {
		Pelicula p1 = new Pelicula(4, "El laberinto del fauno", 3, "Guillermo del Toro",
				"Ivana Baquero, Doug Jones, Ariadna Gil", "Fantasía");
		ProductoVideoclub.getListaProductos().add(p1);

		Pelicula p2 = new Pelicula(5, "Titanic", 8, "James Cameron", "LEonardo DiCaprio, Kate Winslet, Billy Zane",
				"Drama romántico");
		ProductoVideoclub.getListaProductos().add(p2);

		Pelicula p3 = new Pelicula(6, "El rey león", 5, "Rob Minkoff", "Jeremy Irons, James Earl, Matthew Broderick",
				"Infantil");
		ProductoVideoclub.getListaProductos().add(p3);
	}

}
