/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vector1[], vector2[], vector_suma[];
		int tamaño, tamaño2;
		
		System.out.println("Introduce el tamaño del primer vector");
		tamaño = entrada.nextInt();
		vector1 = new int[tamaño];
		Vectores.pedir_valores(vector1, tamaño);
		
		System.out.println("Introduce el tamaño del segundo vector");
		tamaño2 = entrada.nextInt();
		vector2 = new int[tamaño2];	
		Vectores.pedir_valores(vector2, tamaño2);
		
		vector_suma = new int[tamaño+tamaño2];
		for(int i=0; i<vector1.length;i++)
		  	vector_suma[i] = vector1[i];
		  
		for(int i=0; i<vector2.length;i++)
		  	vector_suma[tamaño+i] = vector2[i];
		
		//OTRA FORMA DE HACERLO
		/*vector_suma = new int[tamaño+tamaño2];
		int x = 0;
		for (int i = 0; i < vector_suma.length; i++) {
			
			if(tamaño>i) {
				vector_suma[i] = vector1[i];
			} else {
				vector_suma[i] = vector2[x];
				x++;
			}
		}*/
		
		Vectores.mostrar_valores(vector_suma, tamaño2);
		
		entrada.close();

	}

}
