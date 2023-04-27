package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio1 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia, Felipi");
		} if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde, Felipi");
		} if (hora <= 18 && hora <= 6) {
			System.out.println("Boa noite, Felipi");
		}
	}

}
