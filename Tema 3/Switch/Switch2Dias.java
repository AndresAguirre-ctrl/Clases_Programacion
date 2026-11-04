/*
 * Switch2Dias.java
 * 
 */


import java.util.Random;
import java.time.LocalDate;

public class Switch2Dias {
	
	public static void main (String[] args) {
		Random random = new Random();
		
		int aleatorio = random.nextInt(1, 1001);
		int diaSemana = LocalDate.now().getDayOfWeek().getValue() - 1;
		System.out.println("Día de la semana (0-6): " + diaSemana);
		
		int dia =(diaSemana + aleatorio) % 7;
		
		switch (dia){
			case 0, 1:
				System.out.println("Dentro de " + aleatorio + " será principio de semana");
				break;
			case 2, 3, 4:
				System.out.println("Dentro de " + aleatorio + " será entre semana");
				break;
			default:
				System.out.println("Dentro de " + aleatorio + " será fin de semana");

		}
	}
}
