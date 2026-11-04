/*
 * PrimerBucle.java
 * 
 * 
 */

import java.util.Random;

public class PrimerBucle {
	
	public static void main (String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt (0,5);
		System.out.println("El número random elegido es " + numeroAleatorio + "\n");
		
		int variable = 0;
		
		while (variable < numeroAleatorio){
			System.out.println(++variable + ". Dentro del bucle\n");

		}
		System.out.println("El número variable es " + variable + "\n");
	}
}

