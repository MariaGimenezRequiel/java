/**
 * Haz una clase llamada Persona con los siguientes atributos: 

nombre, 
edad, 
DNI, 
sexo (H hombre, M mujer), 
peso, 
altura.
No queremos que se accedan directamente a ellos (crear los métodos get/set). 

Piensa que modificador de acceso es el más adecuado (public/private), también su tipo. 

Si quieres añadir algún atributo más puedes hacerlo.

Se implementarán varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
Crear una clase Principal  donde se solicitarán los datos de 5 personas y se irán insertando en un array "listaPersonas".

Por último, recorrer el array creado anteriormente e id mostrando el nombre y edad de todas las personas del array.
 */
/**
 * Implementar los métodos:

- esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

- comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H. No será visible al exterior.

- toString: devuelve toda la información del objeto.

Por último en la clase Principal, 
se solicitará que introduzca 5 Personas en un array y 
luego mostrará los nombres de las personas que son mayores de edad por un lado
 y por otro las que no lo son.
 */
package u5.tareas;

import java.util.InputMismatchException;


/**
 * @author MARIA REQUIEL
 *
 */
public class Persona {
	
			// Creo atributos
			private String nombre;
			private int edad; 
			private String DNI; 
			private String sexo;  // H o M
			private double peso;
			private double altrua;
			
			
			// Creo constructores por defecto
			public Persona() {
				
			}
			
			// Un constructor con el nombre, edad y sexo, el resto por defecto.
						
			public Persona(String nombre, int edad, String sexo) {
						this.nombre=nombre;
						this.edad=edad;
						this.sexo=sexo;
			}
 			//Un constructor con todos los atributos como parámetro.
			
			public Persona(String nombre, int edad,String DNI, String sexo,double peso, double altura ) {
						this.nombre=nombre;
						this.edad=edad;
						this.DNI= DNI;
						this.sexo=sexo;
						this.peso=peso;
						this.altrua=altura;
						
			}
			
			// Generar métodos get and set de cada atributo
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public int getEdad() {
				return edad;
			}

			public void setEdad(int edad) {
				this.edad = edad;
			}

			public String getDNI() {
				return DNI;
			}

			public void setDNI(String dNI) {
				DNI = dNI;
			}

			public String getSexo() {
				return sexo;
			}

			public void setSexo(String sexo) {
				this.sexo = sexo;
			}

			public double getPeso() {
				return peso;
			}

			public void setPeso(double peso) {
				this.peso = peso;
			}

			public double getAltrua() {
				return altrua;
			}

			public void setAltrua(double altrua) {
				this.altrua = altrua;
			}
			
			
		@Override
			public String toString() {
				return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso="
						+ peso + ", altrua=" + altrua + "]";
			}

		public static Persona solicitarDatos(){  // Persona es un tipo de dato abstrato que luego iré almacenando en la clase principal en el array
				
			String pedirNombre= "Introduzca su nombre";
			String expresionNombre="[A-Za-zñÑáéíóúÁÉÍÓÚ\\s]+";
			String msgErrorNombre= "Error! El nombre introducido no es válido, vuelva a intentarlo.";
			
			String nombre= PrincipalPersona.obtenerLetras(pedirNombre,expresionNombre ,msgErrorNombre );
			
			String pedirEdad= "Introduzca su edad: ";
			String msgErroEdad= "Error! Tiene que introducir un número entero.";
			
			int edad = PrincipalPersona.obtenerNumero(pedirEdad, msgErroEdad );
			
			
			String pedirDNI= "Introduzca su DNI: ";
			String expresionDNI="[0-9]{8}[A-Z a-z]";
			String msgErrorDNI= "Formato de DNI inválido.";
			
			String DNI= PrincipalPersona.obtenerLetras(pedirDNI,expresionDNI ,msgErrorDNI );
			
			String pedirSexo= "Introduzca la letra H(si es hombre) o M (si es mujer): ";
			String expresionSexo="[HhMm]{1}";
			String msgErrorSexo= "Error, solo puede introducir las letras M(mujer) o H (hombre)";
			
			String sexo= PrincipalPersona.obtenerLetras(pedirSexo, expresionSexo,msgErrorSexo );
			
			
			String pedirPeso= "Introduzca su peso: ";
			String msgErrorPeso= "Error! Tiene que introducir un valor numérico.";
			
			double peso= PrincipalPersona.obtenerDecimal(pedirPeso, msgErrorPeso);
			
			String pedirAltura= "Introduzca su altura: ";
			
			double altura= PrincipalPersona.obtenerDecimal(pedirAltura, msgErrorPeso);
			
			Persona p =new Persona(nombre, edad, DNI, sexo, peso, altura);
			
			
			return p;
		}
		public boolean esMayorDeEdad() { // nesita un objeto porque no es estático
			if (this.edad<18) {
				return false;
			}else {
				return true;
			}
			
		}
		
		public  String comprobarSexo() {
			if(this.sexo.matches("hH")) {
				return "Es un hombre";
			}else {
				return "Es una mujer";
			}
					}
			
}
