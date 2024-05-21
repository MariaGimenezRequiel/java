/**
 * 
 */
package u5.tareas;

/**
 * @author MARIA REQUIEL
 *
 */
public class Coche {
	/*
	 * Realizar un proyecto en Java que permita gestionar coches.
	 * 
	 * Crear una clase Coche con los atributos una matrícula, color, alerones,
	 * marca, modelo y debemos de saber si está alquilado o no.
	 * 
	 * Crear mínimo un constructor por defecto y otro en el que se le pasen todos
	 * los parámetros.
	 * 
	 * Crear los métodos get/set para todos los atributos.
	 * 
	 * Crear otra clase, Principal donde en el método main crearemos 2 objetos
	 * Coche. Uno alquilado y otro no.
	 * 
	 * Ha venido el cliente y ha devuelto el coche alquilado.
	 */
	
	// Creo atributos
	 private String matricula;
	 private String color;
	 private int alerones;
	 private String marca;
	 private String modelo;
	 private boolean alquilado;
	 
			 // Creo constructores
			 public Coche(String matricula) {
				 this.matricula= matricula;
			 }
			 public Coche(String matricula, String color, int alerones, String marca, String modelo, boolean alquilado) {
				 this.matricula=matricula;
				 this.color= color;
				 this.alerones=alerones;
				 this.marca=marca;
				 this.modelo= modelo;
				 this.alquilado=alquilado;
			 }
			 
			 public Coche() {
				 
			 }
	 
				 // Creo métodos get y set
				public String getMatricula() {
					return matricula;
				}
				public void setMatricula(String matricula) {
					this.matricula = matricula;
				}
				public String getColor() {
					return color;
				}
				public void setColor(String color) {
					this.color = color;
				}
				public int getAlerones() {
					return alerones;
				}
				public void setAlerones(int alerones) {
					this.alerones = alerones;
				}
				public String getMarca() {
					return marca;
				}
				public void setMarca(String marca) {
					this.marca = marca;
				}
				public String getModelo() {
					return modelo;
				}
				public void setModelo(String modelo) {
					this.modelo = modelo;
				}
				public boolean isAlquilado() {
					return alquilado;
				}
				public void setAlquilado(boolean alquilado) {
					this.alquilado = alquilado;
				}
	 
	
	 
	
	
}
