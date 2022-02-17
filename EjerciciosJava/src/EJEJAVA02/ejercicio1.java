/**
 * 
 */
package EJEJAVA02;
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
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Introduce dos numeros enteros: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
		}
			else if (num1 == num2){
			System.out.println("Los numeros son iguales");
		}
			else {
			System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
			}
		
		entrada.close();

	}

}
