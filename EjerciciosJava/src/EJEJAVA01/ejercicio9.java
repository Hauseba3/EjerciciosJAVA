/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a, b, c, s, area;
		
		System.out.println("Introduza un lado del triangulo: ");
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextDouble();
		
		System.out.println("Introduzca el siguiente lado: ");
		Scanner entrada2 = new Scanner (System.in);
		b = entrada2.nextDouble();
		
		System.out.println("Introduzca el ultimo lado: ");
		Scanner entrada3 = new Scanner (System.in);
		c = entrada3.nextDouble();
		
		s = (a+b+c)/2.0;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("El area del triangulo introducido es: " + area);
		
		entrada.close();
		entrada2.close();
		entrada3.close();

	}

}
