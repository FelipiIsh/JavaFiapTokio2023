
package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		
		
		System.out.println("Digite seu gênero: m, f, o, n");
		System.out.println("[ M ] para masculino");
		System.out.println("[ F ] para feminino");
		System.out.println("[ O ] outro");
		System.out.println("[ N ] não responder");
		
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Olá," + nome + " Você escolheu a seguinte opção de gênero: " + genero );
	
	entrada.close();	
		
	}

}
