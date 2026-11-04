/*
 * MetodosCuatro.java
 * 
 */


import java.util.Random;

public class MetodosCuatro {
	
	public static void main (String[] args) {
		Random random = new Random();
		float numero = (float) Math.random()*25;
		int numeroElevacion = random.nextInt(0, 10);
		float elevacion = elevarDosNumeros (numero, numeroElevacion);
		System.out.printf("El numero elevado sera %.2f y su elevacion sera %d %nSu resultado es %.2f", numero, numeroElevacion, elevacion);
		
	}
	
	private static float elevarDosNumeros (float x, float y){
	return (float)Math.pow(x,y);
	}
}

