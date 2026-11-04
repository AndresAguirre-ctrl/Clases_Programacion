/*
 * Switch4Menu.java
 */


import java.util.Random;

public class Switch4Menu {
	
	public static void main (String[] args) {
		Random random = new Random();

		String menu = """
		
		1. Opción 1
		2. Opción 2
		3. Opción 3
		4. Opción 4
		5. Salir """;
		System.out.println ("Elija una de las siguientes opciones " + menu);
		int opcion = -1;
			do{
			opcion = random.nextInt(1, 10);
		
				switch (opcion) {
				case 1 -> System.out.println("\nusted a elegido la opción 1");
				case 2 -> System.out.println("\nusted a elegido la opción 2");
				case 3 -> System.out.println("\nusted a elegido la opción 3");
				case 4 -> System.out.println("\nusted a elegido la opción 4");
				case 5 -> System.out.println("\nusted a decidido salir");
				default -> System.out.println("\nusted a elegido una opción invalida");
			}
		}while (opcion != 5);
	}
}	
		
	


		
	




