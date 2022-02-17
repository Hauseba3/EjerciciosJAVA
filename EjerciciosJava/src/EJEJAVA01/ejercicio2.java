/**
 * 
 */
package EJEJAVA01;
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
		System.out.println("Introduzca su nombre: ");
		Scanner entrada = new Scanner (System.in);
		
		String nombre = entrada.nextLine();
		
		System.out.print("Buenos dias " + nombre);
		
		entrada.close();

	}

	
	
}
