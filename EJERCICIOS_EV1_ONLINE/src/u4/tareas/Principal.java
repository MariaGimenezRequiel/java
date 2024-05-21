
package u4.tareas;

/**
 * @author MARIA REQUIEL
 *
 */
public class Principal {

	
	public static void main(String[] args) {
	Cuenta c1= new Cuenta ("Pepe", 3000); // he creado el objeto c1
	c1.ingreso(1000); // UNA VEZ QUE ME HE CREADO EL OBJETO PUEDO ACCEDERA LOS MÉTODOS DE LA CLASE QE NO SON STATIC
	c1.reintegro(50);
	Cuenta.mostrar();
	
	Cuenta c2=new Cuenta("Alejandro");
	System.out.println(c1.getTitular()+" - "+ c1.getSaldo());
	System.out.println(c2.getTitular()+" - "+ c2.getSaldo());
	
	Cuenta c3=new Cuenta(); //con el constructor vacío
	c3.setSaldo(1000);
	c3.setTitular("Manolo");
	
	}
	
	

}
