package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	//METODOS SEM RETORNO COM ARGUMETNOS/PARAMETROS
	//
	static void saudacaoComArgs(String nome, int idade) {
		
		if (idade >= 18) {
			System.out.printf("Ola, %s! Voce tem %d anos e eh maior de idade", nome, idade);
		} else {
			System.out.printf("Ola, %s! Voce tem %d anos e eh menor de idade", nome, idade);
		}
	}
	
	
	static void somar(int numA, int numB) {
		System.out.println("Soma: " +(numA + numB));
	}
	

	public static void main(String[] args) {
		
		//SOMAR 2 NUMEROS
		somar(3, 9);
		
		
		/*
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idadeDigitada = sc.nextInt();

		saudacaoComArgs(nomeDigitado, idadeDigitada);
		
		sc.close();
		*/
		
	}

}
