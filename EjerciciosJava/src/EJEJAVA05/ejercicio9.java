/**
 * 
 */
package EJEJAVA05;
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
		
		int matriz[][], matrizTraspuesta[][];
		int filas, columnas;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		System.out.println("Introduce los valores para rellenar la Matriz 1:");
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrizTraspuesta = new int[columnas][filas];
		
		for (int i = 0; i < filas; i++) {
			for(int f = 0; f < columnas; f++) {
				matrizTraspuesta[f][i] = matriz[i][f];
			}
		}
		
		System.out.println("La matriz traspuesta es: ");
		matrices.mostrar_matriz(matrizTraspuesta, columnas, filas);
		
		entrada.close();

	}

}
