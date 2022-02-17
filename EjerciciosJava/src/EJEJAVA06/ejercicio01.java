/**
 * 
 */
package EJEJAVA06;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio01 {

	/**
	 * Pedir al usuario una cadena y ver si comienza por H
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = entrada.nextLine();
		
		//char primerCaracter = cadena.charAt(0);
		
		if(cadena.charAt(0)=='H') {
			System.out.println("La cadena introducida comienza por H");
		} else {
			System.out.println("La cadena introducida no comienza por H");
		}
		
		entrada.close();
		

	}

}
