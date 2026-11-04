/*
 * TablaDeMultiplicarFor.java
 * 
 * 
 */

import java.util.Random;

public class TablaDeMultiplicarFor {
	
	public static void main (String[] args) {
		Random random = new Random();
		int multiplicador = random.nextInt(1, 11);
		
		System.out.println("Se realizara la tabla del " + multiplicador + "\n----------------------------");
		
		for (int i = 1; i <=10; i++)
			System.out.println(multiplicador + " x " + i + " = " + (i * multiplicador));
		
	}
}
