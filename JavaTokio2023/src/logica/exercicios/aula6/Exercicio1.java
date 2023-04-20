package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("O numero e par");
		} else {
			System.out.println("O numero e impar");
		}
		
		entrada.close();
		
	}

}
