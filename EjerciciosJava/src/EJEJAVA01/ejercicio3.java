/**
 * 
 */
package EJEJAVA01;
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
		int num, doble, triple;
		
		System.out.println("Introduce un numero: ");
		Scanner entrada = new Scanner (System.in);
		num = entrada.nextInt();
		
		doble = num*2;
		triple = num*3;
		
		System.out.println("El doble del numero es: " + doble);
		System.out.println("El triple del numero es: " + triple);
		
		entrada.close();

	}

}
