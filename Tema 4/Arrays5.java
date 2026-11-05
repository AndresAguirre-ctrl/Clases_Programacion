/*
 * Arrays5.java
 * Uso del bucle mejorado
 */


public class Arrays5 {
	
	public static void main (String[] args) {
		
		float[] numeros = {1.2f, 1.3f, 1.4f, 1.5f};
		//forma clásica, interesante para inicializar valores y saber posición
		for (int i = 0; i < numeros.length; i++)
			System.out.println(numeros[i]);
		System.out.println("===================");
		for (float numero : numeros)
			System.out.println(numero);
		//calcular el valor medio, usando un bucle mejorado (enhaced)
		//calculamos el valor máximo y el valor mínimo
		
	}
}
