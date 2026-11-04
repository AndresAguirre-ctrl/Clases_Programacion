/*
 * SegundoIF.java
 * 
 * Programa que nos dice si un numero es mayor o menor que otro
 * 
 */

import java.util.Random;

public class SegundoIF {
	
	public static void main (String[] args) {
		
		Random random = new Random ();
		int ValorAleatorio = random.nextInt(3);
		System.out.println("El valor aleatorio es " + ValorAleatorio);
		
		if (ValorAleatorio == 0){
			System.out.println("Te ha tocado");
			
		} else if (ValorAleatorio == 1){
			System.out.println("Te ha tocado la mitad");
			
		} else {
			System.out.println("No te ha tocado");
		}
	}
}
