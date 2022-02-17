/**
 * 
 */
package EJEJAVA06;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio04 {

	/**
	 * Repite el ejercicio anterior pero usando indexOf.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena = new String();
		String letra;
		
		System.out.println("Introduzca una frase:");
		cadena = entrada.nextLine();
		System.out.println("Introduce un caracter:");
		letra = entrada.nextLine();
		
		//me devuelve una posicion en la que se encuentra la letra
		//si no encuentra la letra devuelve -1
		int pos = cadena.indexOf(letra);
		//bucle que se repite mientras la posicion sea distinta de -1
		do {
			 if (pos!=-1) {
				 System.out.println("la letra esta en la posición "+pos);
				 pos = cadena.indexOf(letra, pos+1);//vuelve a buscar la letra en la cadena a partir de la siguiente posicion
			 }
		} while (pos!=-1);
		
		if(pos==-1) {
			System.out.println("No se encuentra el caracter en la frase");
		}
		
		entrada.close();

	}

}
