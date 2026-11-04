/*
 * MetodosTres .java
 * 
 */


public class MetodosTres {
	
	public static void main (String[] args) {
		
		double numero = Math.random()*100;
		double raizcubica = obtenerRaizCubica(numero);
		System.out.printf("El numero aleatorio es %.2f y su raiz es %.2f", numero, raizcubica);
	}	
	private static double obtenerRaizCubica (double n){
		return Math.cbrt(n);
	}
}
