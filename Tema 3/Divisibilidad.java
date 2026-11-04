/*
 * Divisibilidad.java
 * 
 * 
 */


import java.util.Random;

public class Divisibilidad {
    public static void main(String[] args) {
        long numeroAleatorio = random.nextLongs(1, 10);

        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        if (numeroAleatorio %6  == 0) {
            System.out.println(numeroAleatorio + " SÍ es divisible por 6 (tambien 2 y 3)");
        } else if (numeroAleatorio %3  == 0) {
            System.out.println(numeroAleatorio + " SÍ es divisible por 3");
        } else if (numeroAleatorio %2  == 0) {
            System.out.println(numeroAleatorio + " SÍ es divisible por 2");
        } else {
            System.out.println(numeroAleatorio + " NO es divisible por 2, 3, 6");
         
        }
    }
}


