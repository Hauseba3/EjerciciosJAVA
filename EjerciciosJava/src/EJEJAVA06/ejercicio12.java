/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio12 {

	/**
	 * Repite el ejercicio anterior usando replace.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		
		System.out.println("Introduce una frase:");
		cadena = entrada.nextLine();
		
		String nuevaCadena = cadena.replaceAll("[a,e,i,o,u]", "");
		
		System.out.println(nuevaCadena);
		
		entrada.close();

	}

}
