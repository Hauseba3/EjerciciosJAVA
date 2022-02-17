/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio2 {

	/**
	 * Programa que nos dice si todos los elementos de la matriz son cero o no
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		boolean escero = true;
		
		int matriz[][];
		int filas, columnas;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		for (int i = 0; i < filas&&escero; i++) {
			
			for(int j=0; j<columnas&&escero; j++) {
				
				if(matriz[i][j]!=0) {
					escero = false;
				}
			}
		}
		
		if(escero) {
			System.out.println("Todos los numeros de la matriz son 0");
		} else {
			System.out.println("Algun valor de la matriz es distinto de 0");
		}
		
		entrada.close();

	}

}
