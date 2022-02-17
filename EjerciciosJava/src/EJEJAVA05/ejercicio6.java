/**
 * 
 */
package EJEJAVA05;
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
		
		int matriz[][];
		int filas, columnas;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		int mayor=matriz[0][0];
		
		for(int i=0; i<filas; i++) {			
			for(int j=0; j<columnas; j++) {
				
				if(matriz[i][j]>mayor) {
					mayor = matriz[i][j];
				}
			}	
		}
		
		System.out.printf("El valor mas alto de la matriz es %d", mayor);
		
		entrada.close();
		

	}

}
