package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o preco do produto 1: ");
		int preco1 = entrada.nextInt();
		
		System.out.println("Digite o valor pago: ");
		int pago = entrada.nextInt();
		
		System.out.println(pago - preco1);
		
		
		
		entrada.close();
	}

}
