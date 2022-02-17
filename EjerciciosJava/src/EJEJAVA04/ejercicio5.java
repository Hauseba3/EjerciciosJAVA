/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int array_numeros [];
		int tamaño;
		
		System.out.println("Introduce la cantidad de numeros que quieres que contenga el array:");
		tamaño = entrada.nextInt();
		
		array_numeros = new int[tamaño];
		Vectores.pedir_valores(array_numeros, tamaño);
		
		int aux = array_numeros[array_numeros.length-1];
		
		//PARA HACERLO CON EL MISMO VECTOR
        /*for (int i = array_numeros.length-1; i > 0; i--) {
            array_numeros[i] = array_numeros[i-1];
        }*/
		
		//PARA HACERLO CON DOS VECTORES DISTINTOS
		int nuevo_vector[];
		nuevo_vector = new int [tamaño];
		
		for (int i = 1; i < nuevo_vector.length; i++) {
			nuevo_vector[i] = array_numeros[i-1];
		}
		
        nuevo_vector[0] = aux;
        
        System.out.println("El resultado de rotar el vector es: ");
        Vectores.mostrar_valores(nuevo_vector, tamaño);
		
		entrada.close();
		

	}

}
