/**
 * 
 */
package EJEJAVA06;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio07 {

	/**
	 * Programa que reciba como entrada una cadena y un car�cter y escriba cu�ntas veces aparece 
	 * ese car�cter en la cadena. No se puede usar indexOf.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		int contador=0;
		String cadena = new String();
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();

		
		for(int i=0;i<cadena.length();i++) {
			 if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){ 
			    contador++;
			  }
			}
		System.out.println("El numero de vocales es: "+contador);
		
		entrada.close();

	}

}
