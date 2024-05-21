package u3.tareas;

public class Ejemplofor2 {

	public static void main(String[] args) {
		// mostrar todos los números pares del 1 al 100
		for(int i=1;i<=100;i++) {
			int resultado=i%2;
			if(resultado==0) {
				System.out.println(i);
			}
			
		}

	}

}
