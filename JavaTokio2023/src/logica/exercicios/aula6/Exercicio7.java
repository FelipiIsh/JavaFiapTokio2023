package logica.exercicios.aula6;

public class Exercicio7 {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		if ((a <= b && b < d) == true) {
			System.out.println("A e Verdadeiro");
		} else {
			System.out.println("A e falso");
		}
		
		
		if ((a == b || c != b) == true) {
			System.out.println("B e Verdadeiro");
		} else {
			System.out.println("B e falso");
		}
		
		if ((d > a && c >= b) == true) {
			System.out.println("C e Verdadeiro");
		} else {
			System.out.println("C e falso");
		}
		
		if ((a <= b || c <= d) == true) {
			System.out.println("D e Verdadeiro");
		} else {
			System.out.println("D e falso");
		}
		
		if ((b > c || c < a && d <= b) == true) {
			System.out.println("D e Verdadeiro");
		} else {
			System.out.println("D e falso");
		}
		
		
		
		
	}

}
