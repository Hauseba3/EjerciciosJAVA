/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Introduce un numero entero");
		num = entrada.nextInt();
		
		for (int i = 2; i < num && primo; i = i + 2) {
			
			if (num%i==0) {
				primo = false;
			} 
		}
		
		if (primo) {
			System.out.println("El numero introducido es primo");
		} else {
			System.out.println("El numero introducido no es primo");
		}
		
		entrada.close();
		

	}

}
