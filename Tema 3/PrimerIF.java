/*
 * PrimerIF.java
 * 
 * Programa que nos dice si un numero es mayor o menor que otro
 * 
 */

import java.util.Random;

public class PrimerIF {
	
	public static void main (String[] args) {
		
		Random random = new Random ();
		boolean ValorAleatorio = random.nextBoolean();
		System.out.println("El valor aleatorio es " + ValorAleatorio);
		if (ValorAleatorio == true){
			System.out.println("Te ha tocado");
		} else {
			System.out.println("No te ha tocado");
		}
	}
}
