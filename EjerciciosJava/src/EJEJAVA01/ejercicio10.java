/**
 * 
 */
package EJEJAVA01;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double precio, importe, devolver;
		
		System.out.println("Introduce el precio del articulo: ");
		Scanner entrada = new Scanner (System.in);
		precio = entrada.nextDouble();
		
		System.out.println("Introduce el importe introducido: ");
		Scanner entrada2 = new Scanner (System.in);
		importe = entrada2.nextDouble();
		
		devolver = precio - importe;
		
		System.out.println("El cambio debe ser: " + devolver);
		
		entrada.close();
		entrada2.close();
	}

}
