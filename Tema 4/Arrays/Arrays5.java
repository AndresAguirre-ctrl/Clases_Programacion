/*
 * Arrays5.java
 * Uso del bucle mejorado
 */
public class Arrays5 {

    public static void main(String[] args) {
        float[] numeros = {1.2f, 1.3f, 1.4f, 1.5f};

        // Forma clásica, interesante para inicializar valores y saber posición
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("===================");

        // Otra forma de recorrerlo
        for (float numero : numeros) {
            System.out.println(numero);
        }

        // Calcular el valor medio, usando un bucle mejorado (enhanced)
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }
        float media = suma / numeros.length;
        System.out.printf("La media de valores es: %.2f%n", media);

        // Calculamos el valor máximo y el valor mínimo
        float maximo = numeros[0];
        float minimo = numeros[0];

        for (float numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.printf("El valor máximo es: %.2f%n", maximo);
        System.out.printf("El valor mínimo es: %.2f%n", minimo);
    }
}

