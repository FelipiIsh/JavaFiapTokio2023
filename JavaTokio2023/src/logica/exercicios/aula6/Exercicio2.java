package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		System.out.println("Digite o numero 1: ");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o numero 2: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num1){
			System.out.println(num2);
		} else {
			System.out.println("o número e igual");
		}
		
		entrada.close();
		
	}

}
