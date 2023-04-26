package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, n5;
		int i = 1;
		
		do {
		System.out.print("Digite o numero 1: ");
		n1 = sc.nextDouble();
		} while(i == 0);
		
		do {
			System.out.print("Digite o numero 2: ");
			n2 = sc.nextDouble();
			} while(i == 0);
		
		do {
			System.out.print("Digite o numero 3: ");
			n3 = sc.nextDouble();
			} while(i == 0);
		
		do {
			System.out.print("Digite o numero 4: ");
			n4 = sc.nextDouble();
			} while(i == 0);
		
		do {
			System.out.print("Digite o numero 5: ");
			n5 = sc.nextDouble();
			} while(i == 0);
		
		double soma = (n1 + n2 + n3 + n4 + n5);
		System.out.println(soma);
		
		sc.close();
		
	}
//
}
