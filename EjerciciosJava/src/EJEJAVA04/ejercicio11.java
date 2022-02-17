/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vector1[], vector2[], vector_suma[];
		int tamaño;
		
		System.out.println("Introduce el tamaño de los vectores que quieres sumar");
		tamaño = entrada.nextInt();
		
		System.out.println("Valores del primer vector");
		vector1 = new int[tamaño];
		Vectores.pedir_valores(vector1, tamaño);
		
		System.out.println("Valores del segundo vector");
		vector2 = new int[tamaño];	
		Vectores.pedir_valores(vector2, tamaño);
		
		vector_suma = new int[tamaño];
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i] = vector1[i]+vector2[i];
		}
		
		Vectores.mostrar_valores(vector_suma, tamaño);
		
		entrada.close();

	}

}
