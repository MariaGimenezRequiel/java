package u2.tareas;

public class Areas {
	/**	Realizar un programa en Java que calcule el área del cuadrado y el del círculo. Mostrar los resultados por consola.

    Area cuadrado = lado * lado = lado2

    Area círculo = PI * r2

** Utilizar la función POW*/
	
	
	public static void main(String[] args) {
	// Calculamos el área para un cuadrado de Lado=5.
 
	int lado= 5;
	int resultado = (int) Math.pow(lado, 2);
	System.out.println("Área del cuadrado= L^2"+'\n'+ "Lado= "+lado + '\n'+ "A= "+ lado +"^2= " + resultado);
		
	//Calculamos el área para un círculo de radio= 3.
	
	int radio= 3;
	double circulo= (double)Math.pow(radio,2); 
	double pi= (double)Math.PI;
	double areacirculo= circulo * pi;
	System.out.println("Área del círculo= PI * r2"+ '\n'+ "radio= "+radio+ '\n'+ "A= "+circulo+ " x "+ pi +"= "+areacirculo);
	}

}
