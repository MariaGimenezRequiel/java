package u6.tarea1;

import java.util.ArrayList;

/**
 * 
 * @author MAngeles
 * 
 * CREAR CLASE GRUPO MUSICAL con los atributos:
 *	  nombreGrupo (String), componentes (Array de musicos), web (String), AnyoCreacion (int).
 *	CREAR LA CLASE MUSICO con los atributos:
 *	  nombre (string), edad (int) y puesto (string).
 *	Crear los constructores necesarios de ambas clases.
 *
 *	Crearse 2 grupos musicales con sus correspondientes componentes.
 *
 */

public class Principal {
	
	
	public static void crearDatosFicticios_v1() {
				
		Musico musico1 = new Musico("Leticia", 18, "batería");
		Musico musico2 = new Musico("Pilar", 20, "flauta");
		Musico musico3 = new Musico("Lorenzo", 40, "cajón flamenco");
		Musico musico4 = new Musico("Maria Eugenia", 25, "guitarra");
		
		ArrayList<Musico> componentesG1 = new ArrayList<>();
		componentesG1.add(musico1);
		componentesG1.add(musico2);
		componentesG1.add(musico3);
				
		GrupoMusical gp1 = new GrupoMusical("Los Programadores", componentesG1, "www.grupo1.es", 2023);
		
				
		ArrayList<Musico> componentesG2 = new ArrayList<>();
		componentesG2.add(musico4);
		componentesG2.add(musico3);
		
		GrupoMusical gp2 = new GrupoMusical("Los valientes", componentesG2, "www.grupo2.com", 2022);
		
	}
	
	
	public static ArrayList<GrupoMusical> crearDatosFicticios_v2() {
		
		ArrayList<GrupoMusical> misGrupos = new ArrayList<>();
		
		Musico musico1 = new Musico("Leticia", 18, "batería");
		Musico musico2 = new Musico("Pilar", 20, "flauta");
		Musico musico3 = new Musico("Lorenzo", 40, "cajón flamenco");
		Musico musico4 = new Musico("Maria Eugenia", 25, "guitarra");
		
		ArrayList<Musico> componentesG1 = new ArrayList<>();
		componentesG1.add(musico1);
		componentesG1.add(musico2);
		componentesG1.add(musico3);
				
		GrupoMusical gp1 = new GrupoMusical("Los Programadores", componentesG1, "www.grupo1.es", 2023);
		
		misGrupos.add(gp1);
		
		
		ArrayList<Musico> componentesG2 = new ArrayList<>();
		componentesG2.add(musico4);
		componentesG2.add(musico3);
		
		GrupoMusical gp2 = new GrupoMusical("Los valientes", componentesG2, "www.grupo2.com", 2022);
		
		misGrupos.add(gp2);
		
		return misGrupos;
	}
	
	public static void crearDatosFicticios_v3() {
		
		
		
		Musico musico1 = new Musico("Leticia", 18, "batería");
		Musico musico2 = new Musico("Pilar", 20, "flauta");
		Musico musico3 = new Musico("Lorenzo", 40, "cajón flamenco");
		Musico musico4 = new Musico("Maria Eugenia", 25, "guitarra");
		
		ArrayList<Musico> componentesG1 = new ArrayList<>();
		componentesG1.add(musico1);
		componentesG1.add(musico2);
		componentesG1.add(musico3);
				
		GrupoMusical gp1 = new GrupoMusical("Los Programadores", componentesG1, "www.grupo1.es", 2023);
		
		GrupoMusical.getMisGruposMusicales().add(gp1);
		
		
		ArrayList<Musico> componentesG2 = new ArrayList<>();
		componentesG2.add(musico4);
		componentesG2.add(musico3);
		
		GrupoMusical gp2 = new GrupoMusical("Los valientes", componentesG2, "www.grupo2.com", 2022);
		
		GrupoMusical.getMisGruposMusicales().add(gp2);
		

	}
	
	

	public static void main(String[] args) {
			
		crearDatosFicticios_v3();
		
		GrupoMusical g = GrupoMusical.crearGrupoMusical();
		
		GrupoMusical.getMisGruposMusicales().add(g);
		
		
		for (GrupoMusical grupoMusical : GrupoMusical.getMisGruposMusicales()) {
			
			if (grupoMusical.getAnyoCreacion()<2000) {
			
				System.out.println(grupoMusical.getNombre() + " - " + grupoMusical.getAnyoCreacion());
			}
			
		}		

	}


}
