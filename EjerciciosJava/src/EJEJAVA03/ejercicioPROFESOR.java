/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *PROGRAMA QUE PIDA UN NUMERO DEL 1 AL 10 Y QUE DIGA SI HA ACERTADO O NO
 *Y QUE SIGA INTENTANDOLO HASTA QUE ACIERTE
 *
 */
public class ejercicioPROFESOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num, random;
		
		random = (int) (Math.random()*10) + 1;
		
		System.out.println("Introduce un numero entero del 1 al 10: ");
		num = entrada.nextInt();
		
		if ((num >= 1)&&(num <= 10)) {
		
			while (num!=random) {
				System.out.println("Vuelve a intentarlo!");
				num = entrada.nextInt();
			}
				
		} else {
			System.out.println("ERROR, has introducido mal el numero");
		}
		
		System.out.println("Has acertado!");
		
		entrada.close();
		

	}

}
