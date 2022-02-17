/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio4 {

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
		Vectores.pedir_valores(array_numeros, tamaño);
		
		int aux = array_numeros[0];
        for (int i = 0; i < array_numeros.length-1; i++) {
            array_numeros[i] = array_numeros[i+1];
        }
        array_numeros[array_numeros.length-1] = aux;
        
        System.out.println("El resultado de rotar el vector es: ");
        Vectores.mostrar_valores(array_numeros, tamaño);
		
		entrada.close();

	}

}
