package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double reais = sc.nextDouble();
		double dolarAmericano = reais * 0.2;
		
		System.out.println(dolarAmericano);
		
		double euro = reais * 0.2;
		
		System.out.println(euro);
		
		
		
		
		sc.close();
		
	}

}
