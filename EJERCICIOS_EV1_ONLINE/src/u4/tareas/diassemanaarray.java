package u4.tareas;

public class diassemanaarray {
	// Crear un array con los días de la semana. Recorrer el array para mostrar todos los días.
	public static void main(String[] args) {
		
		String[] listadias= {"Lunes","Martes", "Miércoles", "Jueves","Viernes","Sábado", "Domingo"};
		
		/*
		 * for(int i=0;i<listadias.length;i++) { System.out.println(listadias[i]);
		 * 
		 * }
		 */
		for (String dias : listadias) {
			System.out.println(dias);
		}

	}

}
