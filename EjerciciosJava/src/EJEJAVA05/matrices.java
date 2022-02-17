/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class matrices {
	
	/**
	 * Funcion que rellena una matriz pidiendo valores por teclado
	 * @param matriz
	 * @param filas
	 * @param columnas
	 */

	public static void pedir_valores(int matriz[][], int filas, int columnas) {
		
		Scanner teclado = new Scanner (System.in);
		
		for(int i=0; i<filas; i++) {
			
			for(int j=0; j<columnas; j++) {
				System.out.printf("Rellena la matriz, posicion (%d,%d): ",i, j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		
	}
	
	/**
	 * Funcion que muestra una matriz
	 * @param matriz
	 * @param filas
	 * @param columnas
	 */

	public static void mostrar_matriz(int matriz[][], int filas, int columnas) {
		
		for (int i = 0; i < filas; i++) {
			for(int j=0; j<columnas; j++) {
				System.out.printf("%3d ", matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	/**
	 * Funcion que inicializa una matriz con un numero que le pasemos
	 * @param matriz
	 * @param filas
	 * @param columnas
	 * @param num
	 */
	public static void inicializar_matriz(int matriz[][], int filas, int columnas, int num) {
		
		for (int i = 0; i < filas; i++) {
			
			for(int j = 0; j < columnas; j++) {
				matriz[i][j] = num;
			}
			
		}
	}
	
}
