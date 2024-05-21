package u4.tareas;

public class arraymultidimensional {
// Crear un array multidimensional de 3x2, darle valores y mostrarlos. Utilizar bucles para recorrerlo.
	public static void main(String[] args) {
		
		int [] [] numeros= {{1, 2},{3, 4},{5, 6}};
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				System.out.println("numeros ["+i+"]"+ "["+j+"] = "+numeros[i][j]);
			}
		}

	}

}
