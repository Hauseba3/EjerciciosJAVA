/**
 * 
 */
package EJEJAVA02;
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
		
		int num1, num2, num3;
		
		System.out.println("Introduce 3 numeros enteros: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if ( ((num1 + num2) > num3) && ((num1 + num3) > num2) && ((num2 + num3) > num1) ){
			System.out.println("El triangulo introducido existe!");
		}
		else {
			System.out.println("El triangulo introducido no existe!");
		}
		
		entrada.close();

	}

}
