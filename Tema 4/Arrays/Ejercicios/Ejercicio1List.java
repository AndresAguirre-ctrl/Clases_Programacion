/*
 * Ejercicio1List.java
 * 
 * 
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio1List {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] arrayCadenas = new String[7];
		List<Double> temperaturas = new ArrayList();
		
		arrayCadenas[0] = "Lunes";
		arrayCadenas[1] = "Martes";
		arrayCadenas[2] = "Miercoles";
		arrayCadenas[3] = "Jueves";
		arrayCadenas[4] = "Viernes";
		arrayCadenas[5] = "Sabado";
		arrayCadenas[6] = "Domingo";
		
		for (int i = 0; i < arrayCadenas.length; i++){
			System.out.printf("Ingresa la temperatura del %s: ", arrayCadenas[i]);
			temperaturas.add(scanner.nextDouble());
		}
		
		double maximo = temperaturas.get(0);
		double minimo = temperaturas.get(0);
		double suma = 0;
		for (int i = 0; i < temperaturas.size(); i++){
			System.out.printf("Las temperatura del %S es %.2f%n", arrayCadenas[i], temperaturas.get(i));
			suma += temperaturas.get(i);
		}
		
		double media = suma / temperaturas.size();
		
		System.out.printf("La temperatura media de la semana ha sido de: %.2f%n", media);
		
		for (double temperatura: temperaturas){
			if (temperatura > maximo)
			maximo = temperatura;
			if (temperatura < minimo)
			minimo = temperatura;
		}
		System.out.printf("La temperatura max %.2f y la min %.2f%n", maximo, minimo);
		
		int diasSuperanMedia = 0;
		
		for (double temperatura: temperaturas){
			if (temperatura > media)
			diasSuperanMedia++;
		}
		System.out.printf("los dias que superan la media han sido %d%n", diasSuperanMedia);
		System.out.println("Introduce la temperatura a buscar");
		double temperaturaBuscar = scanner.nextDouble();
		boolean encontrado = false;
		
		for (int i = 0; i < temperaturas.size(); i++) {
			if (temperaturas.get(i) == temperaturaBuscar) {
			encontrado = true;
			System.out.printf("La temperatura %.2f se alcanzó el día %s%n", temperaturas.get(i), arrayCadenas[i]);
			}
		}
			String mensaje = encontrado ? "Si esta esa temperatura" : "No esta esa temperatura";
			System.out.print(mensaje);
		scanner.close();
		
	} 
}

	

