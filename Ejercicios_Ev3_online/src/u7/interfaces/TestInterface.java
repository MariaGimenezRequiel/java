package u7.interfaces;

import java.util.ArrayList;

public class TestInterface {

	public static void main(String[] args) {
	ArrayList <Figura>listaFiguras=new ArrayList<>();
		Figura cuadrado1= new Cuadrado(7.7f);
		listaFiguras.add(cuadrado1);
		Figura cuadrado2= new Cuadrado(2);
		listaFiguras.add(cuadrado2);
		
		Figura circulo1= new Circulo(3.7f);
		listaFiguras.add(circulo1);
		Figura circulo2= new Circulo (6.3f);
		listaFiguras.add(circulo2);
		
		Figura rectangulo1= new Rectangulo(9,3f);
		listaFiguras.add(rectangulo1);
		Figura rectangulo2= new Rectangulo (3,5f);
		listaFiguras.add(rectangulo2);
		
		float areaTotal=0;
		for (Figura figura : listaFiguras) {
			areaTotal= areaTotal + figura.area();
		}
		System.out.println("Tenemos un total de "+listaFiguras.size()+" figuras y el total de la suma de sus áreas es de "+areaTotal+" uds cuadradas.");
		
		
		

	}

}
