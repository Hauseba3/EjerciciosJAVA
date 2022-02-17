/**
 * 
 */
package EJEJAVA03;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num, suma = 0;
		
		System.out.println("Introduce un numero entero:");
		num = entrada.nextInt();
		
		for (int i = 1; i <= num; i++) {
			suma = suma + i;
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		
		entrada.close();
		

	}

}
