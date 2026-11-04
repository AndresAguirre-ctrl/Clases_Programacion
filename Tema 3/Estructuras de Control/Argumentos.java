/*
 * Argumentos.java
 * Ejercicio 2
 */


public class Argumentos {
	
	public static void main (String[] args) {
		System.out.println("El nombre es " + args[0]);
		System.out.println("El apellido es " + args[1]);
		System.out.printf("El nombre completo es %s %s", args[0], args[1]);
	}
}

