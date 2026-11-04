public class CalculoTiempoGravedad {
	
	public static void main (String[] args) {
		
		var altura = 1;
		final double gravedad = 9.8;
		var caida = 2.5f;
		System.out.println("Donde " + altura + " de altura y la aceleración de la gravedad es " + gravedad + " el tiempo de caida es " + Math.sqrt(2 * altura / gravedad) + " segundos");
		System.out.println("Donde " + caida + " de altura y la aceleración de la gravedad es " + gravedad + " el tiempo de caida es " + Math.sqrt(2 * caida / gravedad) + " segundos");
		
	}
}

