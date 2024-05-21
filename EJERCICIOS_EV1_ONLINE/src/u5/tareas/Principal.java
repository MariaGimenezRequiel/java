/**
 * 
 */
package u5.tareas;

/**
 * @author MARIA REQUIEL
 *
 */
public class Principal {
	/*Crear otra clase, Principal donde en el método main crearemos 2 objetos
	 * Coche. Uno alquilado y otro no.
	 * 
	 * Ha venido el cliente y ha devuelto el coche alquilado.
	 */
	public static void main(String[] args) {
		// creamos el objeto coche c1 no alquilado
		Coche c1= new Coche("265413 dss", "rojo", 1, "seat", "arona", false);
		// creamos el objeto coche c2 alquilado
		Coche c2= new Coche("215431 fvy", "plata", 1, "seat", "ibiza", true);
		
		// cambiamos el atributo del c2 de alquilado a no alquilado
		System.out.println(c2.isAlquilado());
		
		c2.setAlquilado(false);
		System.out.println(c2.isAlquilado());
		
		
	}

}
