/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int x = 1, num,resultado;
		
		System.out.println("Introduce un numero del 1 al 10");
		num = entrada.nextInt();
		
		while (x <=10) {
			resultado = num*x;
			System.out.println(num + "x" + x + "=" + resultado);
			x++;
		}
		
		entrada.close();

	}

}
