/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio7 {

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
		
		int menor=matriz[0][0];
		
		for(int i=0; i<filas; i++) {			
			for(int j=0; j<columnas; j++) {
				
				if(menor>matriz[i][j]) {
					menor = matriz[i][j];
				}
			}	
		}
		
		System.out.printf("El valor mas bajo de la matriz es %d", menor);
		
		entrada.close();
		

	}

}
