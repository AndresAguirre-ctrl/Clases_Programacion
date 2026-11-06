/*
 * Arrays2.java
 * 
 * Copyright 2026 Matinal <matinal@pc01-aula1.7>
 * 
 */

public class Arrays2 {
	
	public static void main (String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5};
		for (int i = 0; i < numeros.length; i++){
			System.out.printf("Posición %d: %d%n", i, numeros[i]); // Corregido 'Syistem'
		}
		numeros [4] = 555;
		for (int i = 0; i < numeros.length; i++){
			System.out.printf("Posición %d: %d%n", i, numeros[i]);
		}
		
		// 1. Definir un array de doubles con valores predefinidos
		double[] decimales = {1.2, 2.2, 3.2, 4.2, 5.2};
		
		// 2. Mostramos en la consola en orden normal
		System.out.println("\n--- Array de doubles (Orden normal) ---");
		for (int i = 0; i < decimales.length; i++){
			System.out.printf("Posición %d: %.1f%n", i, decimales[i]);
		}
		
		// 3. Mostramos en la consola al revés (desde la última posición a la primera)
		System.out.println("\n--- Array de doubles (Orden inverso) ---");
		for (int i = decimales.length - 1; i >= 0; i--){
			System.out.printf("Posición %d: %.1f%n", i, decimales[i]);
		}
	}
}


