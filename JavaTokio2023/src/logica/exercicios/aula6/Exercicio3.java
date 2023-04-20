package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		int num1 = entrada.nextInt();

		System.out.println("Digite a nota 2: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite a nota 3: ");
		int num3 = entrada.nextInt();
		
		System.out.println("Digite a nota 4: ");
		int num4 = entrada.nextInt();
		
		double mediaFinal = (num1 + num2 + num3 + num4);
		
		if (mediaFinal >= 7) {
			System.out.println("aprovado");
		} else if (mediaFinal >= 5 && mediaFinal <7){
			System.out.println("em recuperacao");
		} else if (mediaFinal < 5){
			System.out.println("reprovado");
		}
		
		entrada.close();
		
	}

}
