/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [], nuevo_vector[];
		int tamaño;
		
		System.out.println("Introduce la cantidad de posiciones que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		Vectores.pedir_valores(array_numeros, tamaño);
		
		nuevo_vector = new int[tamaño];
		
		for (int i = 0; i < nuevo_vector.length; i++) {
			nuevo_vector[i] = array_numeros[(array_numeros.length-1)-i];
		} 
		
		Vectores.mostrar_valores(nuevo_vector, tamaño);
		
		entrada.close();

	}

}
