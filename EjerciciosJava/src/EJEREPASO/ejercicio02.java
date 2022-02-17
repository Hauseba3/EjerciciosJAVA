/**
 * 
 */
package EJEREPASO;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class ejercicio02 {

	/**
	 * Pide una matriz y comprueba si es dispersa. (Todas las filas y columnas contienen al menos un elemento nulo)
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int matriz[][], filas, columnas;
		
		System.out.println("Introduce filas y columnas de tu matriz:");
		filas = entrada.nextInt();
		columnas = entrada.nextInt();
		matriz = new int [filas][columnas];
		
		//FORMAR LA MATRIZ
		for (int i = 0; i < filas; i++) {		
			for (int j = 0; j < columnas; j++) {
				System.out.printf("Introduce el elemento de la fila %d y la columna %d: ", i, j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		//MOSTRAR LA MATRIZ
		System.out.println("La matriz resultante es:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
		
		//COMPROBAR EL NUMERO DE CEROS DE LA MATRIZ
		int elementos=0, ceros=0;
		elementos = filas*columnas;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if(matriz[i][j]==0) {
					ceros++;
				}
			}
		}
		
		if(ceros > (elementos/2)) {
			System.out.println("La matriz es dispersa");
		} else {
			System.out.println("La matriz no es dispersa");
		}
		entrada.close();

	}

}
