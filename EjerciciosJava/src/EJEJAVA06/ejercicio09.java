/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio09 {

	/**
	 * Pedir una frase y un carácter, escribir en pantalla la frase inicial pero sólo hasta la primera 
	 * aparición del carácter dado (sin incluirlo). No se puede utilizar indexOf.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		//String letra;
		int posicion=-1;
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();
		System.out.println("Introduce un caracter:");
		char letra = entrada.nextLine().charAt(0);
		
		//char CharLetra = letra.charAt(0);
		char[] vectorCadena = cadena.toCharArray();
		
		for(int i=0; i<vectorCadena.length && posicion==-1; i++) {
			
			if(vectorCadena[i]==letra) {
				posicion = i;
			}
		}
		
		for (int i = 0; i < posicion; i++) {
			System.out.printf("%c",vectorCadena[i]);
		}
		
		entrada.close();

	}

}
