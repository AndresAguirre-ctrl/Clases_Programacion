/*
 * Scanner.java
 */

import java.util.Scanner;

public class Escaner {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número comprendido entre 1 y 10, inclusives");
		int numero1 = scanner.nextInt();
		System.out.println("Introduce otro número comprendido entre 1 y 10, inclusives");
		int numero2 = scanner.nextInt();
		System.out.printf("Los números introducidos son %d y %d%n", numero1, numero2);
		
		if (numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10){
		System.out.printf("Los valores %d y %d no pueden ser procesados%n", numero1, numero2);
		return;
		}
		System.out.println("Continuando el programa...");
		
		String menu = """
		
		1) Sumar los dos valores
		2) Restar los dos valores
		3) Multiplicar los dos valores
		4) Dividir los dos valores
		5) Salir
		
		Elige una opción entre [1-5]
		""";
		int decision;
		int resultado;
		do{
			System.out.printf(menu);
			decision = scanner.nextInt();
			switch (decision){
				case 1 -> {
					System.out.printf("%nHas elegido la opción 1");
				resultado = numero1 + numero2;
				System.out.printf("La suma de los números %d y %d, tiene por resultado %d", numero1, numero2, resultado);
			}
				case 2 -> {
				System.out.printf("%nHas elegido la opción 2");
				resultado = numero1 - numero2;
				System.out.printf("La resta de los números %d y %d, tiene por resultado %d", numero1, numero2, resultado);
			}
				case 3 -> {
				System.out.printf("%nHas elegido la opción 3");
				resultado = numero1 * numero2;
				System.out.printf("La multiplicación de los números %d y %d, tiene por resultado %d", numero1, numero2, resultado);
			}
				case 4 -> {
				System.out.printf("%nHas elegido la opción 4");
				resultado = numero1 / numero2;
				System.out.printf("La division de los números %d y %d, tiene por resultado %d", numero1, numero2, resultado);
			}
				case 5 -> System.out.printf("%nHas elegido la opción 5");
				default -> System.out.printf("%nLa opción %d introducida es incorrecta", decision);
			}
		}while(decision != 5);	
		System.out.println("%nPrograma finalizado con éxito.");
	}
}

