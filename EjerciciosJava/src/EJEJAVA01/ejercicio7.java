/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double cateto1, cateto2, hipotenusa;
		
		System.out.println("Introduce la longitud del primer cateto: ");
		Scanner entrada = new Scanner (System.in);
		cateto1 = entrada.nextDouble();
		
		System.out.println("Introduce la longitud del segundo cateto: ");
		Scanner entrada2 = new Scanner (System.in);
		cateto2 = entrada2.nextDouble();
		
		hipotenusa = Math.sqrt( (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)) );
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		
		entrada.close();
		entrada2.close();

	}

}
