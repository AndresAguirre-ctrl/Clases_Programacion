/*
 * Switch1Dias.java
 * 
 */

import java.util.Random;
import java.time.LocalDate;

public class Switch1Dias {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		int aleatorio = random.nextInt(1, 1001);
		int diaSemana = LocalDate.now().getDayOfWeek().getValue() - 1;
		System.out.println("Día de la semana (0-6): " + diaSemana);
		
		int dia =(diaSemana + aleatorio) % 7;
		
		switch (dia){
			case 0:
				System.out.println("Dentro de " + aleatorio + " será Lunes");
				break;
			case 1:
				System.out.println("Dentro de " + aleatorio + " será Martes");
				break;
			case 2:
				System.out.println("Dentro de " + aleatorio + " será Miercoles");
				break;
			case 3:
				System.out.println("Dentro de " + aleatorio + " será Jueves");
				break;
			case 4:
				System.out.println("Dentro de " + aleatorio + " será Viernes");
				break;
			case 5:
				System.out.println("Dentro de " + aleatorio + " será Sabado");
				break;
			default:
				System.out.println("Dentro de " + aleatorio + "será Domingo");
		}
	}
}
