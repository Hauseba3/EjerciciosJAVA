/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String cadena = new String();
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();
		
		char[] vectorCadena = cadena.toCharArray();
		
		for(int i=0;i<vectorCadena.length;i++) {
			
			if(vectorCadena[i]==' ') {
				vectorCadena[i] = '*';
			}
		}
		
		System.out.println(vectorCadena);
		entrada.close();

	}

}
