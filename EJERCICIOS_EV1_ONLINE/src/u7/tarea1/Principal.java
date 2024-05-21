package u7.tarea1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <SeleccionFutbol>misEquipos=new ArrayList <>();
		
		SeleccionFutbol e1= new SeleccionFutbol(1, "Pepe", "García", 40);
		misEquipos.add(e1);
		Futbolista f1=new Futbolista(2, "Iker", "Casillas", 35, 1, "Portero");
		misEquipos.add(f1);
		Masajista m1=new Masajista(3, "Pilar", "Cabrera", 28, "Fisio", 2);
		misEquipos.add(m1);
		Entrenador ent1= new Entrenador(4, "Lorenzo", "Camacho", 45, "Real Murcia");
		misEquipos.add(ent1);
		
		for (SeleccionFutbol equipo : misEquipos) {
			System.out.println(equipo.toString());
			equipo.concentrarse();
			
			// para entrar a los métodos específicos de las clases hijas
	
			if(equipo instanceof Masajista) {
				((Masajista) equipo).darMasaje();
			}else if(equipo instanceof Futbolista) {
				((Futbolista) equipo).jugarPartido();
			}else if(equipo instanceof Entrenador) {
				((Entrenador) equipo).dirigirEntrenamiento();
			}
			System.out.println("-------------------");
			
		}
	}

}
