package u8.practica.V2;

import java.util.ArrayList;

import javax.swing.JOptionPane;



/**
 * @author MARIA REQUIEL
 *
 */
public class ProductoVideoclub {

	// atributos
	private int codigo;
	private String titulo;
	private int numEjemplares;

	// variable de clase
	private static ArrayList<ProductoVideoclub> listaProductos = new ArrayList<>();

	// constructores
	public ProductoVideoclub() {

	}

	public ProductoVideoclub(int codigo, String titulo, int numEjemplares) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.numEjemplares = numEjemplares;
	}

	// getters and setters methods
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public static ArrayList<ProductoVideoclub> getListaProductos() {
		return listaProductos;
	}

	public static void setListaProductos(ArrayList<ProductoVideoclub> listaProductos) {
		ProductoVideoclub.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoVideoclub [código=" + codigo + ", título=" + titulo + ", número de ejemplares=" + numEjemplares
				+ "]";
	}

	public static void crearProductoFicticio() {
		Pelicula.crearPeliculasFicticias();
		Juego.crearJuegosFicticios();
		Musica.crearMusicaFicticia();
	}

	public static void darBaja(int codigo) {
		boolean encontrado = false;
		for (ProductoVideoclub producto : listaProductos) {
			if (producto.getCodigo() == codigo) {
				encontrado = true;
				int opcion = JOptionPane.showConfirmDialog(null,
						"Está seguro de que desea dar de baja el producto: " + producto.toString() + " ?");
				if (opcion == 0) {
					listaProductos.remove(producto);
					JOptionPane.showMessageDialog(null, "Producto eliminado de la lista correctamente.",
							"Operación realizada", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "El producto no fue eliminado", "Operación cancelada",
							JOptionPane.INFORMATION_MESSAGE);
				}

				break;
			}

		}
		if (encontrado == false) {
			JOptionPane.showMessageDialog(null, "El producto con el código " + codigo + " no existe.");

		}
	}

	public static void alquilar(int codigo) {

		boolean encontrado = false;
		for (ProductoVideoclub producto : listaProductos) {
			if (producto.getCodigo() == codigo && producto.getNumEjemplares() <= 0) {
				encontrado = true;
				JOptionPane.showMessageDialog(null, "Lo sentimos. el producto " + producto.toString()
						+ " no se encuentra disponible actualmente. Vuelva a intentarlo más adelante.");

			} else if (producto.getCodigo() == codigo && producto.getNumEjemplares() > 0) {
				encontrado = true;
				int opcion = JOptionPane.showConfirmDialog(null,
						"Está seguro de que desea alquilar el producto: " + producto.toString() + " ?");
				if (opcion == 0) {
					producto.setNumEjemplares(producto.getNumEjemplares() - 1);
					JOptionPane.showMessageDialog(null, "Usted ha alquilado el producto seleccionado correctamente.",
							"Operación realizada", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "El producto no fue alquilado", "Operación cancelada",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		}
		if (encontrado == false) {

			JOptionPane.showMessageDialog(null, "El producto con el código " + codigo + " no existe.");
		}

	}

	public static void devolver(int codigo) {

		boolean encontrado = false;
		for (ProductoVideoclub producto : listaProductos) {
			if (producto.getCodigo() == codigo) {
				encontrado = true;
				int opcion = JOptionPane.showConfirmDialog(null,
						"Está seguro de que desea devolver el producto: " + producto.toString() + " ?");
				if (opcion == 0) {
					producto.setNumEjemplares(producto.getNumEjemplares() + 1);
					JOptionPane.showMessageDialog(null, "Usted ha devuelto el producto seleccionado correctamente.",
							"Operación realizada", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "El producto no fue devuelto", "Operación cancelada",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		}
		if (encontrado == false) {
			JOptionPane.showMessageDialog(null, "El producto con el código " + codigo + " no existe.",
					"Operación cancelada", JOptionPane.ERROR_MESSAGE);

		}
	}

	public static boolean codigoExiste(int codigo) {
		boolean encontrado = false;
		for (ProductoVideoclub producto : listaProductos) {
			if (producto.getCodigo() == codigo) {
				encontrado = true;
				JOptionPane.showInternalMessageDialog(null,
						"Lo sentimos. El producto con código " + codigo + " ya existe, debe introducir uno nuevo.",
						"Operación cancelada", JOptionPane.ERROR_MESSAGE);
			}
		}
		return encontrado;
	}

}
