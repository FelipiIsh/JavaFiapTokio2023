package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		int i = 1;
		
		do {
		System.out.print("Digite o numero 1: ");
		n1 = sc.nextInt();
		} while(i == 0);
		
		do {
			System.out.print("Digite o numero 2: ");
			n2 = sc.nextInt();
			} while(i == 0);
		
		do {
			System.out.print("Digite o numero 3: ");
			n3 = sc.nextInt();
			} while(i == 0);
		
if (n3 > n2) {
	System.out.println(n3);
} else if (n2 > n3) {
	System.out.println(n2);
} else if (n1 > n3) {
	System.out.println(n1);
} else if (n1 < n3) {
	System.out.println(n3);
} else if (n1 > n2) {
	System.out.println(n1);
} else if (n1 < n2) {
	System.out.println(n2);
}


				
		
	}

}
