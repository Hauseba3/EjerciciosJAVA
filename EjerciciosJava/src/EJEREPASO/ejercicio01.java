/**
 * 
 */
package EJEREPASO;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio01 {

	/**
	 * Pide un vector e indica cuantos numeros impares contiene
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vector[], tamaño;
		
		System.out.println("Introduzca el tamaño del vector:");
		tamaño = entrada.nextInt();
		
		vector = new int [tamaño];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Introduce la posicion %d del vector:",i);
			vector[i]=entrada.nextInt();
		}
		
		System.out.println("Su vector es:");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%2d",vector[i]);
		}
		System.out.println();
		
		int impares=0;
		for (int i = 0; i < vector.length; i++) {
			
			if(vector[i]%2!=0) {
				impares++;
			}
			
		}
		System.out.printf("El numero de impares es: %d ", impares);
		
		entrada.close();

	}

}
