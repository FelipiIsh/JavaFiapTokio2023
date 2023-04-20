package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento ");
		int num1 = entrada.nextInt();

		double idade = (2023 - num1);
		
		if (idade > 18) {
			System.out.println("obrigatorio");
		} else if (idade >= 16 && idade <= 18){
			System.out.println("opcional");
		} else {
			System.out.println("proibido");
		}
		
		entrada.close();
	}

}
