/*
 * SegundoBucle.java
 * 
 * 
 */

import java.util.Random;

public class SegundoBucle {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int valorRandom = random.nextInt(0, 5);
		int contador = 0;
		
		System.out.println("Has obtenido " + valorRandom + " como número aleatorio");
		
		do {
			System.out.println(++contador + ". dentro del bucle.");
		} while(contador < valorRandom);
		
	}
}

