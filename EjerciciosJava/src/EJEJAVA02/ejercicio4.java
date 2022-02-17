/**
 * 
 */
package EJEJAVA02;
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
		
		int fila1, columna1, fila2, columna2;
		
		System.out.println("Introduce la primera casilla (fila + columna): ");
		fila1 = entrada.nextInt();
		columna1 = entrada.nextInt();
		
		System.out.println("Introduce la segunda casilla (fila + columna): ");
		fila2 = entrada.nextInt();
		columna2 = entrada.nextInt();
		
		if (fila1==fila2) {
			System.out.println("Estan en la misma fila");
		}
		else {
			System.out.println("No estan en la misma fila");
		}
		
		if (columna1==columna2) {
			System.out.println("Estan en la misma columna");
		}
		else {
			System.out.println("No estan en la misma columna");
		}
		
		if ((columna1 - fila1) == (columna2 - fila2) || (columna1 + fila1 == columna2 + fila2) ) {
			System.out.println("Estan en la misma diagonal");
		}
		else {
			System.out.println("No estan en la misma diagonal");
		}
		
		entrada.close();
	}

}
