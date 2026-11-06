/*
 * Arrays1.java
 * 
 */

import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        Random random = new Random(); // Faltaban los paréntesis ()
        int[] enteros = new int[5];
        System.out.printf("Creado array de enteros de tamaño %d%n", enteros.length);
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.printf("Posición %d: %d%n", i, enteros[i]);
        }
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = random.nextInt(1, 11); // Genera números del 1 al 10
        }
        System.out.println("Modificado de forma aleatoria los valores del array");
        for (int i = 0; i < enteros.length; i++) {
            System.out.printf("Posición %d: %d%n", i, enteros[i]);
        }
    }
}


