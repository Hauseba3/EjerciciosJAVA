/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double radio, volumen;
		
		System.out.println("Introduzca el radio de la esfera: ");
		Scanner entrada = new Scanner (System.in);
		radio = entrada.nextDouble();
		
		volumen = 4.0/3*(Math.PI)*(Math.pow(radio, 3));
		
		System.out.println("El volumen de la esfera es: " + volumen);
		
		entrada.close();

	}

}
