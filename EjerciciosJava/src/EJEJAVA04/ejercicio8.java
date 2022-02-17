/**
 * 
 */
package EJEJAVA04;
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
		
		int array_numeros [], nuevo_vector[];
		int tamaño;
		boolean capicua = true;
		
		System.out.println("Introduce la cantidad de posiciones que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		nuevo_vector = new int[tamaño];
		
		Vectores.pedir_valores(array_numeros, tamaño);
		
		/*
		 * for(int i=0,j=vector.length-1; i<vector.length-1;i++,j--)
		 * 		if(vector[i]!=vector[j]) NO ES CAPICUA CAPICUA=FALSE
		 */
			
		for (int i = 0; i < nuevo_vector.length; i++) {
			nuevo_vector[i] = array_numeros[(array_numeros.length-1)-i];
		} 
			
		for (int i = 0; i < nuevo_vector.length && capicua; i++) {
			
			if(array_numeros[i] != nuevo_vector[i]) {
					capicua = false;
			}
			
		}
			
		if(capicua) {
			System.out.println("El vector es capicua");
		} else {
			System.out.println("El vector no es capicua");
		}
		
		entrada.close();
	}

}
