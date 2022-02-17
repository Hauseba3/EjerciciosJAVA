/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio10 {

	/**
	 * Repite el ejercicio anterior usando indexOf.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		String letra;
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();
		System.out.println("Introduce un caracter:");
		letra = entrada.nextLine();
		
		int posicion = cadena.indexOf(letra);
		
		char[] vectorCadena = cadena.toCharArray();
		
		for (int i = 0; i < posicion; i++) {
			System.out.printf("%c",vectorCadena[i]);
		}
		
		entrada.close();

	}

}
