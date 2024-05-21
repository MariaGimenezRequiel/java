package u7.interfaces;

public class Cuadrado implements Figura{ // La clase Cuadrado implementa la
	//atributos de la clase										// interface Figura
	private float lado;
	
	// constructor
	public Cuadrado (float lado) {
		this.lado=lado;
	}
	
	// método implementado

	@Override
	public float area() {
		return lado*lado;
	}

}
