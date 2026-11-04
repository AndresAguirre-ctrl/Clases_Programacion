/*
 * MainBiblioteca.java
 */
 
 
import java.util.Random;

public class MainBiblioteca {
	
	public static void main (String[] args) {
		
		Random random = new Random();
		
		int numero1 = random.nextInt(100);
		int numero2 = random.nextInt(100);
		int numero3 = random.nextInt(100);
		
		int minimo = BibliotecaMatematica.obtenerMinimoDeTres (numero1, numero2, numero3);
		
		System.out.printf("Los números aleatorios obtenidos son %d, %d, %d.%nSu número minimo es %d.%n", numero1, numero2, numero3, minimo);
		
		boolean primo1 = BibliotecaMatematica.esPrimo (numero1);
		boolean primo2 = BibliotecaMatematica.esPrimo (numero2);
		boolean primo3 = BibliotecaMatematica.esPrimo (numero3);
		
		String mensaje1 = primo1 ? "es primo" : "no es primo";
		String mensaje2 = primo2 ? "es primo" : "no es primo";
		String mensaje3 = primo3 ? "es primo" : "no es primo";
		
		System.out.printf("El número %d %s.%nEl número %d %s.%nEl número %d %s.", numero1, mensaje1, numero2, mensaje2, numero3, mensaje3);
	}
}

