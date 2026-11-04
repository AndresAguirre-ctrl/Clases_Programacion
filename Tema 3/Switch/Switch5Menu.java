/*
 * Switch5Menu.java

 */


import java.util.Random;

public class Switch5Menu {
	
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
			while (opcion != 5){
			opcion = random.nextInt(1, 10);
			System.out.println ("la opcion elegida es " + opcion);
				switch (opcion) {
				case 1 -> System.out.println("usted a elegido la opción 1");
				case 2 -> System.out.println("usted a elegido la opción 2");
				case 3 -> System.out.println("usted a elegido la opción 3");
				case 4 -> System.out.println("usted a elegido la opción 4");
				case 5 -> System.out.println("usted a decidido salir");
				default -> System.out.println("usted a elegido una opción invalida");
			}
		}
	}
}	

