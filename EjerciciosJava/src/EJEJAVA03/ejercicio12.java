/**
 * 
 */
package EJEJAVA03;
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
		
		Scanner entrada = new Scanner (System.in);
		
		int num, perfecto = 0;
		
		System.out.println("Introduce un numero entero");
		num = entrada.nextInt();
		
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				perfecto = perfecto + i;
			}
		}
		
		if(num==perfecto) {
			System.out.println("El numero " + num + " es perfecto");
		} else {
			System.out.println("El numero " + num + " no es perfecto");
		}
		
		
		entrada.close();
		

	}

}
