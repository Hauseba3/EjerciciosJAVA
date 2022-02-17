/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		System.out.println("Introduce un numero: ");
		Scanner entrada = new Scanner (System.in);
		num1 = entrada.nextInt();
		
		
		System.out.println("Introduce otro numero: ");
		Scanner entrada2 = new Scanner (System.in);
		num2 = entrada2.nextInt();
		
		System.out.print("El primer numero es: " + num1 + " el segundo numero es: " + num2);
		
		entrada.close();
		entrada2.close();

	}

}
