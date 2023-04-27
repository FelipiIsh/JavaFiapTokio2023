package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		System.out.println("Digite um texto qualquer: ");
		
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		
		int ctmaius = 0, ctmin = 0, num = 0, x = 0;
		
		String str = txt;
		int tamanhoStr = str.length();	
		
		for (int i = 0; i < str.length(); i++) {
		
		if ((txt.charAt(i) >= 'A') && (txt.charAt(i) <= 'Z')) {
			ctmaius = ctmaius + 1;
		}
		
		if ((txt.charAt(i) >= 'a') && (txt.charAt(i) <= 'z')) {
			ctmin = ctmin + 1;
			}
		
		if ((txt.charAt(i) >= '0') && (txt.charAt(i) <= '9')){
			num = num + 1;
			}
		
		if ((txt.charAt(i) >= ' ') && (txt.charAt(i) <= ' ')){
			x = x + 1;
			}
		
		System.out.println(ctmaius);
		System.out.println(ctmin);
		System.out.println(num);
		System.out.println(x);
		
	}

	}
}
