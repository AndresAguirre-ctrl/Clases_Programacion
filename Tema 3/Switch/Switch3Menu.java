/*
 * Switch3Dias.java
 * 
 * Copyright 2026 Matinal <matinal@pc01-aula1.7>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */



import java.util.Random;

public class Switch3Menu {
	
	public static void main (String[] args) {
		Random random = new Random();

		String menu = """
		
		1. Opción 1
		2. Opción 2
		3. Opción 3
		4. Opción 4
		5. Salir """;
		System.out.println ("Elija una de las siguientes opciones " + menu);
		
		int opcion = random.nextInt(1, 10);
		
		switch (opcion){
			case 1 -> System.out.println("\nusted a elegido la opción 1");
			case 2 -> System.out.println("\nusted a elegido la opción 2");
			case 3 -> System.out.println("\nusted a elegido la opción 3");
			case 4 -> System.out.println("\nusted a elegido la opción 4");
			case 5 -> System.out.println("\nusted a decidido salir");
			default -> System.out.println("\nusted a elegido una opción invalida");
		}
	}
}
