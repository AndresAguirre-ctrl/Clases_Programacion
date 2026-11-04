/*
 * Arrys3.java
 * 
 */

import java.util.Random;

public class Arrys3 {
	
	public static void main (String[] args) {
		
		// 1. Crear un array de char, de 5 valores, inicializados a las vocales
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		
		// 2. Recorremos con un bucle while
		System.out.println("Recorriendo las vocales con un bucle while:");
		int i = 0;
		while (i < vocales.length) {
			System.out.print(vocales[i] + " ");
			i++;
		}
		System.out.println("\n"); // Salto de línea decorativo
		
		// 3. Obtenemos de forma aleatoria una de las cinco vocales
		Random random = new Random();
		// Genera un índice aleatorio entre 0 y 4 (ambos inclusive)
		int indiceAleatorio = random.nextInt(vocales.length); 
		char vocalAleatoria = vocales[indiceAleatorio];
		
		System.out.println("La vocal obtenida de forma aleatoria es: " + vocalAleatoria);
	}
}
