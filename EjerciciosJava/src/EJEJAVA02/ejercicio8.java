/**
 * 
 */
package EJEJAVA02;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double sueldo, tramo1, tramo2, tramo3, tramo4, total = 0,hijos;
		
		System.out.println("Introduce tu sueldo");
		sueldo = entrada.nextDouble();
		System.out.println("Introduce cuantos hijos tienes");
		hijos = entrada.nextDouble();
		
		/*if (hijos > 10) {
			hijos = 10;
		}*/
		
		if (sueldo <= 1000) {
			System.out.println("No tienes que pagar impuestos!");
		} else {
			
			// TRAMO1
			tramo1 = sueldo - 1000;
			if (tramo1 > 600) {
				total = (600*0.05) - (600*(Math.min(0.1,0.01*hijos)));
				tramo2 = tramo1 - 600;
			} else {
				total = (tramo1*0.05) - (tramo1*(Math.min(0.1,0.01*hijos)));
				tramo2 = 0;
			}
			
			//TRAMO2
			if (tramo2 > 1400) {
				total = (1400*0.1) - (1400*(Math.min(0.1,0.01*hijos))) + total;
				tramo3 = tramo2 - 1400;
			} else {
				total = (tramo2*0.1) - (tramo2*(Math.min(0.1,0.01*hijos))) + total;
				tramo3 = 0;
			}
			
			//TRAMO3
			if (tramo3 > 1600) {
				total = (1600*0.15) - (1600*(Math.min(0.1,0.01*hijos))) + total;
				tramo4 = tramo3 - 1600;
			} else {
				total = (tramo3*0.15) - (tramo3*(Math.min(0.1,0.01*hijos))) + total;
				tramo4 = 0;
			}
			
			//TRAMO4
			if (tramo4 > 0) {
				total = (tramo4*0.2) - (tramo4*(Math.min(0.15,0.015*hijos))) + total;	
			} 
			
			System.out.println("El total de impuestos a pagar es: " + total);
			
		}
		
		
		entrada.close();

	}

}
