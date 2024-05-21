package u1.ejemplos;

public class Multiplicador {
	public static int multiplica(int a, int b) {return a*b;}
	
    public static double division(double a, double b) {return a/b;}
	public static void main(String []args) {
		System.out.println(multiplica(3,2));
		System.out.println(3*2);
		
		//Lo hago declarando variables
		int a=3;
		int b=2;
		System.out.println(multiplica (a,b));
		System.out.println(a*b);

		double c=3;
		double d= 2;
		System.out.println(division(c,d));	
	}
		
		
		
	

}
