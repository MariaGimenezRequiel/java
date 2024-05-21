package u7.interfaces;

public class Circulo implements Figura{

	private float radio;
	public Circulo(float radio) {
		this.radio=radio;
	}
	public float area() {
		return (float) (PI*Math.pow(radio, 2));
	}
}
