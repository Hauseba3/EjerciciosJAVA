/**
 * 
 */
package EJEJAVA03;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double num1, num2, resultado=0;
		int operacion;
		
		do {
		
		System.out.println("Introduce el primer operando:");
		num1 = entrada.nextDouble();
		
		System.out.println("Introduce el segundo operando:");
		num2 = entrada.nextDouble();
		
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplica");
		System.out.println("4 - Divide");
		System.out.println("0 - Salir");
		operacion = entrada.nextInt();
		
		if ((operacion >= 0) && (operacion <=4)) {
			switch (operacion) {
			  case 1:
			    resultado = num1 + num2;
			    System.out.println("El resultado de la operacion es: " + resultado);
			    break;
			  case 2:
			    resultado = num1 - num2;
			    System.out.println("El resultado de la operacion es: " + resultado);
			    break;
			  case 3:
			    resultado = num1 * num2;
			    System.out.println("El resultado de la operacion es: " + resultado);
			    break;
			  case 4:
			    resultado = num1 / num2;
			    System.out.println("El resultado de la operacion es: " + resultado);
			    break;
			  case 0:
				  System.out.println("Adios!");
				break;
			}
			
		}
		else {
			System.out.println("Error, la operacion no existe");
		}
		
		} while (operacion!=0);
		
		entrada.close();
		

	}

}
