/*
 * Ejercicio1.java
 * 
 * conversión de millas a kilometros
 */


public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		float millasRecorridas = 100;
		final float MILLAS_POR_KILOMETRO = 1.609f;
		// MILLAS_POR_KILOMETRO = 1.609f; AL SER FINAL, NO SE PUEDE CAMBIAR SU VALOR
		double kilometrosRealizados = (millasRecorridas * MILLAS_POR_KILOMETRO);
		System.out.println(millasRecorridas + " millas es igual a " + kilometrosRealizados + " km");

		double dMillasRecorridas = 100;
		final double dMILLAS_POR_KILOMETRO = 1.609f;
		float fKilometrosRealizados = (float)(dMillasRecorridas * dMILLAS_POR_KILOMETRO);
		System.out.println(dMillasRecorridas + " millas es igual a " + fKilometrosRealizados + " km");
	}
}


