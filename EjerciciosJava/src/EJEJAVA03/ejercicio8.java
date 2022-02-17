/**
 * 
 */
package EJEJAVA03;
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
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.println("Introduce un numero entero:");
		num = entrada.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				System.out.println("Numero " + i);
			}
		}
		
		entrada.close();

	}

}
