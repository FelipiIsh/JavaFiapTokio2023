package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		int i = 0;
		
		while (i <= n*25) {
			System.out.println(n*(0+i));
			i++;
		}
		
		
		
		sc.close();
	}

}
