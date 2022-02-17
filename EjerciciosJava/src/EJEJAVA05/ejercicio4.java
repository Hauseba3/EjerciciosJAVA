/**
 * 
 */
package EJEJAVA05;
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
		
		int matriz[][];
		int filas, columnas;
		boolean superior = true;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		for(int i=0; i<filas&&superior; i++) {
			
			for(int j=0; j<columnas; j++) {
				
				if(i>j) {
					if(matriz[i][j]!=0) {
						superior = false;
					}
				}				
			}
		}
		
		if(superior) {
			System.out.println("La matriz es triangular superior");
		} else {
			System.out.println("La matriz no es triangular superior");
		}
		
		entrada.close();

	}

}
