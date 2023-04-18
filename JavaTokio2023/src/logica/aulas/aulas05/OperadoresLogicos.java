package logica.aulas.aulas05;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean verificaEmail = true;
		boolean verificaSenha = true;

		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);

		boolean logicaOU = true || false;
		System.out.println(logicaOU);

		boolean negacao = !true;
		System.out.println(negacao);
		System.out.println(" ");
		
		// OPERADORES DE STRINGS
		
		String nome1 = "Joana";
		String nome2 = "Joana";
		String nome3 = new String("Joana");
		
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));
				

	}

}
