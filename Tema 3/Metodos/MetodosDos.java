/*
 * MetodosMaximo .java
 * 
 * 
 */

import java.util.Random;

public class MetodosDos {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		int random1 = random.nextInt(1,101);
		int random2 = random.nextInt(1,101);
		int random3 = random.nextInt(1,101);
		int maximo = obtenerMaximoDeTresEnteros(random1, random2, random3);
		System.out.printf("Los numeros aleatorios son: %d, %d, %d %nSu maximo es: %d%n", random1, random2, random3, maximo);
		
		int ra1 = random.nextInt(1,101);
		int ra2 = random.nextInt(1,101);
		int ra3 = random.nextInt(1,101);
		int max = obtenerMaximoDeTresEnteros(ra1, ra2, ra3);
		System.out.printf("Los numeros aleatorios son: %d, %d, %d %nSu maximo es: %d%n", ra1, ra2, ra3, max);
	}	
	private static int obtenerMaximoDeTresEnteros (int r1, int r2, int r3){
		return Math.max(Math.max(r1,r2),r3);
	
	}
	
}

