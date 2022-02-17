/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [];
		int tamaño, inicial, ultima;
		
		System.out.println("Introduce posicion inicial y final del vector que quieres que se muestre");
		inicial = entrada.nextInt();
		ultima = entrada.nextInt();
		
		System.out.println("Introduce la cantidad de numeros que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		
		Vectores.pedir_valores(array_numeros, tamaño);
		
		System.out.println("El resultado es: ");
		
		for(int i=inicial-1; i<ultima; i++) {
			System.out.println(array_numeros[i]);
		}
		
		entrada.close();
		

	}

}
