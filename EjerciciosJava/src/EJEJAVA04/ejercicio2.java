/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [];
		int tamaño, menor;
		
		System.out.println("Introduce un valor para mostrar todas las entradas del vector que sean menores que dicho numero");
		menor = entrada.nextInt();
		
		System.out.println("Introduce la cantidad de numeros que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		Vectores.pedir_valores(array_numeros, tamaño);
		
		System.out.println("El resultado es: ");
		
		for(int i=0; i<array_numeros.length; i++) {
			
			if(array_numeros[i]<menor) {
			System.out.println(array_numeros[i]);
			}
		}
		
		entrada.close();

	}

}
