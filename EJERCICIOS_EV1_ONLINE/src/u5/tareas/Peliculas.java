package u5.tareas;

public class Peliculas {
	
	
	/*
	 * Crear una clase Película con los atributos (titulo, director y año)
	 * 
	 * Generar sus getter/setter
	 * 
	 * Crear constructor de la clase Película (uno o varios).
	 * 
	 * Crear una clase Principal y en el método principal (main) solicitar por
	 * teclado un nº de películas y dependiendo del número introducido solicitar los
	 * datos de esas películas e introducirlas en un array.
	 * 
	 * Por último, en el método principal recorrer el array y mostrar el título de
	 * todas las películas introducidas.
	 */
	
	// Creo atributos
				private String titulo;
				private String director; 
				private String anyo; 
				
			// Creo constructores por defecto
				public Peliculas() {
					
				}
				
			// Un constructor con todos los atributos.
							
				public Peliculas(String titulo, String director, String anyo) {
							this.titulo= titulo;
							this.director= director;
							this.anyo=anyo;
				}		
		// Creamos los métodos getters and setters

				public String getTitulo() {
					return titulo;
				}

				public void setTitulo(String titulo) {
					this.titulo = titulo;
				}

				public String getDirector() {
					return director;
				}

				public void setDirector(String director) {
					this.director = director;
				}

				public String getAnyo() {
					return anyo;
				}

				public void setAnyo(String anyo) {
					this.anyo = anyo;
				}

				// genero método toString
				
				@Override
				public String toString() {
					return "Peliculas [titulo=" + titulo + ", director=" + director + ", anyo=" + anyo + "]";
				}
				
				public static Peliculas crearPelicula() {
					String pedirNombre= "Introduzca el título de la pelicula: ";
					String expresionNombre="[0-9A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+";
					String msgErrorNombre= "Error! El título introducido no es válido, vuelva a intentarlo.";
					
					String titulo= PrincipalPersona.obtenerLetras(pedirNombre,expresionNombre ,msgErrorNombre );
					
					String pedirDirector= "Introduzca el nombre del director de la pelicula: ";
					String expresionDirector="[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+";
					String msgErrorDirector= "Error! El nombre introducido no es válido, vuelva a intentarlo.";
					
					String director= PrincipalPersona.obtenerLetras(pedirDirector,expresionDirector ,msgErrorDirector );
					
					String pedirAnyo= "Introduzca el año de lanzamiento de la película:  ";
					String expresionAnyo= "[1895-2023]"; // 1895 es cuando se proyecta la primera pelicula de la historia
					String msgErroAnyo= "Error! Tiene que introducir un número entre 1895 y 2023";
					
					String anyo= PrincipalPersona.obtenerLetras(msgErroAnyo, expresionAnyo, msgErrorDirector);
					
					Peliculas p= new Peliculas(titulo, director, anyo);
					return p;
				}

				
				
				
				
				
				
				
}
