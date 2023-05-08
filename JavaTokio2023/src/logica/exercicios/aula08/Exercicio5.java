package logica.exercicios.aula08;

public class Exercicio5 {

	public static void main(String[] args) {

		
		
		int min = 5;
		int max = 50;
		int soma = 0;				
		for (int i = 0; i <= 10; i++) {
		
		int numSorteado = (int) (min + Math.random() * (max - min));
		
		System.out.println(i + numSorteado);
		
		soma = soma + numSorteado;
		}
		
		
		System.out.println("A soma e: " + soma);		
		
	}

}
