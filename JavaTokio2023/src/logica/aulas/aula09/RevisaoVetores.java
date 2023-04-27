package logica.aulas.aula09;

public class RevisaoVetores {

	public static void main(String[] args) {

		int[] numeros = {10, 20, 5, 3};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos %d -- Valor: %d\n", i, numeros[i]);
		}
		
		//for um poucquinho diferente.....
		
		for (int num: numeros) {
			System.out.println(num);
		}
		
		
		
		
		
	}

}
