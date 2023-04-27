package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio2 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int dia = c.get(Calendar.DAY_OF_WEEK);
		
		if (dia == 3) {
			System.out.println("Tera feira de rua");
		}
	}

}
