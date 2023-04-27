package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//peça 1

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o nome da peça1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.println("Escolha a quantidade de pecas1: ");
		int qtdPeca1 = Integer.parseInt(entrada.nextLine());
				
				
				
		System.out.println("Digite o valor unitario da peca1: ");
		double valorPeca1 = Double.parseDouble(entrada.nextLine());
		
		
		
		System.out.println(" ");


		//peça 2
		
		System.out.println("Digite o nome da peça2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.println("Escolha a quantidade de pecas2: ");
		int qtdPeca2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o valor unitario da peca2: ");
		double valorPeca2 = Double.parseDouble(entrada.nextLine());
		
		double valorPago1 = qtdPeca1 * valorPeca1;
		double valorPago2 = qtdPeca2 * valorPeca2;
		
		double valorTotal = valorPago1 + valorPago2;
		
		System.out.println("Valor a ser pago pela peca1: " + valorPago1);
		System.out.println("Valor a ser pago pela peca2: " + valorPago2);
		System.out.println("Valor total a ser pago: " + valorTotal);
		
		
		entrada.close();
		
	}

}
