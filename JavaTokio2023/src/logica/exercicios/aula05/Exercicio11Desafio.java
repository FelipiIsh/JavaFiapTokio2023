package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seus dias vividos: ");
		
		int IdadeEmDias = sc.nextInt();
		
		int anos = (int) IdadeEmDias / 365;
		System.out.println("Idade em anos: " + anos);
		
		int restoDias = IdadeEmDias % 365;
			
		int meses = (int) restoDias / 30;
		System.out.println("Idade em meses: " + meses);

		int dias = restoDias % 30;
		System.out.println("Idade em dias: " + dias);
		
		
		
		sc.close();
	}

}
