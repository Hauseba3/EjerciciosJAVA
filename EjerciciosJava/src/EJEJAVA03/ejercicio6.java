/**
 * 
 */
package EJEJAVA03;
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
		
		int num, factorial = 1;
		
		System.out.println("Introduce un numero entero: ");
		num = entrada.nextInt();
		
		while (num!=0) {
			 factorial=factorial*num; 
			 num--;
			}
		
		System.out.println("El factorial del numero es " + factorial);
		
		entrada.close();

	}

}
