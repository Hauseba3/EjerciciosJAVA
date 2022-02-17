/**
 * 
 */
package EJEJAVA06;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio02 {

	/**
	 * IGUAL QUE EL ANTERIOR PERO SIN IMPORTAR QUE SEA MAYUSCULA O MINUSCULA
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		
		System.out.println("Introduzca una cadena de caracteres:");
		cadena = entrada.nextLine();
		
		char primerCaracter = cadena.charAt(0);
		String cadena2 = Character.toString(primerCaracter);
		
		if(cadena2.equalsIgnoreCase("H")) {
			System.out.println("Comienza por la letra H");
		} else {
			System.out.println("No comienza por la letra H");
		}
		
		entrada.close();

	}

}
