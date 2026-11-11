/*
 * Lista1.java
 * 
 * 
 */

import java.util.List;
import java.util.ArrayList;

public class Lista1 {
	
	public static void main (String[] args) {
		String[] arrayCadenas = new String[3];
		List<String> listaCadenas = new ArrayList();
		arrayCadenas[0] = "Hola";
		arrayCadenas[1] = "Hello";
		arrayCadenas[2] = "Olá";
		listaCadenas.add("Español");
		listaCadenas.add("Ingles");
		listaCadenas.add("Portugués");
		listaCadenas.add("Aleman");
		
		System.out.printf("En %s, se saluda en %s%n", listaCadenas.get(0), arrayCadenas[0]);
		System.out.printf("En %s, se saluda en %s%n", listaCadenas.get(1), arrayCadenas[1]);
		System.out.printf("En %s, se saluda en %s%n", listaCadenas.get(2), arrayCadenas[2]);
		System.out.printf("En %s, se saluda en %s%n", listaCadenas.get(3), arrayCadenas[3]);
	}
}

