package u3.tareas;

public class Repaso3 {
	//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
	public static void main(String[] args) {
		System.out.println("NÚMEROS DIVISIBLES ENTRE 2 Y 3 DEL 1 AL 100:");
	
		for(int i=1; i<101;i++){
			if(i%2==0 && i%3==0) {
				System.out.println(i);	
			}
		}
	}

}
