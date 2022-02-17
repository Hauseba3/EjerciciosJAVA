/**
 * 
 */
package EJEJAVA02;
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
		
		Scanner entrada = new Scanner (System.in);
		
		int año;
		
		System.out.println("Introduce un año:");
		año = entrada.nextInt();
		
		if (año%4==0) {
			if ( ((año%100)==0)&&((año%400)!=0) ){
				System.out.println("El año " + año + " no es bisiesto");
			}
			else {
				System.out.println("El año " + año + "  es bisiesto");
			}
			System.out.println("El año " + año + " es bisiesto");
		}
		else {
			System.out.println("El año " + año + " no es bisiesto");
		}
		
		entrada.close();

	}

}
