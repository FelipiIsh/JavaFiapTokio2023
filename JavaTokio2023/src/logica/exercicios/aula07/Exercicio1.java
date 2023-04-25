package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s, n;

		do {
			System.out.println("Ola Mundo!");
			System.out.println("Deseja receber a mensagem novamente? Digite 1 para sim e 2 para nao");
			s = sc.nextInt();
		} while (s == 1);

		do {
			System.out.println("Fim");

			n = sc.nextInt();
		} while (n == 2);

		sc.close();
		
	}

}
