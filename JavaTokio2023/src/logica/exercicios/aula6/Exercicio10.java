package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o salario: ");
		double salario = entrada.nextDouble();
		
		if (salario <= 280) {
			double porcentagem = 0.2;
			double valorAumento = salario*0.2;
			double aumento = ((salario*0.2) + salario); 
			System.out.println("O salário antes do reajuste e: " + salario);
			System.out.println("O percentual de aumento aplicado e: " + porcentagem);
			System.out.println("O valor do aumento e: " + valorAumento);
			System.out.println("O novo salário, após o aumento e: " + aumento);
		} else if (salario > 280 && salario <=700) {
			double porcentagem = 0.15;
			double valorAumento = salario*0.15;
			double aumento = ((salario*0.15) + salario);
			System.out.println("O salário antes do reajuste e: " + salario);
			System.out.println("O percentual de aumento aplicado e: " + porcentagem);
			System.out.println("O valor do aumento e: " + valorAumento);
			System.out.println("O novo salário, após o aumento e: " + aumento);
		} else if (salario > 700 && salario <=1500) {
			double porcentagem = 0.1;
			double valorAumento = salario*0.1;
			double aumento = ((salario*0.1) + salario);
			System.out.println("O salário antes do reajuste e: " + salario);
			System.out.println("O percentual de aumento aplicado e: " + porcentagem);
			System.out.println("O valor do aumento e: " + valorAumento);
			System.out.println("O novo salário, após o aumento e: " + aumento);
		} else if (salario > 1500) {
			double porcentagem = 0.05;
			double valorAumento = salario*0.05;
			double aumento = ((salario*0.05) + salario);
			System.out.println("O salário antes do reajuste e: " + salario);
			System.out.println("O percentual de aumento aplicado e: " + porcentagem);
			System.out.println("O valor do aumento e: " + valorAumento);
			System.out.println("O novo salário, após o aumento e: " + aumento);
		}
		entrada.close();
		
		
		
		
	}

}
