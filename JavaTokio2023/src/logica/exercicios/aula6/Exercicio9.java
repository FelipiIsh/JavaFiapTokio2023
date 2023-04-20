package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor KW/H: ");
		double valor = entrada.nextDouble();
		
		System.out.println("Digite a quantidade KW/H ");
		int numero = entrada.nextInt();
		
		System.out.println("o preco total e: " + numero*valor);
		
		entrada.close();
		
		
	}

}
