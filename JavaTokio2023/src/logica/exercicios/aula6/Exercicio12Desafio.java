package logica.exercicios.aula6;

import java.util.Scanner;

public class Exercicio12Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ladoA = sc.nextInt();
		int ladoB = sc.nextInt();
		int ladoC = sc.nextInt();
		
		
		System.out.printf("ladoA: %d \nladoB: %d \nladoC: %d \n\n", ladoA, ladoB, ladoC);
		
		int x = 0;
		
		if (ladoA < ladoB) {
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
		}
		
		System.out.printf("ladoA: %d \nladoB: %d \nladoC: %d \n\n", ladoA, ladoB, ladoC);
		
		if (ladoB < ladoC) {
			x = ladoB;
			ladoB = ladoC;
			ladoC = x;
		}
		
		System.out.printf("ladoA: %d \nladoB: %d \nladoC: %d \n\n", ladoA, ladoB, ladoC);
		
		if (ladoA < ladoB) {
			x = ladoA;
			ladoA = ladoB;
			ladoB = x;
		}
		
		System.out.printf("ladoA: %d \nladoB: %d \nladoC: %d \n\n", ladoA, ladoB, ladoC);
		
		if (ladoA >= (ladoB + ladoC)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((ladoA * ladoA) == (ladoB * ladoB) + (ladoC * ladoC)) {
				System.out.println("TRIANGULO RETANGULO");
				} else if ((ladoA * ladoA) > (ladoB * ladoB) + (ladoC * ladoC)) {
					System.out.println("TRIANGULO OBTUSANGULO");
				} else {
					System.out.println("TRIANGULO ACUTANGULO");
				}
			
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			
			if ((ladoA == ladoB && ladoC != ladoA) || (ladoB == ladoC && ladoA != ladoB)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
			
		}
		
	}

}
