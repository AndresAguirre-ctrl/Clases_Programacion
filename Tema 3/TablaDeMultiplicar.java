/*
 * TablaDeMultiplicar.java
 * 
 * 
 */

import java.util.Random;

public class TablaDeMultiplicar {
	
	public static void main (String[] args) {
		Random random = new Random();
		int multiplicando = random.nextInt(1, 11);
		int multiplicador = 1;
		
		System.out.println("Se realizara la tabla del " + multiplicador + "\n----------------------------");
		
		do{
			System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador++));
			
		}while(multiplicador <= 10);
		
	}
}

