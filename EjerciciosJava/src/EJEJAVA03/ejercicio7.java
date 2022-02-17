/**
 * 
 */
package EJEJAVA03;
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
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2, total = 0;
		
		System.out.println("Introduce dos numeros enteros:");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <=num2; i++) {
				if (i%7==0) {
					total = total + 1;
				}
			}
		} else {
			System.out.println("ERROR");
		}
		
		System.out.println("Hay " + total + " de multiplos de 7");
		
		entrada.close();

	}

}
