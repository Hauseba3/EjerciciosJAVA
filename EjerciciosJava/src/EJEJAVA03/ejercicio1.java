/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *TABLA DE MULTIPLICAR UTILIZANDO FOR, NUMERO ENTRE 1 Y 10
 *
 */
public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num,resultado;
		
		System.out.println("Introduce un numero del 1 al 10");
		num = entrada.nextInt();
		
		if (num >= 1 && num <= 10) {
			
			System.out.println("La tabla del " + num + " es:");
			for (int i = 1; i <= 10; i++) {
				resultado = num*i;
				System.out.println(num + "x" + i + "= " + resultado);
			}
		
		} else {
			System.out.println("ERROR");
		}
		
		entrada.close();

	}

}
