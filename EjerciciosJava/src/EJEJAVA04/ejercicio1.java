/**
 * 
 */
package EJEJAVA04;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [];
		int tamaño;
		
		System.out.println("Introduce la cantidad de numeros que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		
		for(int i = 0; i<tamaño; i++) {
			System.out.println("Introduce un numero entero para la posicion " + i);
			array_numeros[i] = entrada.nextInt();
		}
		
		Vectores.mostrar_valores(array_numeros, tamaño);
		
		System.out.println(Arrays.toString(array_numeros));
		
		entrada.close();
		
	}

}
