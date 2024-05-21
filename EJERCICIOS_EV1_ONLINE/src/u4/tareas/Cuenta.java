/**
 * 
 */
package u4.tareas;

import java.util.ArrayList;

/**
 * @author MARIA REQUIEL
 *
 */
public class Cuenta {
// Primero vamos a declarar nuestros atributos, los atributos no deben de ser nunca publicos
	// accederemos a los mismos a través de los set y get
	private String titular;
	private double saldo;
	// para acceder a los atributos lo haremos a través de métodos en la clase principal
	
	//vamos a crear nuestro constructor
	
	public Cuenta (String titular, double saldo) {
		this.titular =titular;
		this.saldo= saldo;
	}
	// puedo crearme tantos constructores como quiera pero que los parametros de entrada sean distintos
	public Cuenta(String titular) {
		this.titular = titular;
	}
	public Cuenta () { //constructor vacío
		
	}
	public String getTitular () {
		return titular;
	}
	public void setTitular (String titular) { // con esto se cambia el nombre del titular por el que introducimos nuevo
		this.titular=titular;   //this. es el atributo de mi clase y NO el parámetro de entrada
	}
	
	
	// creamos el método
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(double cantidad) {
		saldo=saldo+cantidad;
		System.out.println(saldo);
	}
	
	// creamos el 2º método
	public void reintegro (double cantidad) {
		if(cantidad<=saldo) {    // con esta condición nos aseguramos de que si no hay dinero no pueda sacar
			saldo= saldo-cantidad;
			System.out.println(saldo);
		}else {
			System.out.println("No tiene saldo suficiente");
		}
	}
	public static void mostrar() {   //este método lleva static, entonces es el unico que puedo usar
		// en la clase principal, sin necesidad de crear un objeto
		System.out.println("Hola");
	}
	
	// los métodos privados solo se muestran a nivel de clase, hay que ponerlos publicos para llamarlos desde otra clase
}
