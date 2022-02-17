/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio3 {

	/**
	 * Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual a un número A dado
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int matriz[][];
		int filas, columnas, num, coincide=0;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		System.out.println("Introduce un numero:");
		num = entrada.nextInt();
		
		for (int i = 0; i < filas; i++) {
			
			for(int j=0; j<columnas; j++) {
				
				if(matriz[i][j]==num) {
					coincide = coincide + 1;
				}
			}
		}
		
		System.out.printf("El numero que has introducido se repite un total de %d veces", coincide);
		
		entrada.close();

	}

}
