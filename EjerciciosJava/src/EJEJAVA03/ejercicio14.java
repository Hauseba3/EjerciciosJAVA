/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2, n = 0, resto = 0;
		
		System.out.println("Introduce dos numeros naturales:");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		do {
			resto = num1 - num2;
			num1 = resto;
			n++;
		}
		while (num2 < resto);
		
		System.out.println("El cociente de la division es " + n + " y el resto es " + resto);
		
		entrada.close();

	}

}
