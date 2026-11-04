/*
 * SeptimoBucle.java
 * 
 * 
 */

import java.util.Random;

public class SeptimoBucle {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int aleatorio = random.nextInt(1, 10001);
			for(int i = 1; i < 10001; i++){
			System.out.println("Contando..." + i);
				if (i == aleatorio){
				System.out.println("El número aleatorio adivinado es " + i);
				break;
			}
		}
	}
}
	

