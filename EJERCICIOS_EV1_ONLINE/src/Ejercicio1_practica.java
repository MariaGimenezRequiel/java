
import java.time.LocalTime;

public class Ejercicio1_practica {
//https://devs4j.com/2018/10/30/java-8-manejo-de-fechas-y-tiempo-localdate-localtime-y-localdatetime/
	   /**
    *
    * @author "María Giménez Requiel"
    *Realiza un programa que obtenga la hora actual y luego deberá mostrar el mensaje:

       buenos días, buenas tardes o buenas noches según la hora obtenida. 

Se utilizarán los rangos de horas 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. 

Sólo se tienen en cuenta las horas, los minutos no se deben tener en cuenta.
    */
	public static void main(String[] args) {
		
		LocalTime ahora = LocalTime.now();
		
        System.out.println("Ahora mismo son las: "+ahora);
        int hora= ahora.getHour(); //pasar la variable localtime a int quedandonos con la hora para poder usarlo en la estructura swicht
    
    switch (hora) {
		case 6,7,8,9,10,11,12:
			System.out.println("Buenos días");
			
			break;
		case 13,14,15,16, 17,18,19,20:
			System.out.println("Buenas tardes");
			
			break;
		case 21,22,23,24,1,2,3,4,5:
			System.out.println("Buenas noches");
			break;

	}
      
	}

}
