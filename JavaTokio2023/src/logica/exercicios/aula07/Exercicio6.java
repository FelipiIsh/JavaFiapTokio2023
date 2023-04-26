package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 2; i <= num; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
			
			}
		sc.close();
	
		
	}

}
