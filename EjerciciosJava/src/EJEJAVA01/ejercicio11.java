/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Introduce un numero de 3 cifras: ");
		Scanner entrada = new Scanner (System.in);
		num = entrada.nextInt();
		
		System.out.println("El primer digito es: " + num/100);
		System.out.println("El segundo digito es: " + (num%100)/10);
		System.out.println("El tercer digito es: " + (num%100)%10);
		
		entrada.close();

	}

}
