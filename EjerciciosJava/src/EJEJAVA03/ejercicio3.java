/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num, resultado, x =1;
		
		System.out.println("Introduce un numero del 1 al 10");
		num = entrada.nextInt();
		
		
		if (num >= 1 && num <= 10) {
			do {
				resultado = num*x;
				System.out.println(num + "x" + x + "=" + resultado);
				x++;
			} while (x <= 10);
		
		} else {
			System.out.println("ERROR");
		}
		
		entrada.close();

	}

}
