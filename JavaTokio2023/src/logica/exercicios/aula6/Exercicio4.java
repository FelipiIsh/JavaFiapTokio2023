package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		System.out.println("Digite o numero 1: ");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o numero 2: ");
		int num2 = entrada.nextInt();
		
		int num3 = (num1%num2);
		int num4 = (num2%num1);
						
		if (num3 == 0 || num4 == 0) {
			System.out.println("Sao multiplos");
		} 
		else {
			System.out.println("nao sao multiplos");
		}
		
		entrada.close();
		
	}

}
