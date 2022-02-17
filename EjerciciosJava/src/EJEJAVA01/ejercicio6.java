/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double km,metros;
		
		System.out.println("Introduce una velocidad en km/h: ");
		Scanner entrada = new Scanner (System.in);
		
		km = entrada.nextDouble();
		metros = km*(5.0/18);
		
		System.out.println("La velocidad en m/s es: " + metros);
		
		entrada.close();

	}

}
