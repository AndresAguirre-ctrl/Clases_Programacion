/*
 * MetodosUno.java
 */

import java.util.Random;
public class MetodosUno {
	static Random random = new Random();
	public static void main (String[] args) {
	
		for (int i = 1; i <= 100; i++){
		int aleatorio = obtenerAleatorioEntreRango(1, 11);
		//System.out.println("El número aleatorio numero " + i + " es " + aleatorio);
		System.out.printf("El número aleatorio %3d es %2d%n", i, aleatorio);
		}
	}
	private static int obtenerAleatorioEntreRango (int min, int max) {
		//Random random = new Random();
		return random.nextInt(min, max);
	}
}

