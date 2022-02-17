/**
 * 
 */
package EJEJAVA02;
import java.util.Scanner;
/**
 * @author Jose
 *
 *
 */
public class ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float num1, num2, num3, resultado;
		resultado = 0;
		
		System.out.println("Introduce 3 numeros float: ");
		num1 = entrada.nextFloat();
		num2 = entrada.nextFloat();
		num3 = entrada.nextFloat();
		
		if ((num1 > num2)&&(num1 > num3)){
			if (num2 > num3) {
				resultado = num3;
			}
			else {
				resultado = num2;
			}
		}
		
		if ((num2 > num1)&&(num2 > num3)){
			if (num1 > num3) {
				resultado = num3;
			}
			else {
				resultado = num1;
			}
		}
		
		if ((num3 > num2)&&(num3 > num1)){
			if (num2 > num1) {
				resultado = num1;
			}
			else {
				resultado = num2;
			}
		}
		
		System.out.println("El numero intermedio es: " + resultado);
		
		entrada.close();

	}

}
