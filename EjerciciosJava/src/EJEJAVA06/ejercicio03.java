/**
 * 
 */
package EJEJAVA06;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio03 {

	/**
	 * Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, 
	 * o indicar que no está si procede. No se puede usar indexOf o similar
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
		
		char CharLetra = letra.charAt(0);
		
		for(int i=0; i<cadena.length();i++) {
			
			if(CharLetra==(cadena.charAt(i))) {
				System.out.printf("El caracter %c se encuentra en la posicion %d \n",CharLetra,i);
			}
			
		}
		
		entrada.close();

	}

}
