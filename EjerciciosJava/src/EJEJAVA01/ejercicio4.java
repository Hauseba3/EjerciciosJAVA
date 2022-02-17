/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner; 
/**
 * @author Jose
 *
 */
public class ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float grados, farenheit;
		
		System.out.println("Introduzca los grados centigrados: ");
		Scanner entrada = new Scanner (System.in);
		
		grados = entrada.nextFloat();
		farenheit = 32 + (9*(grados/5));
		
		System.out.println("Los grados Fahrenheit son: " + farenheit);
		
		entrada.close();

	}

}
