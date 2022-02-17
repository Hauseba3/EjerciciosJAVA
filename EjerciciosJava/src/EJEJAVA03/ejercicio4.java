/**
 * 
 */
package EJEJAVA03;
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
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Introduce un numero entero:");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce otro numero entero");
		num2 = entrada.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i%2!=0) {
					System.out.println("Numero " + i);
				}
			}
		} else {
			System.out.println("ERROR");
		}
		
		entrada.close();
		
		

	}

}
