/**
 * 
 */
package EJEJAVA02;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double num1, num2, resultado=0;
		int operacion;
		
		System.out.println("Introduce el primer operando:");
		num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo operando:");
		num2 = entrada.nextDouble();
		
		System.out.println("Pulse 1 para sumar, 2 para restar, 3 para multiplicar y 4 para dividir");
		operacion = entrada.nextInt();
		
		if ((operacion >= 1) && (operacion <=4)) {
			switch (operacion) {
			  case 1:
			    resultado = num1 + num2;
			    break;
			  case 2:
			    resultado = num1 - num2;
			    break;
			  case 3:
			    resultado = num1 * num2;
			    break;
			  case 4:
			    resultado = num1 / num2;
			    break;
			}
			System.out.println("El resultado de la operacion es: " + resultado);
		}
		else {
			System.out.println("Error, la operacion no existe");
		}
		
		entrada.close();

	}
}
