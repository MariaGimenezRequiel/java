package u5.tareas;

import java.util.ArrayList;

public class GrupoMusical {
	/*
	 * CREAR CLASE GRUPO MUSICAL con los atributos:
	 * 
	 * nombreGrupo (String), componentes (Array de musicos), web (String),
	 * AnyoCreacion (int).
	 */
	
	// atributos
	private String nombreGrupo;
	private ArrayList <Musico> componentes= new ArrayList <>();
	private String web;
	private int anyoCreacion;
	
	
	
	// constructores
	public GrupoMusical () {
			
	}
		
	public GrupoMusical (String nombreGrupo) {
		this.nombreGrupo= nombreGrupo;
	}
		
	
	
	public GrupoMusical(String nombreGrupo, ArrayList<Musico> componentes, String web, int anyoCreacion) {
		super();
		this.nombreGrupo = nombreGrupo;
		this.componentes = componentes;
		this.web = web;
		this.anyoCreacion= anyoCreacion;
	}

	// Generate getters and setters methods
	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public ArrayList<Musico> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Musico> componentes) {
		this.componentes = componentes;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	public int getAnyoCreacion() {
		return anyoCreacion;
	}

	public void setAnyoCreacion(int anyoCreacion) {
		this.anyoCreacion = anyoCreacion;
	}

	//Generate to string method
	
	public String toString() {
		return "GrupoMusical [nombreGrupo=" + nombreGrupo + ", componentes=" + componentes + ", web=" + web + "]";
	}

	
	
	public static GrupoMusical crearGrupo (int dato) {
		String nombreGrupo= PrincipalGrupoMusical.pedirletras("Introduzca el nombre del grupo musical: ", "^[a-zA-Z]+(?: [a-zA-Z]+)*$", "Error! El nombre del grupo musical no es válido. ");
		
		int numeroComponentes= PrincipalGrupoMusical.pedirNumeroCondicion("Introduzca el número de componentes del grupo: ", dato<=0, "Error! Debe introducir un número entero mayor que 0.");
		ArrayList <Musico> componentes= new ArrayList <>();
		for (int i=0; i<numeroComponentes;i++) {
			Musico m= Musico.crearMusico(dato);
			componentes.add(m);
		}
		
		String web= PrincipalGrupoMusical.pedirletras("Introduzca la dirección web del grupo musical: ", "^(https?://)?[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-z]{2,}(:[0-9]{1,5})?(/[a-zA-Z0-9]+)*(\\?[a-zA-Z0-9]+=[a-zA-Z0-9]+(&[a-zA-Z0-9]+=[a-zA-Z0-9]+)*)?$\r\n", "Error! La web introducida no es válida.");
	
		
		int anyoCreacion= PrincipalGrupoMusical.pedirNumeroCondicion("Introduzca el año de creación del grupo: ",dato <1600 ,"Error! El año introducido tiene que ser un número entero positivo mayor que 1600, es decir, la fecha de creación del primer grupo musical de la historia.")
		GrupoMusical m= new GrupoMusical(nombreGrupo, componentes, web, anyoCreacion);
		return m;
	}
	





}
