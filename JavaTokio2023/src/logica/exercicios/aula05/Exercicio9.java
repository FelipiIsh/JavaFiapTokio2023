package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("Valor digitado: " + num);
		
		int centena = (num/100) * 100;
		System.out.println("Centena = " + centena);
		
		int restoDezena = num - centena;
				
		int dezena = (restoDezena / 10) * 10;
		System.out.println("Dezena = " + restoDezena);
		
		int unidade = restoDezena - dezena;
		System.out.println("Unidade = " + unidade);
		
		
		sc.close();
	}

}
