/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double radio, longitud, area;
		final double PI = 3.1416;
		
		System.out.println("Introduce el radio de la circunferencia: ");
		Scanner entrada = new Scanner (System.in);
		
		radio = entrada.nextFloat();
		
		longitud = 2*PI*radio;
		area = PI*(radio*radio);
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		
		entrada.close();

	}

}
