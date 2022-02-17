/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int año, dia, mes, suerte;
		
		System.out.println("Introduce tu año de nacimiento: ");
		Scanner entrada = new Scanner (System.in);
		año = entrada.nextInt();
		
		System.out.println("Introduce el mes de nacimiento: ");
		Scanner entrada2 = new Scanner (System.in);
		mes = entrada2.nextInt();
		
		System.out.println("Introduce tu dia de nacimiento: ");
		Scanner entrada3 = new Scanner (System.in);
		dia = entrada3.nextInt();
		
		suerte = año+mes+dia;
		
		System.out.println("Tu numero de la suerte es: " + ((suerte/1000)+((suerte/100)%10)+((suerte/10)%10)+(suerte%10)));
		
		entrada.close();
		entrada2.close();
		entrada3.close();

	}

}
