/*
 * TestdeDoWhile.java
 */
import java.util.Random;

public class TestdeDoWhile{
	
	public static void main (String[] args) {
		
		Random random = new Random();
		int valorRandom1 = random.nextInt(1, 101);
		int valorRandom2 = random.nextInt(1, 4);
		System.out.println("El número hasta que cuenta es " + valorRandom1);
		System.out.println("Se cuenta de " + valorRandom2 + " en " +  valorRandom2);
		
		for (int i = 0; i < valorRandom1; i += valorRandom2)
			System.out.println(i + 1 + ". dentro del bucle.");
	}
}

