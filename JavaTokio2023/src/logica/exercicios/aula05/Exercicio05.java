package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
	    double B = sc.nextDouble();
	    
		double media = (A*0.4) + (B*0.6);
	    
		System.out.println(media);
		
		
		sc.close();
	}

}
