/*
 * Columnas.java
 * 
 * 
 */
import java.util.Scanner;

public class Columnas {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introducir número de columnas");
		int columnas = scanner.nextInt();
		System.out.println("Introducir un número");
		int numero = scanner.nextInt();
		
		for(int i = 1; i<= numero; i++){
			System.out.printf("%5d", i);
			if (i % columnas == 0)
			System.out.printf("%n");
			
		}
	}
}

