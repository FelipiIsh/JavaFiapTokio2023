package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a distancia total: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o total de combustivel gasto: ");
		int num2 = entrada.nextInt();
		
		double consumoMed = (num1/num2);
		
		System.out.println("seu consumo medio e: " + consumoMed + "km/Litro");
		
		if (consumoMed < 8) {
			System.out.println("Esse carro bebe em!");
		} else {
			System.out.println("autonomia legal!");
		}
		
		entrada.close();
		
	}

}
