package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int anos = sc.nextInt();
		int meses = sc.nextInt();
		int dias = sc.nextInt();
		
		int qtdDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Qtd de dias vividos: " + qtdDias);
				
		sc.close();
	}

}
