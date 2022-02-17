/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class HolaMundo {

	/**
	 * procedimiento principal de la funcion
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduce tu nombre: ");
		Scanner entrada = new Scanner (System.in);
		
		String nombre = entrada.nextLine();
		
		int numero;
		
		System.out.println("Introduce un numero: ");
		numero = entrada.nextInt();
		
		System.out.println("Tu nombre es: " + nombre + " y el numero elegido es: " + numero);
		
		entrada.close();

	}

}
