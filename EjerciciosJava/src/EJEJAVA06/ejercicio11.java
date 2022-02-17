/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio11 {

	/**
	 * Pedir una frase y eliminar las vocales. No se puede usar replace.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena = new String();
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();
		
		char[] vectorCadena = cadena.toCharArray();
		
		for(int i=0; i<vectorCadena.length; i++) {
			 if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){ 
			    System.out.printf("");
			  } else {
				  System.out.printf("%c",vectorCadena[i]);
			  }
			}
		
		entrada.close();

	}

}
