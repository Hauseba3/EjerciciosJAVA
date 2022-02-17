/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Introduce un numero de 5 cifras: ");
		Scanner entrada = new Scanner (System.in);
		num = entrada.nextInt();
		
		System.out.println("El primer digito es: " + num/10000);
		System.out.println("Los dos primeros digitos son: " + num/1000);
		System.out.println("Los tres primeros digitos son: " + num/100);
		System.out.println("Los 4 primeros digitos son: " + num/10);
		System.out.println("Los 5 digitos son: " + num);
		
		entrada.close();
	}

}
