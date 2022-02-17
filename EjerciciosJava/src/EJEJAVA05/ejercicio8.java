/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int matriz[][];
		int filas, columnas;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		int determinante;
		determinante = (matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[1][0]*matriz[2][1]*matriz[0][2]);
		System.out.printf("El determinante es: %d", determinante);
		
		entrada.close();

	}

}
