/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [];
		int tamaño, mayor;
		
		System.out.println("Introduce un valor para mostrar todas las entradas del vector que sean menores que dicho numero");
		mayor = entrada.nextInt();
		
		System.out.println("Introduce la cantidad de numeros que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		Vectores.pedir_valores(array_numeros, tamaño);
		
		int posicion=0;
		
		for(int i=0; i<array_numeros.length && array_numeros[i]<=mayor; i++) {
			posicion = i;
		}
		
		System.out.println("El resultado es: ");
		
		for(int j = posicion; j<array_numeros.length; j++) {
			System.out.println(array_numeros[j]);
		}
		
		entrada.close();
		

	}

}
